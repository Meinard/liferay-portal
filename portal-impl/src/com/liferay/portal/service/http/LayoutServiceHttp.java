/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.liferay.portal.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;
import com.liferay.portal.security.auth.HttpPrincipal;
import com.liferay.portal.service.LayoutServiceUtil;

/**
 * Provides the HTTP utility for the
 * {@link com.liferay.portal.service.LayoutServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * {@link com.liferay.portal.security.auth.HttpPrincipal} parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LayoutServiceSoap
 * @see com.liferay.portal.security.auth.HttpPrincipal
 * @see com.liferay.portal.service.LayoutServiceUtil
 * @generated
 */
public class LayoutServiceHttp {
	public static com.liferay.portal.model.Layout addLayout(
		HttpPrincipal httpPrincipal, long groupId, boolean privateLayout,
		long parentLayoutId,
		java.util.Map<java.util.Locale, java.lang.String> localeNamesMap,
		java.util.Map<java.util.Locale, java.lang.String> localeTitlesMap,
		java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
		java.util.Map<java.util.Locale, java.lang.String> keywordsMap,
		java.util.Map<java.util.Locale, java.lang.String> robotsMap,
		java.lang.String type, boolean hidden, java.lang.String friendlyURL,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"addLayout", _addLayoutParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					privateLayout, parentLayoutId, localeNamesMap,
					localeTitlesMap, descriptionMap, keywordsMap, robotsMap,
					type, hidden, friendlyURL, serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.portal.model.Layout)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portal.model.Layout addLayout(
		HttpPrincipal httpPrincipal, long groupId, boolean privateLayout,
		long parentLayoutId,
		java.util.Map<java.util.Locale, java.lang.String> localeNamesMap,
		java.util.Map<java.util.Locale, java.lang.String> localeTitlesMap,
		java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
		java.util.Map<java.util.Locale, java.lang.String> keywordsMap,
		java.util.Map<java.util.Locale, java.lang.String> robotsMap,
		java.lang.String type, java.lang.String typeSettings, boolean hidden,
		java.util.Map<java.util.Locale, java.lang.String> friendlyURLMap,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"addLayout", _addLayoutParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					privateLayout, parentLayoutId, localeNamesMap,
					localeTitlesMap, descriptionMap, keywordsMap, robotsMap,
					type, typeSettings, hidden, friendlyURLMap, serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.portal.model.Layout)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portal.model.Layout addLayout(
		HttpPrincipal httpPrincipal, long groupId, boolean privateLayout,
		long parentLayoutId, java.lang.String name, java.lang.String title,
		java.lang.String description, java.lang.String type, boolean hidden,
		java.lang.String friendlyURL,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"addLayout", _addLayoutParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					privateLayout, parentLayoutId, name, title, description,
					type, hidden, friendlyURL, serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.portal.model.Layout)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portal.kernel.repository.model.FileEntry addTempFileEntry(
		HttpPrincipal httpPrincipal, long groupId, java.lang.String fileName,
		java.lang.String tempFolderName, java.io.InputStream inputStream,
		java.lang.String mimeType)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"addTempFileEntry", _addTempFileEntryParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					fileName, tempFolderName, inputStream, mimeType);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.portal.kernel.repository.model.FileEntry)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static void deleteLayout(HttpPrincipal httpPrincipal, long groupId,
		boolean privateLayout, long layoutId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"deleteLayout", _deleteLayoutParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					privateLayout, layoutId, serviceContext);

			try {
				TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static void deleteLayout(HttpPrincipal httpPrincipal, long plid,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"deleteLayout", _deleteLayoutParameterTypes5);

			MethodHandler methodHandler = new MethodHandler(methodKey, plid,
					serviceContext);

			try {
				TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static void deleteTempFileEntry(HttpPrincipal httpPrincipal,
		long groupId, java.lang.String fileName, java.lang.String tempFolderName)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"deleteTempFileEntry", _deleteTempFileEntryParameterTypes6);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					fileName, tempFolderName);

			try {
				TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static byte[] exportLayouts(HttpPrincipal httpPrincipal,
		long groupId, boolean privateLayout, long[] layoutIds,
		java.util.Map<java.lang.String, java.lang.String[]> parameterMap,
		java.util.Date startDate, java.util.Date endDate)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"exportLayouts", _exportLayoutsParameterTypes7);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					privateLayout, layoutIds, parameterMap, startDate, endDate);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (byte[])returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static byte[] exportLayouts(HttpPrincipal httpPrincipal,
		long groupId, boolean privateLayout,
		java.util.Map<java.lang.String, java.lang.String[]> parameterMap,
		java.util.Date startDate, java.util.Date endDate)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"exportLayouts", _exportLayoutsParameterTypes8);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					privateLayout, parameterMap, startDate, endDate);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (byte[])returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.io.File exportLayoutsAsFile(
		HttpPrincipal httpPrincipal, long groupId, boolean privateLayout,
		long[] layoutIds,
		java.util.Map<java.lang.String, java.lang.String[]> parameterMap,
		java.util.Date startDate, java.util.Date endDate)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"exportLayoutsAsFile", _exportLayoutsAsFileParameterTypes9);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					privateLayout, layoutIds, parameterMap, startDate, endDate);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.io.File)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static long exportLayoutsAsFileInBackground(
		HttpPrincipal httpPrincipal, java.lang.String taskName, long groupId,
		boolean privateLayout, long[] layoutIds,
		java.util.Map<java.lang.String, java.lang.String[]> parameterMap,
		java.util.Date startDate, java.util.Date endDate,
		java.lang.String fileName)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"exportLayoutsAsFileInBackground",
					_exportLayoutsAsFileInBackgroundParameterTypes10);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					taskName, groupId, privateLayout, layoutIds, parameterMap,
					startDate, endDate, fileName);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return ((Long)returnObj).longValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static byte[] exportPortletInfo(HttpPrincipal httpPrincipal,
		long plid, long groupId, java.lang.String portletId,
		java.util.Map<java.lang.String, java.lang.String[]> parameterMap,
		java.util.Date startDate, java.util.Date endDate)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"exportPortletInfo", _exportPortletInfoParameterTypes11);

			MethodHandler methodHandler = new MethodHandler(methodKey, plid,
					groupId, portletId, parameterMap, startDate, endDate);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (byte[])returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static byte[] exportPortletInfo(HttpPrincipal httpPrincipal,
		long companyId, java.lang.String portletId,
		java.util.Map<java.lang.String, java.lang.String[]> parameterMap,
		java.util.Date startDate, java.util.Date endDate)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"exportPortletInfo", _exportPortletInfoParameterTypes12);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					companyId, portletId, parameterMap, startDate, endDate);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (byte[])returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.io.File exportPortletInfoAsFile(
		HttpPrincipal httpPrincipal, long plid, long groupId,
		java.lang.String portletId,
		java.util.Map<java.lang.String, java.lang.String[]> parameterMap,
		java.util.Date startDate, java.util.Date endDate)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"exportPortletInfoAsFile",
					_exportPortletInfoAsFileParameterTypes13);

			MethodHandler methodHandler = new MethodHandler(methodKey, plid,
					groupId, portletId, parameterMap, startDate, endDate);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.io.File)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.io.File exportPortletInfoAsFile(
		HttpPrincipal httpPrincipal, long companyId,
		java.lang.String portletId,
		java.util.Map<java.lang.String, java.lang.String[]> parameterMap,
		java.util.Date startDate, java.util.Date endDate)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"exportPortletInfoAsFile",
					_exportPortletInfoAsFileParameterTypes14);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					companyId, portletId, parameterMap, startDate, endDate);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.io.File)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static long exportPortletInfoAsFileInBackground(
		HttpPrincipal httpPrincipal, long userId, java.lang.String taskName,
		java.lang.String portletId,
		java.util.Map<java.lang.String, java.lang.String[]> parameterMap,
		java.util.Date startDate, java.util.Date endDate,
		java.lang.String fileName)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"exportPortletInfoAsFileInBackground",
					_exportPortletInfoAsFileInBackgroundParameterTypes15);

			MethodHandler methodHandler = new MethodHandler(methodKey, userId,
					taskName, portletId, parameterMap, startDate, endDate,
					fileName);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return ((Long)returnObj).longValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static long exportPortletInfoAsFileInBackground(
		HttpPrincipal httpPrincipal, java.lang.String taskName, long plid,
		long groupId, java.lang.String portletId,
		java.util.Map<java.lang.String, java.lang.String[]> parameterMap,
		java.util.Date startDate, java.util.Date endDate,
		java.lang.String fileName)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"exportPortletInfoAsFileInBackground",
					_exportPortletInfoAsFileInBackgroundParameterTypes16);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					taskName, plid, groupId, portletId, parameterMap,
					startDate, endDate, fileName);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return ((Long)returnObj).longValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<com.liferay.portal.model.Layout> getAncestorLayouts(
		HttpPrincipal httpPrincipal, long plid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"getAncestorLayouts", _getAncestorLayoutsParameterTypes17);

			MethodHandler methodHandler = new MethodHandler(methodKey, plid);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.util.List<com.liferay.portal.model.Layout>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static long getDefaultPlid(HttpPrincipal httpPrincipal,
		long groupId, long scopeGroupId, boolean privateLayout,
		java.lang.String portletId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"getDefaultPlid", _getDefaultPlidParameterTypes18);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					scopeGroupId, privateLayout, portletId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return ((Long)returnObj).longValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static long getDefaultPlid(HttpPrincipal httpPrincipal,
		long groupId, long scopeGroupId, java.lang.String portletId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"getDefaultPlid", _getDefaultPlidParameterTypes19);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					scopeGroupId, portletId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return ((Long)returnObj).longValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portal.model.Layout getLayoutByUuidAndGroupId(
		HttpPrincipal httpPrincipal, java.lang.String uuid, long groupId,
		boolean privateLayout)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"getLayoutByUuidAndGroupId",
					_getLayoutByUuidAndGroupIdParameterTypes20);

			MethodHandler methodHandler = new MethodHandler(methodKey, uuid,
					groupId, privateLayout);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.portal.model.Layout)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.lang.String getLayoutName(HttpPrincipal httpPrincipal,
		long groupId, boolean privateLayout, long layoutId,
		java.lang.String languageId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"getLayoutName", _getLayoutNameParameterTypes21);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					privateLayout, layoutId, languageId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.lang.String)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portal.model.LayoutReference[] getLayoutReferences(
		HttpPrincipal httpPrincipal, long companyId,
		java.lang.String portletId, java.lang.String preferencesKey,
		java.lang.String preferencesValue)
		throws com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"getLayoutReferences", _getLayoutReferencesParameterTypes22);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					companyId, portletId, preferencesKey, preferencesValue);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.portal.model.LayoutReference[])returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<com.liferay.portal.model.Layout> getLayouts(
		HttpPrincipal httpPrincipal, long groupId, boolean privateLayout)
		throws com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"getLayouts", _getLayoutsParameterTypes23);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					privateLayout);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.util.List<com.liferay.portal.model.Layout>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<com.liferay.portal.model.Layout> getLayouts(
		HttpPrincipal httpPrincipal, long groupId, boolean privateLayout,
		long parentLayoutId)
		throws com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"getLayouts", _getLayoutsParameterTypes24);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					privateLayout, parentLayoutId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.util.List<com.liferay.portal.model.Layout>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<com.liferay.portal.model.Layout> getLayouts(
		HttpPrincipal httpPrincipal, long groupId, boolean privateLayout,
		long parentLayoutId, boolean incomplete, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"getLayouts", _getLayoutsParameterTypes25);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					privateLayout, parentLayoutId, incomplete, start, end);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.util.List<com.liferay.portal.model.Layout>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.lang.String[] getTempFileEntryNames(
		HttpPrincipal httpPrincipal, long groupId,
		java.lang.String tempFolderName)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"getTempFileEntryNames",
					_getTempFileEntryNamesParameterTypes26);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					tempFolderName);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.lang.String[])returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static void importLayouts(HttpPrincipal httpPrincipal, long groupId,
		boolean privateLayout,
		java.util.Map<java.lang.String, java.lang.String[]> parameterMap,
		byte[] bytes)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"importLayouts", _importLayoutsParameterTypes27);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					privateLayout, parameterMap, bytes);

			try {
				TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static void importLayouts(HttpPrincipal httpPrincipal, long groupId,
		boolean privateLayout,
		java.util.Map<java.lang.String, java.lang.String[]> parameterMap,
		java.io.File file)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"importLayouts", _importLayoutsParameterTypes28);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					privateLayout, parameterMap, file);

			try {
				TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static void importLayouts(HttpPrincipal httpPrincipal, long groupId,
		boolean privateLayout,
		java.util.Map<java.lang.String, java.lang.String[]> parameterMap,
		java.io.InputStream is)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"importLayouts", _importLayoutsParameterTypes29);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					privateLayout, parameterMap, is);

			try {
				TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static long importLayoutsInBackground(HttpPrincipal httpPrincipal,
		java.lang.String taskName, long groupId, boolean privateLayout,
		java.util.Map<java.lang.String, java.lang.String[]> parameterMap,
		java.io.File file)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"importLayoutsInBackground",
					_importLayoutsInBackgroundParameterTypes30);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					taskName, groupId, privateLayout, parameterMap, file);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return ((Long)returnObj).longValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static void importPortletInfo(HttpPrincipal httpPrincipal,
		long plid, long groupId, java.lang.String portletId,
		java.util.Map<java.lang.String, java.lang.String[]> parameterMap,
		java.io.File file)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"importPortletInfo", _importPortletInfoParameterTypes31);

			MethodHandler methodHandler = new MethodHandler(methodKey, plid,
					groupId, portletId, parameterMap, file);

			try {
				TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static void importPortletInfo(HttpPrincipal httpPrincipal,
		long plid, long groupId, java.lang.String portletId,
		java.util.Map<java.lang.String, java.lang.String[]> parameterMap,
		java.io.InputStream is)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"importPortletInfo", _importPortletInfoParameterTypes32);

			MethodHandler methodHandler = new MethodHandler(methodKey, plid,
					groupId, portletId, parameterMap, is);

			try {
				TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static long importPortletInfoInBackground(
		HttpPrincipal httpPrincipal, java.lang.String taskName, long plid,
		long groupId, java.lang.String portletId,
		java.util.Map<java.lang.String, java.lang.String[]> parameterMap,
		java.io.File file)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"importPortletInfoInBackground",
					_importPortletInfoInBackgroundParameterTypes33);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					taskName, plid, groupId, portletId, parameterMap, file);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return ((Long)returnObj).longValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static long importPortletInfoInBackground(
		HttpPrincipal httpPrincipal, java.lang.String taskName, long plid,
		long groupId, java.lang.String portletId,
		java.util.Map<java.lang.String, java.lang.String[]> parameterMap,
		java.io.InputStream is)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"importPortletInfoInBackground",
					_importPortletInfoInBackgroundParameterTypes34);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					taskName, plid, groupId, portletId, parameterMap, is);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return ((Long)returnObj).longValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static void schedulePublishToLive(HttpPrincipal httpPrincipal,
		long sourceGroupId, long targetGroupId, boolean privateLayout,
		java.util.Map<java.lang.Long, java.lang.Boolean> layoutIdMap,
		java.util.Map<java.lang.String, java.lang.String[]> parameterMap,
		java.lang.String scope, java.util.Date startDate,
		java.util.Date endDate, java.lang.String groupName,
		java.lang.String cronText, java.util.Date schedulerStartDate,
		java.util.Date schedulerEndDate, java.lang.String description)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"schedulePublishToLive",
					_schedulePublishToLiveParameterTypes35);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					sourceGroupId, targetGroupId, privateLayout, layoutIdMap,
					parameterMap, scope, startDate, endDate, groupName,
					cronText, schedulerStartDate, schedulerEndDate, description);

			try {
				TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static void schedulePublishToRemote(HttpPrincipal httpPrincipal,
		long sourceGroupId, boolean privateLayout,
		java.util.Map<java.lang.Long, java.lang.Boolean> layoutIdMap,
		java.util.Map<java.lang.String, java.lang.String[]> parameterMap,
		java.lang.String remoteAddress, int remotePort,
		java.lang.String remotePathContext, boolean secureConnection,
		long remoteGroupId, boolean remotePrivateLayout,
		java.util.Date startDate, java.util.Date endDate,
		java.lang.String groupName, java.lang.String cronText,
		java.util.Date schedulerStartDate, java.util.Date schedulerEndDate,
		java.lang.String description)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"schedulePublishToRemote",
					_schedulePublishToRemoteParameterTypes36);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					sourceGroupId, privateLayout, layoutIdMap, parameterMap,
					remoteAddress, remotePort, remotePathContext,
					secureConnection, remoteGroupId, remotePrivateLayout,
					startDate, endDate, groupName, cronText,
					schedulerStartDate, schedulerEndDate, description);

			try {
				TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static void setLayouts(HttpPrincipal httpPrincipal, long groupId,
		boolean privateLayout, long parentLayoutId, long[] layoutIds,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"setLayouts", _setLayoutsParameterTypes37);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					privateLayout, parentLayoutId, layoutIds, serviceContext);

			try {
				TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static void unschedulePublishToLive(HttpPrincipal httpPrincipal,
		long groupId, java.lang.String jobName, java.lang.String groupName)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"unschedulePublishToLive",
					_unschedulePublishToLiveParameterTypes38);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					jobName, groupName);

			try {
				TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static void unschedulePublishToRemote(HttpPrincipal httpPrincipal,
		long groupId, java.lang.String jobName, java.lang.String groupName)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"unschedulePublishToRemote",
					_unschedulePublishToRemoteParameterTypes39);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					jobName, groupName);

			try {
				TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portal.model.Layout updateLayout(
		HttpPrincipal httpPrincipal, long groupId, boolean privateLayout,
		long layoutId, long parentLayoutId,
		java.util.Map<java.util.Locale, java.lang.String> localeNamesMap,
		java.util.Map<java.util.Locale, java.lang.String> localeTitlesMap,
		java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
		java.util.Map<java.util.Locale, java.lang.String> keywordsMap,
		java.util.Map<java.util.Locale, java.lang.String> robotsMap,
		java.lang.String type, boolean hidden,
		java.util.Map<java.util.Locale, java.lang.String> friendlyURLMap,
		java.lang.Boolean iconImage, byte[] iconBytes,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"updateLayout", _updateLayoutParameterTypes40);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					privateLayout, layoutId, parentLayoutId, localeNamesMap,
					localeTitlesMap, descriptionMap, keywordsMap, robotsMap,
					type, hidden, friendlyURLMap, iconImage, iconBytes,
					serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.portal.model.Layout)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portal.model.Layout updateLayout(
		HttpPrincipal httpPrincipal, long groupId, boolean privateLayout,
		long layoutId, long parentLayoutId,
		java.util.Map<java.util.Locale, java.lang.String> localeNamesMap,
		java.util.Map<java.util.Locale, java.lang.String> localeTitlesMap,
		java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
		java.util.Map<java.util.Locale, java.lang.String> keywordsMap,
		java.util.Map<java.util.Locale, java.lang.String> robotsMap,
		java.lang.String type, boolean hidden, java.lang.String friendlyURL,
		java.lang.Boolean iconImage, byte[] iconBytes,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"updateLayout", _updateLayoutParameterTypes41);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					privateLayout, layoutId, parentLayoutId, localeNamesMap,
					localeTitlesMap, descriptionMap, keywordsMap, robotsMap,
					type, hidden, friendlyURL, iconImage, iconBytes,
					serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.portal.model.Layout)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portal.model.Layout updateLayout(
		HttpPrincipal httpPrincipal, long groupId, boolean privateLayout,
		long layoutId, java.lang.String typeSettings)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"updateLayout", _updateLayoutParameterTypes42);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					privateLayout, layoutId, typeSettings);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.portal.model.Layout)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portal.model.Layout updateLookAndFeel(
		HttpPrincipal httpPrincipal, long groupId, boolean privateLayout,
		long layoutId, java.lang.String themeId,
		java.lang.String colorSchemeId, java.lang.String css, boolean wapTheme)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"updateLookAndFeel", _updateLookAndFeelParameterTypes43);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					privateLayout, layoutId, themeId, colorSchemeId, css,
					wapTheme);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.portal.model.Layout)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portal.model.Layout updateName(
		HttpPrincipal httpPrincipal, long groupId, boolean privateLayout,
		long layoutId, java.lang.String name, java.lang.String languageId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"updateName", _updateNameParameterTypes44);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					privateLayout, layoutId, name, languageId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.portal.model.Layout)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portal.model.Layout updateName(
		HttpPrincipal httpPrincipal, long plid, java.lang.String name,
		java.lang.String languageId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"updateName", _updateNameParameterTypes45);

			MethodHandler methodHandler = new MethodHandler(methodKey, plid,
					name, languageId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.portal.model.Layout)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portal.model.Layout updateParentLayoutId(
		HttpPrincipal httpPrincipal, long groupId, boolean privateLayout,
		long layoutId, long parentLayoutId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"updateParentLayoutId",
					_updateParentLayoutIdParameterTypes46);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					privateLayout, layoutId, parentLayoutId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.portal.model.Layout)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portal.model.Layout updateParentLayoutId(
		HttpPrincipal httpPrincipal, long plid, long parentPlid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"updateParentLayoutId",
					_updateParentLayoutIdParameterTypes47);

			MethodHandler methodHandler = new MethodHandler(methodKey, plid,
					parentPlid);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.portal.model.Layout)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portal.model.Layout updatePriority(
		HttpPrincipal httpPrincipal, long groupId, boolean privateLayout,
		long layoutId, int priority)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"updatePriority", _updatePriorityParameterTypes48);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					privateLayout, layoutId, priority);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.portal.model.Layout)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portal.model.Layout updatePriority(
		HttpPrincipal httpPrincipal, long plid, int priority)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"updatePriority", _updatePriorityParameterTypes49);

			MethodHandler methodHandler = new MethodHandler(methodKey, plid,
					priority);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.portal.model.Layout)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portal.kernel.lar.MissingReferences validateImportLayoutsFile(
		HttpPrincipal httpPrincipal, long groupId, boolean privateLayout,
		java.util.Map<java.lang.String, java.lang.String[]> parameterMap,
		java.io.File file)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"validateImportLayoutsFile",
					_validateImportLayoutsFileParameterTypes50);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					privateLayout, parameterMap, file);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.portal.kernel.lar.MissingReferences)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portal.kernel.lar.MissingReferences validateImportPortletInfo(
		HttpPrincipal httpPrincipal, long plid, long groupId,
		java.lang.String portletId,
		java.util.Map<java.lang.String, java.lang.String[]> parameterMap,
		java.io.File file)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(LayoutServiceUtil.class,
					"validateImportPortletInfo",
					_validateImportPortletInfoParameterTypes51);

			MethodHandler methodHandler = new MethodHandler(methodKey, plid,
					groupId, portletId, parameterMap, file);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.portal.kernel.lar.MissingReferences)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(LayoutServiceHttp.class);
	private static final Class<?>[] _addLayoutParameterTypes0 = new Class[] {
			long.class, boolean.class, long.class, java.util.Map.class,
			java.util.Map.class, java.util.Map.class, java.util.Map.class,
			java.util.Map.class, java.lang.String.class, boolean.class,
			java.lang.String.class,
			com.liferay.portal.service.ServiceContext.class
		};
	private static final Class<?>[] _addLayoutParameterTypes1 = new Class[] {
			long.class, boolean.class, long.class, java.util.Map.class,
			java.util.Map.class, java.util.Map.class, java.util.Map.class,
			java.util.Map.class, java.lang.String.class, java.lang.String.class,
			boolean.class, java.util.Map.class,
			com.liferay.portal.service.ServiceContext.class
		};
	private static final Class<?>[] _addLayoutParameterTypes2 = new Class[] {
			long.class, boolean.class, long.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, boolean.class, java.lang.String.class,
			com.liferay.portal.service.ServiceContext.class
		};
	private static final Class<?>[] _addTempFileEntryParameterTypes3 = new Class[] {
			long.class, java.lang.String.class, java.lang.String.class,
			java.io.InputStream.class, java.lang.String.class
		};
	private static final Class<?>[] _deleteLayoutParameterTypes4 = new Class[] {
			long.class, boolean.class, long.class,
			com.liferay.portal.service.ServiceContext.class
		};
	private static final Class<?>[] _deleteLayoutParameterTypes5 = new Class[] {
			long.class, com.liferay.portal.service.ServiceContext.class
		};
	private static final Class<?>[] _deleteTempFileEntryParameterTypes6 = new Class[] {
			long.class, java.lang.String.class, java.lang.String.class
		};
	private static final Class<?>[] _exportLayoutsParameterTypes7 = new Class[] {
			long.class, boolean.class, long[].class, java.util.Map.class,
			java.util.Date.class, java.util.Date.class
		};
	private static final Class<?>[] _exportLayoutsParameterTypes8 = new Class[] {
			long.class, boolean.class, java.util.Map.class, java.util.Date.class,
			java.util.Date.class
		};
	private static final Class<?>[] _exportLayoutsAsFileParameterTypes9 = new Class[] {
			long.class, boolean.class, long[].class, java.util.Map.class,
			java.util.Date.class, java.util.Date.class
		};
	private static final Class<?>[] _exportLayoutsAsFileInBackgroundParameterTypes10 =
		new Class[] {
			java.lang.String.class, long.class, boolean.class, long[].class,
			java.util.Map.class, java.util.Date.class, java.util.Date.class,
			java.lang.String.class
		};
	private static final Class<?>[] _exportPortletInfoParameterTypes11 = new Class[] {
			long.class, long.class, java.lang.String.class, java.util.Map.class,
			java.util.Date.class, java.util.Date.class
		};
	private static final Class<?>[] _exportPortletInfoParameterTypes12 = new Class[] {
			long.class, java.lang.String.class, java.util.Map.class,
			java.util.Date.class, java.util.Date.class
		};
	private static final Class<?>[] _exportPortletInfoAsFileParameterTypes13 = new Class[] {
			long.class, long.class, java.lang.String.class, java.util.Map.class,
			java.util.Date.class, java.util.Date.class
		};
	private static final Class<?>[] _exportPortletInfoAsFileParameterTypes14 = new Class[] {
			long.class, java.lang.String.class, java.util.Map.class,
			java.util.Date.class, java.util.Date.class
		};
	private static final Class<?>[] _exportPortletInfoAsFileInBackgroundParameterTypes15 =
		new Class[] {
			long.class, java.lang.String.class, java.lang.String.class,
			java.util.Map.class, java.util.Date.class, java.util.Date.class,
			java.lang.String.class
		};
	private static final Class<?>[] _exportPortletInfoAsFileInBackgroundParameterTypes16 =
		new Class[] {
			java.lang.String.class, long.class, long.class,
			java.lang.String.class, java.util.Map.class, java.util.Date.class,
			java.util.Date.class, java.lang.String.class
		};
	private static final Class<?>[] _getAncestorLayoutsParameterTypes17 = new Class[] {
			long.class
		};
	private static final Class<?>[] _getDefaultPlidParameterTypes18 = new Class[] {
			long.class, long.class, boolean.class, java.lang.String.class
		};
	private static final Class<?>[] _getDefaultPlidParameterTypes19 = new Class[] {
			long.class, long.class, java.lang.String.class
		};
	private static final Class<?>[] _getLayoutByUuidAndGroupIdParameterTypes20 = new Class[] {
			java.lang.String.class, long.class, boolean.class
		};
	private static final Class<?>[] _getLayoutNameParameterTypes21 = new Class[] {
			long.class, boolean.class, long.class, java.lang.String.class
		};
	private static final Class<?>[] _getLayoutReferencesParameterTypes22 = new Class[] {
			long.class, java.lang.String.class, java.lang.String.class,
			java.lang.String.class
		};
	private static final Class<?>[] _getLayoutsParameterTypes23 = new Class[] {
			long.class, boolean.class
		};
	private static final Class<?>[] _getLayoutsParameterTypes24 = new Class[] {
			long.class, boolean.class, long.class
		};
	private static final Class<?>[] _getLayoutsParameterTypes25 = new Class[] {
			long.class, boolean.class, long.class, boolean.class, int.class,
			int.class
		};
	private static final Class<?>[] _getTempFileEntryNamesParameterTypes26 = new Class[] {
			long.class, java.lang.String.class
		};
	private static final Class<?>[] _importLayoutsParameterTypes27 = new Class[] {
			long.class, boolean.class, java.util.Map.class, byte[].class
		};
	private static final Class<?>[] _importLayoutsParameterTypes28 = new Class[] {
			long.class, boolean.class, java.util.Map.class, java.io.File.class
		};
	private static final Class<?>[] _importLayoutsParameterTypes29 = new Class[] {
			long.class, boolean.class, java.util.Map.class,
			java.io.InputStream.class
		};
	private static final Class<?>[] _importLayoutsInBackgroundParameterTypes30 = new Class[] {
			java.lang.String.class, long.class, boolean.class,
			java.util.Map.class, java.io.File.class
		};
	private static final Class<?>[] _importPortletInfoParameterTypes31 = new Class[] {
			long.class, long.class, java.lang.String.class, java.util.Map.class,
			java.io.File.class
		};
	private static final Class<?>[] _importPortletInfoParameterTypes32 = new Class[] {
			long.class, long.class, java.lang.String.class, java.util.Map.class,
			java.io.InputStream.class
		};
	private static final Class<?>[] _importPortletInfoInBackgroundParameterTypes33 =
		new Class[] {
			java.lang.String.class, long.class, long.class,
			java.lang.String.class, java.util.Map.class, java.io.File.class
		};
	private static final Class<?>[] _importPortletInfoInBackgroundParameterTypes34 =
		new Class[] {
			java.lang.String.class, long.class, long.class,
			java.lang.String.class, java.util.Map.class,
			java.io.InputStream.class
		};
	private static final Class<?>[] _schedulePublishToLiveParameterTypes35 = new Class[] {
			long.class, long.class, boolean.class, java.util.Map.class,
			java.util.Map.class, java.lang.String.class, java.util.Date.class,
			java.util.Date.class, java.lang.String.class, java.lang.String.class,
			java.util.Date.class, java.util.Date.class, java.lang.String.class
		};
	private static final Class<?>[] _schedulePublishToRemoteParameterTypes36 = new Class[] {
			long.class, boolean.class, java.util.Map.class, java.util.Map.class,
			java.lang.String.class, int.class, java.lang.String.class,
			boolean.class, long.class, boolean.class, java.util.Date.class,
			java.util.Date.class, java.lang.String.class, java.lang.String.class,
			java.util.Date.class, java.util.Date.class, java.lang.String.class
		};
	private static final Class<?>[] _setLayoutsParameterTypes37 = new Class[] {
			long.class, boolean.class, long.class, long[].class,
			com.liferay.portal.service.ServiceContext.class
		};
	private static final Class<?>[] _unschedulePublishToLiveParameterTypes38 = new Class[] {
			long.class, java.lang.String.class, java.lang.String.class
		};
	private static final Class<?>[] _unschedulePublishToRemoteParameterTypes39 = new Class[] {
			long.class, java.lang.String.class, java.lang.String.class
		};
	private static final Class<?>[] _updateLayoutParameterTypes40 = new Class[] {
			long.class, boolean.class, long.class, long.class,
			java.util.Map.class, java.util.Map.class, java.util.Map.class,
			java.util.Map.class, java.util.Map.class, java.lang.String.class,
			boolean.class, java.util.Map.class, java.lang.Boolean.class,
			byte[].class, com.liferay.portal.service.ServiceContext.class
		};
	private static final Class<?>[] _updateLayoutParameterTypes41 = new Class[] {
			long.class, boolean.class, long.class, long.class,
			java.util.Map.class, java.util.Map.class, java.util.Map.class,
			java.util.Map.class, java.util.Map.class, java.lang.String.class,
			boolean.class, java.lang.String.class, java.lang.Boolean.class,
			byte[].class, com.liferay.portal.service.ServiceContext.class
		};
	private static final Class<?>[] _updateLayoutParameterTypes42 = new Class[] {
			long.class, boolean.class, long.class, java.lang.String.class
		};
	private static final Class<?>[] _updateLookAndFeelParameterTypes43 = new Class[] {
			long.class, boolean.class, long.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class, boolean.class
		};
	private static final Class<?>[] _updateNameParameterTypes44 = new Class[] {
			long.class, boolean.class, long.class, java.lang.String.class,
			java.lang.String.class
		};
	private static final Class<?>[] _updateNameParameterTypes45 = new Class[] {
			long.class, java.lang.String.class, java.lang.String.class
		};
	private static final Class<?>[] _updateParentLayoutIdParameterTypes46 = new Class[] {
			long.class, boolean.class, long.class, long.class
		};
	private static final Class<?>[] _updateParentLayoutIdParameterTypes47 = new Class[] {
			long.class, long.class
		};
	private static final Class<?>[] _updatePriorityParameterTypes48 = new Class[] {
			long.class, boolean.class, long.class, int.class
		};
	private static final Class<?>[] _updatePriorityParameterTypes49 = new Class[] {
			long.class, int.class
		};
	private static final Class<?>[] _validateImportLayoutsFileParameterTypes50 = new Class[] {
			long.class, boolean.class, java.util.Map.class, java.io.File.class
		};
	private static final Class<?>[] _validateImportPortletInfoParameterTypes51 = new Class[] {
			long.class, long.class, java.lang.String.class, java.util.Map.class,
			java.io.File.class
		};
}