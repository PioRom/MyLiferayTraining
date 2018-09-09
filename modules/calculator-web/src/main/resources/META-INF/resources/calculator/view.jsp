<%@include file="/META-INF/resources/init.jsp" %>

		ATRAPA
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


