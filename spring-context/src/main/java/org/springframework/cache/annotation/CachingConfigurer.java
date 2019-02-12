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

package org.springframework.cache.annotation;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurer_1;
import org.springframework.cache.interceptor.CacheErrorHandler;
import org.springframework.cache.annotation.CachingConfigurer_2;
import org.springframework.cache.interceptor.CacheResolver;
import org.springframework.cache.annotation.CachingConfigurer_3;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.cache.annotation.CachingConfigurer_4;
import org.springframework.lang.Nullable;

/**
 * Interface to be implemented by @{@link org.springframework.context.annotation.Configuration
 * Configuration} classes annotated with @{@link EnableCaching} that wish or need to
 * specify explicitly how caches are resolved and how keys are generated for annotation-driven
 * cache management. Consider extending {@link CachingConfigurerSupport}, which provides a
 * stub implementation of all interface methods.
 *
 * <p>See @{@link EnableCaching} for general examples and context; see
 * {@link #cacheManager()}, {@link #cacheResolver()} and {@link #keyGenerator()}
 * for detailed instructions.
 *
 * @author Chris Beams
 * @author Stephane Nicoll
 * @since 3.1
 * @see EnableCaching
 * @see CachingConfigurerSupport
 */
public interface CachingConfigurer extends CachingConfigurer_4, CachingConfigurer_3, CachingConfigurer_2, CachingConfigurer_1 {

}
