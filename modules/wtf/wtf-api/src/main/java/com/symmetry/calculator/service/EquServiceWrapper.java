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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EquService}.
 *
 * @author Brian Wing Shun Chan
 * @see EquService
 * @generated
 */
@ProviderType
public class EquServiceWrapper implements EquService,
	ServiceWrapper<EquService> {
	public EquServiceWrapper(EquService equService) {
		_equService = equService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _equService.getOSGiServiceIdentifier();
	}

	@Override
	public EquService getWrappedService() {
		return _equService;
	}

	@Override
	public void setWrappedService(EquService equService) {
		_equService = equService;
	}

	private EquService _equService;
}