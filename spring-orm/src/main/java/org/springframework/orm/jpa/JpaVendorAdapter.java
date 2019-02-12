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

package org.springframework.orm.jpa;

import java.util.Collections;
import org.springframework.orm.jpa.JpaVendorAdapter_1;
import java.util.Map;
import org.springframework.orm.jpa.JpaVendorAdapter_2;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.spi.PersistenceProvider;
import javax.persistence.spi.PersistenceUnitInfo;

import org.springframework.lang.Nullable;

/**
 * SPI interface that allows to plug in vendor-specific behavior
 * into Spring's EntityManagerFactory creators. Serves as single
 * configuration point for all vendor-specific properties.
 *
 * @author Juergen Hoeller
 * @author Rod Johnson
 * @since 2.0
 * @see AbstractEntityManagerFactoryBean#setJpaVendorAdapter
 */
public interface JpaVendorAdapter extends JpaVendorAdapter_2, JpaVendorAdapter_1 {

}
