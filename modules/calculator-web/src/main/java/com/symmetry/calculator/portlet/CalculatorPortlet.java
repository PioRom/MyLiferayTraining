package com.symmetry.calculator.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.symmetry.calculator.constants.CalculatorPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.*;

//import com.symmetry.calculator.model.Equation;
import com.symmetry.calculator.models.EquationTest;

//import com.symmetry.calculator.service.EquationLocalService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

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
                "javax.portlet.display-name=new_calculator",
                "javax.portlet.expiration-cache=0",
                "javax.portlet.name=" + CalculatorPortletKeys.CALCULATOR,
                "javax.portlet.init-param.template-path=/",
                "javax.portlet.init-param.view-template=/calculator/view.jsp",
                "javax.portlet.resource-bundle=content.Language",
                "javax.portlet.security-role-ref=power-user,user",
                "javax.portlet.supports.mime-type=text/html"
        },
        service = Portlet.class
)
public class CalculatorPortlet extends MVCPortlet {

/*

    private EquationLocalService _equationLocalService;

    public void addEquation(ActionRequest request, ActionResponse response) {

        ServiceContext serviceContext = null;

        try {
            serviceContext = ServiceContextFactory.getInstance(Equation.class.getName(), request);
        } catch (PortalException e) {
            e.printStackTrace();
        }

        long number1 = ParamUtil.getLong(request,"number1");
        long number2 = ParamUtil.getLong(request,"number2");
        String name = ParamUtil.getString(request,"name");

        try{
            _equationLocalService.addEquation(
                    serviceContext.getUserId(),
                    name,
                    serviceContext,
                    number1,
                    number2,
                    1,
                    number1+number2
            );
        } catch (PortalException e) {
            Logger.getLogger(CalculatorPortlet.class.getName()).log(
                    Level.SEVERE, null, e);

            response.setRenderParameter(
                    "mvcPath", "/edit_equation.jsp");
        }

    }

    @Reference(unbind = "-")
    protected void setEquationService(EquationLocalService equationLocalService) {
        _equationLocalService = equationLocalService;
    }

    @Override
    public void render(RenderRequest renderRequest,RenderResponse renderResponse)throws IOException, PortletException {

        try{
            ServiceContext serviceContext = ServiceContextFactory.getInstance(
                    Equation.class.getName(),renderRequest);

            long groupId = serviceContext.getScopeGroupId();
            long equationId = ParamUtil.getLong(renderRequest,"equationId");

            List<Equation> equations = _equationLocalService.getEquations(groupId);

            if(equations.isEmpty()){
                Equation equation = _equationLocalService.addEquation(serviceContext.getUserId(),
                        "Przyklad",serviceContext,1,1,1,2);

                equationId = equation.getEquationId();
            }

            if(equationId==0){
                equationId = equations.get(0).getEquationId();
            }

            renderRequest.setAttribute("equationId",equationId);

        } catch (PortalException e) {
            e.printStackTrace();
        }

        super.render(renderRequest,renderResponse);
    }

*/

    //dzialajaca atrapa
    @Override
    public void render(RenderRequest renderRequest, RenderResponse renderResponse)
            throws PortletException, IOException {


        List<EquationTest> equationList = new ArrayList<>();
        equationList.add(new EquationTest(1, 1, 1, 2));
        equationList.add(new EquationTest(2, 2, 2, 0));

        renderRequest.setAttribute("equations", equationList);

        super.render(renderRequest, renderResponse);
    }

}