<%@include file="/META-INF/resources/init.jsp" %>

<%@ page import="com.symmetry.calculator.service.EquLocalServiceUtil" %>
<%@ page import="com.symmetry.calculator.model.Equ" %>
<%@ page import="com.symmetry.calculator.Tools.ListOfOperation" %>


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

    <ul>

        <li>
            <aui:input name="number1"></aui:input>
        </li>

        <li>
            <aui:input name="number2"></aui:input>
        </li>

        <li>
            <aui:input name="name"></aui:input>
        </li>
    </ul>

<aui:button id="callAddingNumbers" value="Dodaj" onClick="makeAction('ADDITION')">
</aui:button>

<aui:button id="callSubstratingNumbers" value="Odejmij" onClick="makeAction('SUBTRACTION')">
</aui:button>

<aui:button id="callSubstratingNumbers" value="Pomnoz" onClick="makeAction('MULTIPLICATION')">
</aui:button>

<aui:button id="callSubstratingNumbers" value="Podziel" onClick="makeAction('DIVISION')">
</aui:button>

<aui:script>

    function makeAction(type) {

        var number1 = $("#<portlet:namespace/>number1").val();
        var number2 = $("#<portlet:namespace/>number2").val();
        var name = $("#<portlet:namespace/>name").val();
        var typeOfEquation = type;
        $.ajax({
            type: "POST",
            data: {
                <portlet:namespace />number1: number1,
                <portlet:namespace />number2: number2,
                <portlet:namespace />name: name,
                <portlet:namespace />typeOfEquation: typeOfEquation,
            },
            url: '<portlet:actionURL name="addEquation"/>',
            success: function () {
             Liferay.Portlet.refresh('#p_p_id<portlet:namespace/>');
    }
        })
    };

</aui:script>






