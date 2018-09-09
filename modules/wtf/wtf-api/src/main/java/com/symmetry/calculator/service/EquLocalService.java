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

import com.liferay.exportimport.kernel.lar.PortletDataContext;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.symmetry.calculator.model.Equ;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for Equ. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see EquLocalServiceUtil
 * @see com.symmetry.calculator.service.base.EquLocalServiceBaseImpl
 * @see com.symmetry.calculator.service.impl.EquLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface EquLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EquLocalServiceUtil} to access the equ local service. Add custom service methods to {@link com.symmetry.calculator.service.impl.EquLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the equ to the database. Also notifies the appropriate model listeners.
	*
	* @param equ the equ
	* @return the equ that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public Equ addEqu(Equ equ);

	public Equ addEquation(long userId, String name,
		ServiceContext serviceContext, long number1, long number2, long result,
		String typeOfEquation) throws PortalException;

	/**
	* Creates a new equ with the primary key. Does not add the equ to the database.
	*
	* @param equId the primary key for the new equ
	* @return the new equ
	*/
	@Transactional(enabled = false)
	public Equ createEqu(long equId);

	/**
	* Deletes the equ from the database. Also notifies the appropriate model listeners.
	*
	* @param equ the equ
	* @return the equ that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public Equ deleteEqu(Equ equ);

	/**
	* Deletes the equ with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param equId the primary key of the equ
	* @return the equ that was removed
	* @throws PortalException if a equ with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public Equ deleteEqu(long equId) throws PortalException;

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	public DynamicQuery dynamicQuery();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

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
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

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
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Equ fetchEqu(long equId);

	/**
	* Returns the equ matching the UUID and group.
	*
	* @param uuid the equ's UUID
	* @param groupId the primary key of the group
	* @return the matching equ, or <code>null</code> if a matching equ could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Equ fetchEquByUuidAndGroupId(String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	/**
	* Returns the equ with the primary key.
	*
	* @param equId the primary key of the equ
	* @return the equ
	* @throws PortalException if a equ with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Equ getEqu(long equId) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Equ> getEquations(long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Equ> getEquations(long groupId, int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Equ> getEquations(long groupId, int start, int end,
		OrderByComparator<Equ> obc);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getEquationsCount(long groupId);

	/**
	* Returns the equ matching the UUID and group.
	*
	* @param uuid the equ's UUID
	* @param groupId the primary key of the group
	* @return the matching equ
	* @throws PortalException if a matching equ could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Equ getEquByUuidAndGroupId(String uuid, long groupId)
		throws PortalException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Equ> getEqus(int start, int end);

	/**
	* Returns all the equs matching the UUID and company.
	*
	* @param uuid the UUID of the equs
	* @param companyId the primary key of the company
	* @return the matching equs, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Equ> getEqusByUuidAndCompanyId(String uuid, long companyId);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Equ> getEqusByUuidAndCompanyId(String uuid, long companyId,
		int start, int end, OrderByComparator<Equ> orderByComparator);

	/**
	* Returns the number of equs.
	*
	* @return the number of equs
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getEqusCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public String getOSGiServiceIdentifier();

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	* Updates the equ in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param equ the equ
	* @return the equ that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public Equ updateEqu(Equ equ);
}