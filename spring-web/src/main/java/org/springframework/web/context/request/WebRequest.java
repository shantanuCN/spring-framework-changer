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

package org.springframework.web.context.request;

import java.security.Principal;
import org.springframework.web.context.request.WebRequest_1;
import java.util.Iterator;
import org.springframework.web.context.request.WebRequest_2;
import java.util.Locale;
import org.springframework.web.context.request.WebRequest_3;
import java.util.Map;
import org.springframework.web.context.request.WebRequest_4;

import org.springframework.lang.Nullable;
import org.springframework.web.context.request.WebRequest_5;
import org.springframework.web.context.request.WebRequest_6;
import org.springframework.web.context.request.WebRequest_7;
import org.springframework.web.context.request.WebRequest_8;
import org.springframework.web.context.request.WebRequest_9;

/**
 * Generic interface for a web request. Mainly intended for generic web
 * request interceptors, giving them access to general request metadata,
 * not for actual handling of the request.
 *
 * @author Juergen Hoeller
 * @author Brian Clozel
 * @since 2.0
 * @see WebRequestInterceptor
 */
public interface WebRequest extends RequestAttributes, WebRequest_9, WebRequest_8, WebRequest_7, WebRequest_6, 
        WebRequest_5, WebRequest_4, WebRequest_3, WebRequest_2, WebRequest_1 {

}
