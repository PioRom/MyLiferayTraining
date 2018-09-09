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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.symmetry.calculator.service.http.EquServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.symmetry.calculator.service.http.EquServiceSoap
 * @generated
 */
@ProviderType
public class EquSoap implements Serializable {
	public static EquSoap toSoapModel(Equ model) {
		EquSoap soapModel = new EquSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setEquId(model.getEquId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setName(model.getName());
		soapModel.setNumber1(model.getNumber1());
		soapModel.setNumber2(model.getNumber2());
		soapModel.setResult(model.getResult());
		soapModel.setTypeOfEquation(model.getTypeOfEquation());

		return soapModel;
	}

	public static EquSoap[] toSoapModels(Equ[] models) {
		EquSoap[] soapModels = new EquSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EquSoap[][] toSoapModels(Equ[][] models) {
		EquSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EquSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EquSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EquSoap[] toSoapModels(List<Equ> models) {
		List<EquSoap> soapModels = new ArrayList<EquSoap>(models.size());

		for (Equ model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EquSoap[soapModels.size()]);
	}

	public EquSoap() {
	}

	public long getPrimaryKey() {
		return _equId;
	}

	public void setPrimaryKey(long pk) {
		setEquId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getEquId() {
		return _equId;
	}

	public void setEquId(long equId) {
		_equId = equId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public long getNumber1() {
		return _number1;
	}

	public void setNumber1(long number1) {
		_number1 = number1;
	}

	public long getNumber2() {
		return _number2;
	}

	public void setNumber2(long number2) {
		_number2 = number2;
	}

	public long getResult() {
		return _result;
	}

	public void setResult(long result) {
		_result = result;
	}

	public String getTypeOfEquation() {
		return _typeOfEquation;
	}

	public void setTypeOfEquation(String typeOfEquation) {
		_typeOfEquation = typeOfEquation;
	}

	private String _uuid;
	private long _equId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
	private long _number1;
	private long _number2;
	private long _result;
	private String _typeOfEquation;
}