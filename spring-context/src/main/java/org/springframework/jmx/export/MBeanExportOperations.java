/*
 * Copyright 2002-2009 the original author or authors.
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

package org.springframework.jmx.export;

import javax.management.ObjectName;
import org.springframework.jmx.export.MBeanExportOperations_1;
import org.springframework.jmx.export.MBeanExportOperations_2;

/**
 * Interface that defines the set of MBean export operations that are intended to be
 * accessed by application developers during application runtime.
 *
 * <p>This interface should be used to export application resources to JMX using Spring's
 * management interface generation capabilties and, optionally, it's {@link ObjectName}
 * generation capabilities.
 *
 * @author Rob Harrop
 * @since 2.0
 * @see MBeanExporter
 */
public interface MBeanExportOperations extends MBeanExportOperations_2, MBeanExportOperations_1 {

}
