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

package org.springframework.web.server.i18n;

import org.springframework.context.i18n.LocaleContext;
import org.springframework.web.server.i18n.LocaleContextResolver_1;
import org.springframework.lang.Nullable;
import org.springframework.web.server.i18n.LocaleContextResolver_2;
import org.springframework.web.server.ServerWebExchange;

/**
 * Interface for web-based locale context resolution strategies that allows
 * for both locale context resolution via the request and locale context modification
 * via the HTTP exchange.
 *
 * <p>The {@link org.springframework.context.i18n.LocaleContext} object can potentially
 * includes associated time zone and other locale related information.
 *
 * @author Sebastien Deleuze
 * @since 5.0
 * @see LocaleContext
 */
public interface LocaleContextResolver extends LocaleContextResolver_2, LocaleContextResolver_1 {

}
