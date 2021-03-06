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

package com.liferay.portal.cache.configurator.util;

import com.liferay.portal.cache.configurator.PortalCacheConfigurator;

import java.net.URL;

/**
 * @author Miguel Pastor
 */
public class PortalCacheConfiguratorUtil {

	public static void reconfigureCaches(
			String portalCacheManagerName, ClassLoader classLoader, URL url)
		throws Exception {

		_portalCacheConfigurator.reconfigureCaches(
			portalCacheManagerName, classLoader, url);
	}

	public void setPortalCacheConfigurator(
		PortalCacheConfigurator portalCacheConfigurator) {

		_portalCacheConfigurator = portalCacheConfigurator;
	}

	private static PortalCacheConfigurator _portalCacheConfigurator;

}