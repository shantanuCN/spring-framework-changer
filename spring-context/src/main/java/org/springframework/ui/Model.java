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

package org.springframework.ui;

import java.util.Collection;
import org.springframework.ui.Model_1;
import java.util.Map;
import org.springframework.ui.Model_2;

import org.springframework.lang.Nullable;

/**
 * Java-5-specific interface that defines a holder for model attributes.
 * Primarily designed for adding attributes to the model.
 * Allows for accessing the overall model as a {@code java.util.Map}.
 *
 * @author Juergen Hoeller
 * @since 2.5.1
 */
public interface Model extends Model_2, Model_1 {

	/**
	 * Copy all attributes in the supplied {@code Map} into this {@code Map},
	 * with existing objects of the same name taking precedence (i.e. not getting
	 * replaced).
	 */
	Model mergeAttributes(Map<String, ?> attributes);

	/**
	 * Does this model contain an attribute of the given name?
	 * @param attributeName the name of the model attribute (never {@code null})
	 * @return whether this model contains a corresponding attribute
	 */
	boolean containsAttribute(String attributeName);

}
