<%@include file="/init.jsp"%>

<portlet:renderURL var="counterURL">
	<portlet:param name="mvcPath" value="/counter.jsp"></portlet:param>
</portlet:renderURL>

<aui:button-row>
	<aui:button onClick="<%=counterURL.toString() %>" value="Adding button"></aui:button>
</aui:button-row>

<jsp:useBean id="equations" class="java.util.ArrayList" scope="request"/>

<liferay-ui:search-container>
	<liferay-ui:search-container-results results="<%= equations%>"/>

	<liferay-ui:search-container-row
			className="com.symmetry.calculator.models.EquationTest"
			modelVar="equation"
	>
		<liferay-ui:search-container-column-text property="number1" name="pierwsza liczba"/>
		<liferay-ui:search-container-column-text property="number2"/>
		<liferay-ui:search-container-column-text property="typeOfEquation"/>
		<liferay-ui:search-container-column-text property="result"/>
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator/>
</liferay-ui:search-container>

<%--
<liferay-ui:search-container total="<%=EquationLocalServiceUtil.getEquationsCount()%>">
	<liferay-ui:search-container-results
			results="<%=EquationLocalServiceUtil.getEquations(scopeGroupId.longValue(),
                    searchContainer.getStart(),
                    searchContainer.getEnd())%>" />

	<liferay-ui:search-container-row
			className="com.liferay.docs.guestbook.model.Entry" modelVar="entry">

		<liferay-ui:search-container-column-text property="number1" name="pierwsza liczba"/>
		<liferay-ui:search-container-column-text property="number2"/>
		<liferay-ui:search-container-column-text property="typeOfEquation"/>
		<liferay-ui:search-container-column-text property="result"/>

	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />

</liferay-ui:search-container>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/view.jsp"></portlet:param>
</portlet:renderURL>
<portlet:actionURL name="addEquation" var="actionJSP"></portlet:actionURL>

<aui:form action="<%=actionJSP%>" name="<portlet:namespace />fm">
	<aui:button-row>
		<aui:button type="submit"></aui:button>
	</aui:button-row>
</aui:form>
--%>

