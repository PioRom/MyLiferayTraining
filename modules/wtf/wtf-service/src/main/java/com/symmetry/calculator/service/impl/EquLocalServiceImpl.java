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

package com.symmetry.calculator.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.symmetry.calculator.model.Equ;
import com.symmetry.calculator.service.base.EquLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the equ local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.symmetry.calculator.service.EquLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EquLocalServiceBaseImpl
 * @see com.symmetry.calculator.service.EquLocalServiceUtil
 */
public class EquLocalServiceImpl extends EquLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.symmetry.calculator.service.EquLocalServiceUtil} to access the equ local service.
	 */

	public Equ addEquation(long userId, String name, ServiceContext serviceContext, long number1,long number2,long result, String typeOfEquation) throws PortalException {
		long groupId = serviceContext.getScopeGroupId();

		User user = userLocalService.getUserById(userId);

		Date now = new Date();

		long equationId = counterLocalService.increment();
		Equ equation = equPersistence.create(equationId);

		equation.setUuid(serviceContext.getUuid());
		equation.setUserId(userId);
		equation.setGroupId(groupId);
		equation.setCompanyId(user.getCompanyId());
		equation.setUserName(user.getFullName());
		equation.setCreateDate(serviceContext.getCreateDate(now));
		equation.setModifiedDate(serviceContext.getModifiedDate(now));
		equation.setName(name);
		equation.setExpandoBridgeAttributes(serviceContext);
		equation.setNumber1(number1);
		equation.setNumber2(number2);
		equation.setResult(result);
		equation.setTypeOfEquation(typeOfEquation);

		equPersistence.update(equation);

		return equation;

	}

	public List<Equ> getEquations(long groupId){
		return equPersistence.findByGroupId(groupId);
	}

	public List<Equ> getEquations(long groupId, int start, int end, OrderByComparator<Equ> obc){
		return equPersistence.findByGroupId(groupId,start,end,obc);
	}

	public List<Equ> getEquations(long groupId, int start, int end) {

		return equPersistence.findByGroupId(groupId, start, end);
	}

	public int getEquationsCount(long groupId) {

		return equPersistence.countByGroupId(groupId);
	}
}

