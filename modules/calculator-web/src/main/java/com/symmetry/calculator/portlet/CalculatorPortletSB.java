package com.symmetry.calculator.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.util.ParamUtil;
import com.symmetry.calculator.Tools.CountManager;
import com.symmetry.calculator.constants.CalculatorPortletKeys;
import com.symmetry.calculator.model.Equ;
import com.symmetry.calculator.models.EquationTest;
import com.symmetry.calculator.service.EquLocalService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.symmetry.calculator.models.EquationTest;

import javax.portlet.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author PiotrRomaniuk
 */
@Component(
        immediate = true,
        property = {
                "com.liferay.portlet.display-category=category.sample",
                "com.liferay.portlet.instanceable=false",
                "com.liferay.portlet.scopeable=true",
                "javax.portlet.display-name=new_calculator_sb",
                "javax.portlet.expiration-cache=0",
                "javax.portlet.name=" + CalculatorPortletKeys.CALCULATORSB,
                "javax.portlet.init-param.template-path=/",
                "javax.portlet.init-param.view-template=/calculatorsb/view.jsp",
                "javax.portlet.resource-bundle=content.Language",
                "javax.portlet.security-role-ref=power-user,user",
                "javax.portlet.supports.mime-type=text/html"
        },
        service = Portlet.class
)
public class CalculatorPortletSB extends MVCPortlet {

    private EquLocalService _equationLocalService;

    public void addEquation(ActionRequest request, ActionResponse response) {

        ServiceContext serviceContext = null;

        try {
            serviceContext = ServiceContextFactory.getInstance(Equ.class.getName(), request);
        } catch (PortalException e) {
            e.printStackTrace();
        }

        long number1 = ParamUtil.getLong(request,"number1");
        long number2 = ParamUtil.getLong(request,"number2");
        String name = ParamUtil.getString(request,"name");
        String typeOfEquation= ParamUtil.getString(request,"typeOfEquation");

        CountManager countManager=new CountManager(number1,number2,typeOfEquation);


        try{
            _equationLocalService.addEquation(
                    serviceContext.getUserId(),
                    name,
                    serviceContext,
                    number1,
                    number2,
                    countManager.getResult(),
                    typeOfEquation

            );
        } catch (PortalException e) {
            Logger.getLogger(CalculatorPortlet.class.getName()).log(
                    Level.SEVERE, null, e);

         /*   response.setRenderParameter(
                    "mvcPath", "/edit_equation.jsp");*/
        }

    }

    @Reference(unbind = "-")
    protected void setEquationService(EquLocalService equationLocalService) {
        _equationLocalService = equationLocalService;
    }

    @Override
    public void render(RenderRequest renderRequest, RenderResponse renderResponse)throws IOException, PortletException {

        try{
            ServiceContext serviceContext = ServiceContextFactory.getInstance(
                    Equ.class.getName(),renderRequest);

            long groupId = serviceContext.getScopeGroupId();
            long equationId = ParamUtil.getLong(renderRequest,"equationId");

            List<Equ> equations = _equationLocalService.getEquations(groupId);

            if(equations.isEmpty()){
                Equ equation = _equationLocalService.addEquation(serviceContext.getUserId(),
                        "Przyklad",serviceContext,1,2,3,"Addition");

                equationId = equation.getEquId();
            }

            if(equationId==0){
                equationId = equations.get(0).getEquId();
            }

            renderRequest.setAttribute("equationId",equationId);

        } catch (PortalException e) {
            e.printStackTrace();
        }

        super.render(renderRequest,renderResponse);
    }
}