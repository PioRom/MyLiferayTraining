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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.symmetry.calculator.exception.NoSuchEquException;
import com.symmetry.calculator.model.Equ;

/**
 * The persistence interface for the equ service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.symmetry.calculator.service.persistence.impl.EquPersistenceImpl
 * @see EquUtil
 * @generated
 */
@ProviderType
public interface EquPersistence extends BasePersistence<Equ> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EquUtil} to access the equ persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the equs where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching equs
	*/
	public java.util.List<Equ> findByUuid(String uuid);

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
	public java.util.List<Equ> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Equ> findByUuid(String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Equ> orderByComparator);

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
	public java.util.List<Equ> findByUuid(String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Equ> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first equ in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching equ
	* @throws NoSuchEquException if a matching equ could not be found
	*/
	public Equ findByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Equ> orderByComparator)
		throws NoSuchEquException;

	/**
	* Returns the first equ in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching equ, or <code>null</code> if a matching equ could not be found
	*/
	public Equ fetchByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Equ> orderByComparator);

	/**
	* Returns the last equ in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching equ
	* @throws NoSuchEquException if a matching equ could not be found
	*/
	public Equ findByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Equ> orderByComparator)
		throws NoSuchEquException;

	/**
	* Returns the last equ in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching equ, or <code>null</code> if a matching equ could not be found
	*/
	public Equ fetchByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Equ> orderByComparator);

	/**
	* Returns the equs before and after the current equ in the ordered set where uuid = &#63;.
	*
	* @param equId the primary key of the current equ
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next equ
	* @throws NoSuchEquException if a equ with the primary key could not be found
	*/
	public Equ[] findByUuid_PrevAndNext(long equId, String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Equ> orderByComparator)
		throws NoSuchEquException;

	/**
	* Removes all the equs where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(String uuid);

	/**
	* Returns the number of equs where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching equs
	*/
	public int countByUuid(String uuid);

	/**
	* Returns the equ where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchEquException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching equ
	* @throws NoSuchEquException if a matching equ could not be found
	*/
	public Equ findByUUID_G(String uuid, long groupId)
		throws NoSuchEquException;

	/**
	* Returns the equ where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching equ, or <code>null</code> if a matching equ could not be found
	*/
	public Equ fetchByUUID_G(String uuid, long groupId);

	/**
	* Returns the equ where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching equ, or <code>null</code> if a matching equ could not be found
	*/
	public Equ fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the equ where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the equ that was removed
	*/
	public Equ removeByUUID_G(String uuid, long groupId)
		throws NoSuchEquException;

	/**
	* Returns the number of equs where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching equs
	*/
	public int countByUUID_G(String uuid, long groupId);

	/**
	* Returns all the equs where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching equs
	*/
	public java.util.List<Equ> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<Equ> findByUuid_C(String uuid, long companyId,
		int start, int end);

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
	public java.util.List<Equ> findByUuid_C(String uuid, long companyId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Equ> orderByComparator);

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
	public java.util.List<Equ> findByUuid_C(String uuid, long companyId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Equ> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first equ in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching equ
	* @throws NoSuchEquException if a matching equ could not be found
	*/
	public Equ findByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Equ> orderByComparator)
		throws NoSuchEquException;

	/**
	* Returns the first equ in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching equ, or <code>null</code> if a matching equ could not be found
	*/
	public Equ fetchByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Equ> orderByComparator);

	/**
	* Returns the last equ in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching equ
	* @throws NoSuchEquException if a matching equ could not be found
	*/
	public Equ findByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Equ> orderByComparator)
		throws NoSuchEquException;

	/**
	* Returns the last equ in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching equ, or <code>null</code> if a matching equ could not be found
	*/
	public Equ fetchByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Equ> orderByComparator);

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
	public Equ[] findByUuid_C_PrevAndNext(long equId, String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Equ> orderByComparator)
		throws NoSuchEquException;

	/**
	* Removes all the equs where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(String uuid, long companyId);

	/**
	* Returns the number of equs where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching equs
	*/
	public int countByUuid_C(String uuid, long companyId);

	/**
	* Returns all the equs where name = &#63;.
	*
	* @param name the name
	* @return the matching equs
	*/
	public java.util.List<Equ> findByname(String name);

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
	public java.util.List<Equ> findByname(String name, int start, int end);

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
	public java.util.List<Equ> findByname(String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Equ> orderByComparator);

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
	public java.util.List<Equ> findByname(String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Equ> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first equ in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching equ
	* @throws NoSuchEquException if a matching equ could not be found
	*/
	public Equ findByname_First(String name,
		com.liferay.portal.kernel.util.OrderByComparator<Equ> orderByComparator)
		throws NoSuchEquException;

	/**
	* Returns the first equ in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching equ, or <code>null</code> if a matching equ could not be found
	*/
	public Equ fetchByname_First(String name,
		com.liferay.portal.kernel.util.OrderByComparator<Equ> orderByComparator);

	/**
	* Returns the last equ in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching equ
	* @throws NoSuchEquException if a matching equ could not be found
	*/
	public Equ findByname_Last(String name,
		com.liferay.portal.kernel.util.OrderByComparator<Equ> orderByComparator)
		throws NoSuchEquException;

	/**
	* Returns the last equ in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching equ, or <code>null</code> if a matching equ could not be found
	*/
	public Equ fetchByname_Last(String name,
		com.liferay.portal.kernel.util.OrderByComparator<Equ> orderByComparator);

	/**
	* Returns the equs before and after the current equ in the ordered set where name = &#63;.
	*
	* @param equId the primary key of the current equ
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next equ
	* @throws NoSuchEquException if a equ with the primary key could not be found
	*/
	public Equ[] findByname_PrevAndNext(long equId, String name,
		com.liferay.portal.kernel.util.OrderByComparator<Equ> orderByComparator)
		throws NoSuchEquException;

	/**
	* Removes all the equs where name = &#63; from the database.
	*
	* @param name the name
	*/
	public void removeByname(String name);

	/**
	* Returns the number of equs where name = &#63;.
	*
	* @param name the name
	* @return the number of matching equs
	*/
	public int countByname(String name);

	/**
	* Returns all the equs where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching equs
	*/
	public java.util.List<Equ> findByGroupId(long groupId);

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
	public java.util.List<Equ> findByGroupId(long groupId, int start, int end);

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
	public java.util.List<Equ> findByGroupId(long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Equ> orderByComparator);

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
	public java.util.List<Equ> findByGroupId(long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Equ> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first equ in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching equ
	* @throws NoSuchEquException if a matching equ could not be found
	*/
	public Equ findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Equ> orderByComparator)
		throws NoSuchEquException;

	/**
	* Returns the first equ in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching equ, or <code>null</code> if a matching equ could not be found
	*/
	public Equ fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Equ> orderByComparator);

	/**
	* Returns the last equ in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching equ
	* @throws NoSuchEquException if a matching equ could not be found
	*/
	public Equ findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Equ> orderByComparator)
		throws NoSuchEquException;

	/**
	* Returns the last equ in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching equ, or <code>null</code> if a matching equ could not be found
	*/
	public Equ fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Equ> orderByComparator);

	/**
	* Returns the equs before and after the current equ in the ordered set where groupId = &#63;.
	*
	* @param equId the primary key of the current equ
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next equ
	* @throws NoSuchEquException if a equ with the primary key could not be found
	*/
	public Equ[] findByGroupId_PrevAndNext(long equId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Equ> orderByComparator)
		throws NoSuchEquException;

	/**
	* Removes all the equs where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public void removeByGroupId(long groupId);

	/**
	* Returns the number of equs where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching equs
	*/
	public int countByGroupId(long groupId);

	/**
	* Caches the equ in the entity cache if it is enabled.
	*
	* @param equ the equ
	*/
	public void cacheResult(Equ equ);

	/**
	* Caches the equs in the entity cache if it is enabled.
	*
	* @param equs the equs
	*/
	public void cacheResult(java.util.List<Equ> equs);

	/**
	* Creates a new equ with the primary key. Does not add the equ to the database.
	*
	* @param equId the primary key for the new equ
	* @return the new equ
	*/
	public Equ create(long equId);

	/**
	* Removes the equ with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param equId the primary key of the equ
	* @return the equ that was removed
	* @throws NoSuchEquException if a equ with the primary key could not be found
	*/
	public Equ remove(long equId) throws NoSuchEquException;

	public Equ updateImpl(Equ equ);

	/**
	* Returns the equ with the primary key or throws a {@link NoSuchEquException} if it could not be found.
	*
	* @param equId the primary key of the equ
	* @return the equ
	* @throws NoSuchEquException if a equ with the primary key could not be found
	*/
	public Equ findByPrimaryKey(long equId) throws NoSuchEquException;

	/**
	* Returns the equ with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param equId the primary key of the equ
	* @return the equ, or <code>null</code> if a equ with the primary key could not be found
	*/
	public Equ fetchByPrimaryKey(long equId);

	@Override
	public java.util.Map<java.io.Serializable, Equ> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the equs.
	*
	* @return the equs
	*/
	public java.util.List<Equ> findAll();

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
	public java.util.List<Equ> findAll(int start, int end);

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
	public java.util.List<Equ> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Equ> orderByComparator);

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
	public java.util.List<Equ> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Equ> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the equs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of equs.
	*
	* @return the number of equs
	*/
	public int countAll();

	@Override
	public java.util.Set<String> getBadColumnNames();
}