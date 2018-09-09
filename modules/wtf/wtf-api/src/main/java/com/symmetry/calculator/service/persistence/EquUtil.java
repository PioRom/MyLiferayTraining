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

package com.symmetry.calculator.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.symmetry.calculator.model.Equ;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the equ service. This utility wraps {@link com.symmetry.calculator.service.persistence.impl.EquPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EquPersistence
 * @see com.symmetry.calculator.service.persistence.impl.EquPersistenceImpl
 * @generated
 */
@ProviderType
public class EquUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Equ equ) {
		getPersistence().clearCache(equ);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Equ> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Equ> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Equ> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<Equ> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Equ update(Equ equ) {
		return getPersistence().update(equ);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Equ update(Equ equ, ServiceContext serviceContext) {
		return getPersistence().update(equ, serviceContext);
	}

	/**
	* Returns all the equs where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching equs
	*/
	public static List<Equ> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the equs where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EquModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of equs
	* @param end the upper bound of the range of equs (not inclusive)
	* @return the range of matching equs
	*/
	public static List<Equ> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the equs where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EquModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of equs
	* @param end the upper bound of the range of equs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching equs
	*/
	public static List<Equ> findByUuid(String uuid, int start, int end,
		OrderByComparator<Equ> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the equs where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EquModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of equs
	* @param end the upper bound of the range of equs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching equs
	*/
	public static List<Equ> findByUuid(String uuid, int start, int end,
		OrderByComparator<Equ> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first equ in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching equ
	* @throws NoSuchEquException if a matching equ could not be found
	*/
	public static Equ findByUuid_First(String uuid,
		OrderByComparator<Equ> orderByComparator)
		throws com.symmetry.calculator.exception.NoSuchEquException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first equ in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching equ, or <code>null</code> if a matching equ could not be found
	*/
	public static Equ fetchByUuid_First(String uuid,
		OrderByComparator<Equ> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last equ in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching equ
	* @throws NoSuchEquException if a matching equ could not be found
	*/
	public static Equ findByUuid_Last(String uuid,
		OrderByComparator<Equ> orderByComparator)
		throws com.symmetry.calculator.exception.NoSuchEquException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last equ in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching equ, or <code>null</code> if a matching equ could not be found
	*/
	public static Equ fetchByUuid_Last(String uuid,
		OrderByComparator<Equ> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the equs before and after the current equ in the ordered set where uuid = &#63;.
	*
	* @param equId the primary key of the current equ
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next equ
	* @throws NoSuchEquException if a equ with the primary key could not be found
	*/
	public static Equ[] findByUuid_PrevAndNext(long equId, String uuid,
		OrderByComparator<Equ> orderByComparator)
		throws com.symmetry.calculator.exception.NoSuchEquException {
		return getPersistence()
				   .findByUuid_PrevAndNext(equId, uuid, orderByComparator);
	}

	/**
	* Removes all the equs where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of equs where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching equs
	*/
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the equ where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchEquException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching equ
	* @throws NoSuchEquException if a matching equ could not be found
	*/
	public static Equ findByUUID_G(String uuid, long groupId)
		throws com.symmetry.calculator.exception.NoSuchEquException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the equ where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching equ, or <code>null</code> if a matching equ could not be found
	*/
	public static Equ fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the equ where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching equ, or <code>null</code> if a matching equ could not be found
	*/
	public static Equ fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the equ where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the equ that was removed
	*/
	public static Equ removeByUUID_G(String uuid, long groupId)
		throws com.symmetry.calculator.exception.NoSuchEquException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of equs where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching equs
	*/
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the equs where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching equs
	*/
	public static List<Equ> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the equs where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EquModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of equs
	* @param end the upper bound of the range of equs (not inclusive)
	* @return the range of matching equs
	*/
	public static List<Equ> findByUuid_C(String uuid, long companyId,
		int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the equs where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EquModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of equs
	* @param end the upper bound of the range of equs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching equs
	*/
	public static List<Equ> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<Equ> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the equs where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EquModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of equs
	* @param end the upper bound of the range of equs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching equs
	*/
	public static List<Equ> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<Equ> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first equ in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching equ
	* @throws NoSuchEquException if a matching equ could not be found
	*/
	public static Equ findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<Equ> orderByComparator)
		throws com.symmetry.calculator.exception.NoSuchEquException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first equ in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching equ, or <code>null</code> if a matching equ could not be found
	*/
	public static Equ fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<Equ> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last equ in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching equ
	* @throws NoSuchEquException if a matching equ could not be found
	*/
	public static Equ findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<Equ> orderByComparator)
		throws com.symmetry.calculator.exception.NoSuchEquException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last equ in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching equ, or <code>null</code> if a matching equ could not be found
	*/
	public static Equ fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<Equ> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the equs before and after the current equ in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param equId the primary key of the current equ
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next equ
	* @throws NoSuchEquException if a equ with the primary key could not be found
	*/
	public static Equ[] findByUuid_C_PrevAndNext(long equId, String uuid,
		long companyId, OrderByComparator<Equ> orderByComparator)
		throws com.symmetry.calculator.exception.NoSuchEquException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(equId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the equs where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of equs where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching equs
	*/
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the equs where name = &#63;.
	*
	* @param name the name
	* @return the matching equs
	*/
	public static List<Equ> findByname(String name) {
		return getPersistence().findByname(name);
	}

	/**
	* Returns a range of all the equs where name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EquModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of equs
	* @param end the upper bound of the range of equs (not inclusive)
	* @return the range of matching equs
	*/
	public static List<Equ> findByname(String name, int start, int end) {
		return getPersistence().findByname(name, start, end);
	}

	/**
	* Returns an ordered range of all the equs where name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EquModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of equs
	* @param end the upper bound of the range of equs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching equs
	*/
	public static List<Equ> findByname(String name, int start, int end,
		OrderByComparator<Equ> orderByComparator) {
		return getPersistence().findByname(name, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the equs where name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EquModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of equs
	* @param end the upper bound of the range of equs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching equs
	*/
	public static List<Equ> findByname(String name, int start, int end,
		OrderByComparator<Equ> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByname(name, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first equ in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching equ
	* @throws NoSuchEquException if a matching equ could not be found
	*/
	public static Equ findByname_First(String name,
		OrderByComparator<Equ> orderByComparator)
		throws com.symmetry.calculator.exception.NoSuchEquException {
		return getPersistence().findByname_First(name, orderByComparator);
	}

	/**
	* Returns the first equ in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching equ, or <code>null</code> if a matching equ could not be found
	*/
	public static Equ fetchByname_First(String name,
		OrderByComparator<Equ> orderByComparator) {
		return getPersistence().fetchByname_First(name, orderByComparator);
	}

	/**
	* Returns the last equ in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching equ
	* @throws NoSuchEquException if a matching equ could not be found
	*/
	public static Equ findByname_Last(String name,
		OrderByComparator<Equ> orderByComparator)
		throws com.symmetry.calculator.exception.NoSuchEquException {
		return getPersistence().findByname_Last(name, orderByComparator);
	}

	/**
	* Returns the last equ in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching equ, or <code>null</code> if a matching equ could not be found
	*/
	public static Equ fetchByname_Last(String name,
		OrderByComparator<Equ> orderByComparator) {
		return getPersistence().fetchByname_Last(name, orderByComparator);
	}

	/**
	* Returns the equs before and after the current equ in the ordered set where name = &#63;.
	*
	* @param equId the primary key of the current equ
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next equ
	* @throws NoSuchEquException if a equ with the primary key could not be found
	*/
	public static Equ[] findByname_PrevAndNext(long equId, String name,
		OrderByComparator<Equ> orderByComparator)
		throws com.symmetry.calculator.exception.NoSuchEquException {
		return getPersistence()
				   .findByname_PrevAndNext(equId, name, orderByComparator);
	}

	/**
	* Removes all the equs where name = &#63; from the database.
	*
	* @param name the name
	*/
	public static void removeByname(String name) {
		getPersistence().removeByname(name);
	}

	/**
	* Returns the number of equs where name = &#63;.
	*
	* @param name the name
	* @return the number of matching equs
	*/
	public static int countByname(String name) {
		return getPersistence().countByname(name);
	}

	/**
	* Returns all the equs where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching equs
	*/
	public static List<Equ> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the equs where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EquModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of equs
	* @param end the upper bound of the range of equs (not inclusive)
	* @return the range of matching equs
	*/
	public static List<Equ> findByGroupId(long groupId, int start, int end) {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the equs where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EquModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of equs
	* @param end the upper bound of the range of equs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching equs
	*/
	public static List<Equ> findByGroupId(long groupId, int start, int end,
		OrderByComparator<Equ> orderByComparator) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the equs where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EquModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of equs
	* @param end the upper bound of the range of equs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching equs
	*/
	public static List<Equ> findByGroupId(long groupId, int start, int end,
		OrderByComparator<Equ> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first equ in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching equ
	* @throws NoSuchEquException if a matching equ could not be found
	*/
	public static Equ findByGroupId_First(long groupId,
		OrderByComparator<Equ> orderByComparator)
		throws com.symmetry.calculator.exception.NoSuchEquException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first equ in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching equ, or <code>null</code> if a matching equ could not be found
	*/
	public static Equ fetchByGroupId_First(long groupId,
		OrderByComparator<Equ> orderByComparator) {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last equ in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching equ
	* @throws NoSuchEquException if a matching equ could not be found
	*/
	public static Equ findByGroupId_Last(long groupId,
		OrderByComparator<Equ> orderByComparator)
		throws com.symmetry.calculator.exception.NoSuchEquException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last equ in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching equ, or <code>null</code> if a matching equ could not be found
	*/
	public static Equ fetchByGroupId_Last(long groupId,
		OrderByComparator<Equ> orderByComparator) {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the equs before and after the current equ in the ordered set where groupId = &#63;.
	*
	* @param equId the primary key of the current equ
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next equ
	* @throws NoSuchEquException if a equ with the primary key could not be found
	*/
	public static Equ[] findByGroupId_PrevAndNext(long equId, long groupId,
		OrderByComparator<Equ> orderByComparator)
		throws com.symmetry.calculator.exception.NoSuchEquException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(equId, groupId, orderByComparator);
	}

	/**
	* Removes all the equs where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of equs where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching equs
	*/
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Caches the equ in the entity cache if it is enabled.
	*
	* @param equ the equ
	*/
	public static void cacheResult(Equ equ) {
		getPersistence().cacheResult(equ);
	}

	/**
	* Caches the equs in the entity cache if it is enabled.
	*
	* @param equs the equs
	*/
	public static void cacheResult(List<Equ> equs) {
		getPersistence().cacheResult(equs);
	}

	/**
	* Creates a new equ with the primary key. Does not add the equ to the database.
	*
	* @param equId the primary key for the new equ
	* @return the new equ
	*/
	public static Equ create(long equId) {
		return getPersistence().create(equId);
	}

	/**
	* Removes the equ with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param equId the primary key of the equ
	* @return the equ that was removed
	* @throws NoSuchEquException if a equ with the primary key could not be found
	*/
	public static Equ remove(long equId)
		throws com.symmetry.calculator.exception.NoSuchEquException {
		return getPersistence().remove(equId);
	}

	public static Equ updateImpl(Equ equ) {
		return getPersistence().updateImpl(equ);
	}

	/**
	* Returns the equ with the primary key or throws a {@link NoSuchEquException} if it could not be found.
	*
	* @param equId the primary key of the equ
	* @return the equ
	* @throws NoSuchEquException if a equ with the primary key could not be found
	*/
	public static Equ findByPrimaryKey(long equId)
		throws com.symmetry.calculator.exception.NoSuchEquException {
		return getPersistence().findByPrimaryKey(equId);
	}

	/**
	* Returns the equ with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param equId the primary key of the equ
	* @return the equ, or <code>null</code> if a equ with the primary key could not be found
	*/
	public static Equ fetchByPrimaryKey(long equId) {
		return getPersistence().fetchByPrimaryKey(equId);
	}

	public static java.util.Map<java.io.Serializable, Equ> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the equs.
	*
	* @return the equs
	*/
	public static List<Equ> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the equs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EquModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of equs
	* @param end the upper bound of the range of equs (not inclusive)
	* @return the range of equs
	*/
	public static List<Equ> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the equs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EquModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of equs
	* @param end the upper bound of the range of equs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of equs
	*/
	public static List<Equ> findAll(int start, int end,
		OrderByComparator<Equ> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the equs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EquModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of equs
	* @param end the upper bound of the range of equs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of equs
	*/
	public static List<Equ> findAll(int start, int end,
		OrderByComparator<Equ> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the equs from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of equs.
	*
	* @return the number of equs
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static EquPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<EquPersistence, EquPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(EquPersistence.class);

		ServiceTracker<EquPersistence, EquPersistence> serviceTracker = new ServiceTracker<EquPersistence, EquPersistence>(bundle.getBundleContext(),
				EquPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}