/*
 * Copyright 2002-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.http.server;

import java.net.URI;
import org.springframework.http.server.RequestPath_1;

import org.springframework.lang.Nullable;
import org.springframework.http.server.RequestPath_2;
import org.springframework.http.server.RequestPath_3;

/**
 * Represents the complete path for a request.
 *
 * @author Rossen Stoyanchev
 * @since 5.0
 */
public interface RequestPath extends PathContainer, RequestPath_3, RequestPath_2, RequestPath_1 {

	/**
	 * Return a new {@code RequestPath} instance with a modified context path.
	 * The new context path must match 0 or more path segments at the start.
	 * @param contextPath the new context path
	 * @return a new {@code RequestPath} instance
	 */
	RequestPath modifyContextPath(String contextPath);


	/**
	 * Create a new {@code RequestPath} with the given parameters.
	 */
	static RequestPath parse(URI uri, @Nullable String contextPath) {
		return new DefaultRequestPath(uri, contextPath);
	}

}
