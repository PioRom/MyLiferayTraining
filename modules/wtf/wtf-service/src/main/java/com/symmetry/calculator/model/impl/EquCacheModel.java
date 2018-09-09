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

package com.symmetry.calculator.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import com.symmetry.calculator.model.Equ;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Equ in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Equ
 * @generated
 */
@ProviderType
public class EquCacheModel implements CacheModel<Equ>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EquCacheModel)) {
			return false;
		}

		EquCacheModel equCacheModel = (EquCacheModel)obj;

		if (equId == equCacheModel.equId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, equId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", equId=");
		sb.append(equId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", name=");
		sb.append(name);
		sb.append(", number1=");
		sb.append(number1);
		sb.append(", number2=");
		sb.append(number2);
		sb.append(", result=");
		sb.append(result);
		sb.append(", typeOfEquation=");
		sb.append(typeOfEquation);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Equ toEntityModel() {
		EquImpl equImpl = new EquImpl();

		if (uuid == null) {
			equImpl.setUuid("");
		}
		else {
			equImpl.setUuid(uuid);
		}

		equImpl.setEquId(equId);
		equImpl.setGroupId(groupId);
		equImpl.setCompanyId(companyId);
		equImpl.setUserId(userId);

		if (userName == null) {
			equImpl.setUserName("");
		}
		else {
			equImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			equImpl.setCreateDate(null);
		}
		else {
			equImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			equImpl.setModifiedDate(null);
		}
		else {
			equImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			equImpl.setName("");
		}
		else {
			equImpl.setName(name);
		}

		equImpl.setNumber1(number1);
		equImpl.setNumber2(number2);
		equImpl.setResult(result);

		if (typeOfEquation == null) {
			equImpl.setTypeOfEquation("");
		}
		else {
			equImpl.setTypeOfEquation(typeOfEquation);
		}

		equImpl.resetOriginalValues();

		return equImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		equId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();

		number1 = objectInput.readLong();

		number2 = objectInput.readLong();

		result = objectInput.readLong();
		typeOfEquation = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(equId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		objectOutput.writeLong(number1);

		objectOutput.writeLong(number2);

		objectOutput.writeLong(result);

		if (typeOfEquation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfEquation);
		}
	}

	public String uuid;
	public long equId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public long number1;
	public long number2;
	public long result;
	public String typeOfEquation;
}