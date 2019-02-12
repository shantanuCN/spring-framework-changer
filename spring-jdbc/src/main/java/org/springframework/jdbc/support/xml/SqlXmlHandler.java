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

package org.springframework.jdbc.support.xml;

import java.io.InputStream;
import org.springframework.jdbc.support.xml.SqlXmlHandler_1;
import java.io.Reader;
import org.springframework.jdbc.support.xml.SqlXmlHandler_2;
import java.sql.ResultSet;
import org.springframework.jdbc.support.xml.SqlXmlHandler_3;
import java.sql.SQLException;
import org.springframework.jdbc.support.xml.SqlXmlHandler_4;
import javax.xml.transform.Result;
import org.springframework.jdbc.support.xml.SqlXmlHandler_5;
import javax.xml.transform.Source;

import org.w3c.dom.Document;

import org.springframework.lang.Nullable;

/**
 * Abstraction for handling XML fields in specific databases. Its main purpose
 * is to isolate database-specific handling of XML stored in the database.
 *
 * <p>JDBC 4.0 introduces the new data type {@code java.sql.SQLXML}
 * but most databases and their drivers currently rely on database-specific
 * data types and features.
 *
 * <p>Provides accessor methods for XML fields and acts as factory for
 * {@link SqlXmlValue} instances.
 *
 * @author Thomas Risberg
 * @since 2.5.5
 * @see Jdbc4SqlXmlHandler
 * @see java.sql.SQLXML
 * @see java.sql.ResultSet#getSQLXML
 * @see java.sql.PreparedStatement#setSQLXML
 */
public interface SqlXmlHandler extends SqlXmlHandler_5, SqlXmlHandler_4, SqlXmlHandler_3, SqlXmlHandler_2, SqlXmlHandler_1 {

	//-------------------------------------------------------------------------
	// Convenience methods for accessing XML content
	//-------------------------------------------------------------------------

	


	//-------------------------------------------------------------------------
	// Convenience methods for building XML content
	//-------------------------------------------------------------------------

	

}
