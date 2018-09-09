<%@include file="/META-INF/resources/init.jsp" %>

<%@ page import="com.symmetry.calculator.service.EquLocalServiceUtil" %>
<%@ page import="com.symmetry.calculator.model.Equ" %>


<liferay-ui:search-container total="<%= EquLocalServiceUtil.getEqusCount()%>">
    <liferay-ui:search-container-results
            results="<%= EquLocalServiceUtil.getEqus(searchContainer.getStart(), searchContainer.getEnd()) %>"/>
    <liferay-ui:search-container-row className="com.symmetry.calculator.model.Equ" modelVar="equation">
        <liferay-ui:search-container-column-text property="number1"/>
        <liferay-ui:search-container-column-text property="number2"/>
        <liferay-ui:search-container-column-text property="typeOfEquation"/>
        <liferay-ui:search-container-column-text property="result"/>
        <liferay-ui:search-container-column-text property="name"/>

    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator/>

</liferay-ui:search-container>

<portlet:actionURL name="addEquation" var="addEquationAction"/>

<aui:form action="<%=addEquationAction%>" name="fm">

    <aui:fieldset>
        <aui:input name="number1"/>
        <aui:input name="number2"/>

        <aui:input name="name"/>
    </aui:fieldset>

    <aui:button-row>
        <aui:button value="Dodaj" onClick=""></aui:button>
    </aui:button-row>


    <aui:button-row>
        <aui:button type="submit" name="Dodaj"/>
    </aui:button-row>
</aui:form>