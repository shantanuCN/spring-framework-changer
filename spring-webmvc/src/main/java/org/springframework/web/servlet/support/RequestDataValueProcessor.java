/*
 * Copyright 2002-2018 the original author or authors.
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

package org.springframework.web.servlet.support;

import java.util.Map;
import org.springframework.web.servlet.support.RequestDataValueProcessor_1;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.servlet.support.RequestDataValueProcessor_2;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.support.RequestDataValueProcessor_3;

/**
 * A contract for inspecting and potentially modifying request data values such
 * as URL query parameters or form field values before they are rendered by a
 * view or before a redirect.
 *
 * <p>Implementations may use this contract for example as part of a solution
 * to provide data integrity, confidentiality, protection against cross-site
 * request forgery (CSRF), and others or for other tasks such as automatically
 * adding a hidden field to all forms and URLs.
 *
 * <p>View technologies that support this contract can obtain an instance to
 * delegate to via {@link RequestContext#getRequestDataValueProcessor()}.
 *
 * @author Rossen Stoyanchev
 * @since 3.1
 */
public interface RequestDataValueProcessor extends RequestDataValueProcessor_3, RequestDataValueProcessor_2, RequestDataValueProcessor_1 {

}
