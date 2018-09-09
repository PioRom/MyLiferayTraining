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

package com.symmetry.calculator.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Equ}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Equ
 * @generated
 */
@ProviderType
public class EquWrapper implements Equ, ModelWrapper<Equ> {
	public EquWrapper(Equ equ) {
		_equ = equ;
	}

	@Override
	public Class<?> getModelClass() {
		return Equ.class;
	}

	@Override
	public String getModelClassName() {
		return Equ.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("equId", getEquId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("number1", getNumber1());
		attributes.put("number2", getNumber2());
		attributes.put("result", getResult());
		attributes.put("typeOfEquation", getTypeOfEquation());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long equId = (Long)attributes.get("equId");

		if (equId != null) {
			setEquId(equId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Long number1 = (Long)attributes.get("number1");

		if (number1 != null) {
			setNumber1(number1);
		}

		Long number2 = (Long)attributes.get("number2");

		if (number2 != null) {
			setNumber2(number2);
		}

		Long result = (Long)attributes.get("result");

		if (result != null) {
			setResult(result);
		}

		String typeOfEquation = (String)attributes.get("typeOfEquation");

		if (typeOfEquation != null) {
			setTypeOfEquation(typeOfEquation);
		}
	}

	@Override
	public Object clone() {
		return new EquWrapper((Equ)_equ.clone());
	}

	@Override
	public int compareTo(Equ equ) {
		return _equ.compareTo(equ);
	}

	/**
	* Returns the company ID of this equ.
	*
	* @return the company ID of this equ
	*/
	@Override
	public long getCompanyId() {
		return _equ.getCompanyId();
	}

	/**
	* Returns the create date of this equ.
	*
	* @return the create date of this equ
	*/
	@Override
	public Date getCreateDate() {
		return _equ.getCreateDate();
	}

	/**
	* Returns the equ ID of this equ.
	*
	* @return the equ ID of this equ
	*/
	@Override
	public long getEquId() {
		return _equ.getEquId();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _equ.getExpandoBridge();
	}

	/**
	* Returns the group ID of this equ.
	*
	* @return the group ID of this equ
	*/
	@Override
	public long getGroupId() {
		return _equ.getGroupId();
	}

	/**
	* Returns the modified date of this equ.
	*
	* @return the modified date of this equ
	*/
	@Override
	public Date getModifiedDate() {
		return _equ.getModifiedDate();
	}

	/**
	* Returns the name of this equ.
	*
	* @return the name of this equ
	*/
	@Override
	public String getName() {
		return _equ.getName();
	}

	/**
	* Returns the number1 of this equ.
	*
	* @return the number1 of this equ
	*/
	@Override
	public long getNumber1() {
		return _equ.getNumber1();
	}

	/**
	* Returns the number2 of this equ.
	*
	* @return the number2 of this equ
	*/
	@Override
	public long getNumber2() {
		return _equ.getNumber2();
	}

	/**
	* Returns the primary key of this equ.
	*
	* @return the primary key of this equ
	*/
	@Override
	public long getPrimaryKey() {
		return _equ.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _equ.getPrimaryKeyObj();
	}

	/**
	* Returns the result of this equ.
	*
	* @return the result of this equ
	*/
	@Override
	public long getResult() {
		return _equ.getResult();
	}

	/**
	* Returns the type of equation of this equ.
	*
	* @return the type of equation of this equ
	*/
	@Override
	public String getTypeOfEquation() {
		return _equ.getTypeOfEquation();
	}

	/**
	* Returns the user ID of this equ.
	*
	* @return the user ID of this equ
	*/
	@Override
	public long getUserId() {
		return _equ.getUserId();
	}

	/**
	* Returns the user name of this equ.
	*
	* @return the user name of this equ
	*/
	@Override
	public String getUserName() {
		return _equ.getUserName();
	}

	/**
	* Returns the user uuid of this equ.
	*
	* @return the user uuid of this equ
	*/
	@Override
	public String getUserUuid() {
		return _equ.getUserUuid();
	}

	/**
	* Returns the uuid of this equ.
	*
	* @return the uuid of this equ
	*/
	@Override
	public String getUuid() {
		return _equ.getUuid();
	}

	@Override
	public int hashCode() {
		return _equ.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _equ.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _equ.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _equ.isNew();
	}

	@Override
	public void persist() {
		_equ.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_equ.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this equ.
	*
	* @param companyId the company ID of this equ
	*/
	@Override
	public void setCompanyId(long companyId) {
		_equ.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this equ.
	*
	* @param createDate the create date of this equ
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_equ.setCreateDate(createDate);
	}

	/**
	* Sets the equ ID of this equ.
	*
	* @param equId the equ ID of this equ
	*/
	@Override
	public void setEquId(long equId) {
		_equ.setEquId(equId);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_equ.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_equ.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_equ.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this equ.
	*
	* @param groupId the group ID of this equ
	*/
	@Override
	public void setGroupId(long groupId) {
		_equ.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this equ.
	*
	* @param modifiedDate the modified date of this equ
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_equ.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this equ.
	*
	* @param name the name of this equ
	*/
	@Override
	public void setName(String name) {
		_equ.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_equ.setNew(n);
	}

	/**
	* Sets the number1 of this equ.
	*
	* @param number1 the number1 of this equ
	*/
	@Override
	public void setNumber1(long number1) {
		_equ.setNumber1(number1);
	}

	/**
	* Sets the number2 of this equ.
	*
	* @param number2 the number2 of this equ
	*/
	@Override
	public void setNumber2(long number2) {
		_equ.setNumber2(number2);
	}

	/**
	* Sets the primary key of this equ.
	*
	* @param primaryKey the primary key of this equ
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_equ.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_equ.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the result of this equ.
	*
	* @param result the result of this equ
	*/
	@Override
	public void setResult(long result) {
		_equ.setResult(result);
	}

	/**
	* Sets the type of equation of this equ.
	*
	* @param typeOfEquation the type of equation of this equ
	*/
	@Override
	public void setTypeOfEquation(String typeOfEquation) {
		_equ.setTypeOfEquation(typeOfEquation);
	}

	/**
	* Sets the user ID of this equ.
	*
	* @param userId the user ID of this equ
	*/
	@Override
	public void setUserId(long userId) {
		_equ.setUserId(userId);
	}

	/**
	* Sets the user name of this equ.
	*
	* @param userName the user name of this equ
	*/
	@Override
	public void setUserName(String userName) {
		_equ.setUserName(userName);
	}

	/**
	* Sets the user uuid of this equ.
	*
	* @param userUuid the user uuid of this equ
	*/
	@Override
	public void setUserUuid(String userUuid) {
		_equ.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this equ.
	*
	* @param uuid the uuid of this equ
	*/
	@Override
	public void setUuid(String uuid) {
		_equ.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Equ> toCacheModel() {
		return _equ.toCacheModel();
	}

	@Override
	public Equ toEscapedModel() {
		return new EquWrapper(_equ.toEscapedModel());
	}

	@Override
	public String toString() {
		return _equ.toString();
	}

	@Override
	public Equ toUnescapedModel() {
		return new EquWrapper(_equ.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _equ.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EquWrapper)) {
			return false;
		}

		EquWrapper equWrapper = (EquWrapper)obj;

		if (Objects.equals(_equ, equWrapper._equ)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _equ.getStagedModelType();
	}

	@Override
	public Equ getWrappedModel() {
		return _equ;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _equ.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _equ.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_equ.resetOriginalValues();
	}

	private final Equ _equ;
}