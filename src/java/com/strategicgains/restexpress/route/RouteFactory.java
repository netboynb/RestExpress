/*
    Copyright 2011, Strategic Gains, Inc.

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

		http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
*/
package com.strategicgains.restexpress.route;

import java.lang.reflect.Method;

import org.jboss.netty.handler.codec.http.HttpMethod;

/**
 * @author toddf
 * @since Jan 7, 2011
 */
public interface RouteFactory
{
	public Route newRoute(String urlPattern, Object controller, Method action, HttpMethod method, boolean shouldSerializeResponse, String name);
}
