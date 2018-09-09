/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.symmetry.calculator.service;

import aQute.bnd.annotation.ProviderType;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Equ. This utility wraps
 * {@link com.symmetry.calculator.service.impl.EquLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see EquLocalService
 * @see com.symmetry.calculator.service.base.EquLocalServiceBaseImpl
 * @see com.symmetry.calculator.service.impl.EquLocalServiceImpl
 * @generated
 */
@ProviderType
public class EquLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.symmetry.calculator.service.impl.EquLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the equ to the database. Also notifies the appropriate model listeners.
	*
	* @param equ the equ
	* @return the equ that was added
	*/
	public static com.symmetry.calculator.model.Equ addEqu(
		com.symmetry.calculator.model.Equ equ) {
		return getService().addEqu(equ);
	}

	public static com.symmetry.calculator.model.Equ addEquation(long userId,
		String name,
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		long number1, long number2, long result, String typeOfEquation)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .addEquation(userId, name, serviceContext, number1, number2,
			result, typeOfEquation);
	}

	/**
	* Creates a new equ with the primary key. Does not add the equ to the database.
	*
	* @param equId the primary key for the new equ
	* @return the new equ
	*/
	public static com.symmetry.calculator.model.Equ createEqu(long equId) {
		return getService().createEqu(equId);
	}

	/**
	* Deletes the equ from the database. Also notifies the appropriate model listeners.
	*
	* @param equ the equ
	* @return the equ that was removed
	*/
	public static com.symmetry.calculator.model.Equ deleteEqu(
		com.symmetry.calculator.model.Equ equ) {
		return getService().deleteEqu(equ);
	}

	/**
	* Deletes the equ with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param equId the primary key of the equ
	* @return the equ that was removed
	* @throws PortalException if a equ with the primary key could not be found
	*/
	public static com.symmetry.calculator.model.Equ deleteEqu(long equId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteEqu(equId);
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.symmetry.calculator.model.impl.EquModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.symmetry.calculator.model.impl.EquModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.symmetry.calculator.model.Equ fetchEqu(long equId) {
		return getService().fetchEqu(equId);
	}

	/**
	* Returns the equ matching the UUID and group.
	*
	* @param uuid the equ's UUID
	* @param groupId the primary key of the group
	* @return the matching equ, or <code>null</code> if a matching equ could not be found
	*/
	public static com.symmetry.calculator.model.Equ fetchEquByUuidAndGroupId(
		String uuid, long groupId) {
		return getService().fetchEquByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	/**
	* Returns the equ with the primary key.
	*
	* @param equId the primary key of the equ
	* @return the equ
	* @throws PortalException if a equ with the primary key could not be found
	*/
	public static com.symmetry.calculator.model.Equ getEqu(long equId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getEqu(equId);
	}

	public static java.util.List<com.symmetry.calculator.model.Equ> getEquations(
		long groupId) {
		return getService().getEquations(groupId);
	}

	public static java.util.List<com.symmetry.calculator.model.Equ> getEquations(
		long groupId, int start, int end) {
		return getService().getEquations(groupId, start, end);
	}

	public static java.util.List<com.symmetry.calculator.model.Equ> getEquations(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.symmetry.calculator.model.Equ> obc) {
		return getService().getEquations(groupId, start, end, obc);
	}

	public static int getEquationsCount(long groupId) {
		return getService().getEquationsCount(groupId);
	}

	/**
	* Returns the equ matching the UUID and group.
	*
	* @param uuid the equ's UUID
	* @param groupId the primary key of the group
	* @return the matching equ
	* @throws PortalException if a matching equ could not be found
	*/
	public static com.symmetry.calculator.model.Equ getEquByUuidAndGroupId(
		String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getEquByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the equs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.symmetry.calculator.model.impl.EquModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of equs
	* @param end the upper bound of the range of equs (not inclusive)
	* @return the range of equs
	*/
	public static java.util.List<com.symmetry.calculator.model.Equ> getEqus(
		int start, int end) {
		return getService().getEqus(start, end);
	}

	/**
	* Returns all the equs matching the UUID and company.
	*
	* @param uuid the UUID of the equs
	* @param companyId the primary key of the company
	* @return the matching equs, or an empty list if no matches were found
	*/
	public static java.util.List<com.symmetry.calculator.model.Equ> getEqusByUuidAndCompanyId(
		String uuid, long companyId) {
		return getService().getEqusByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of equs matching the UUID and company.
	*
	* @param uuid the UUID of the equs
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of equs
	* @param end the upper bound of the range of equs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching equs, or an empty list if no matches were found
	*/
	public static java.util.List<com.symmetry.calculator.model.Equ> getEqusByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.symmetry.calculator.model.Equ> orderByComparator) {
		return getService()
				   .getEqusByUuidAndCompanyId(uuid, companyId, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of equs.
	*
	* @return the number of equs
	*/
	public static int getEqusCount() {
		return getService().getEqusCount();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the equ in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param equ the equ
	* @return the equ that was updated
	*/
	public static com.symmetry.calculator.model.Equ updateEqu(
		com.symmetry.calculator.model.Equ equ) {
		return getService().updateEqu(equ);
	}

	public static EquLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<EquLocalService, EquLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(EquLocalService.class);

		ServiceTracker<EquLocalService, EquLocalService> serviceTracker = new ServiceTracker<EquLocalService, EquLocalService>(bundle.getBundleContext(),
				EquLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}