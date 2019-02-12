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
package org.springframework.web.util;

import org.springframework.web.util.UriBuilderFactory_1;
import org.springframework.web.util.UriBuilderFactory_2;

/**
 * Factory to create {@link UriBuilder} instances with shared configuration
 * such as a base URI, an encoding mode strategy, and others across all URI
 * builder instances created through a factory.
 *
 * @author Rossen Stoyanchev
 * @since 5.0
 */
public interface UriBuilderFactory extends UriTemplateHandler, UriBuilderFactory_2, UriBuilderFactory_1 {

}
