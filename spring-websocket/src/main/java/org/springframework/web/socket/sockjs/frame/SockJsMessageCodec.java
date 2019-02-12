/*
 * Copyright 2002-2014 the original author or authors.
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

package org.springframework.web.socket.sockjs.frame;

import java.io.IOException;
import org.springframework.web.socket.sockjs.frame.SockJsMessageCodec_1;
import java.io.InputStream;
import org.springframework.web.socket.sockjs.frame.SockJsMessageCodec_2;

import org.springframework.lang.Nullable;

/**
 * Encode and decode messages to and from a SockJS message frame,
 * essentially an array of JSON-encoded messages. For example:
 *
 * <pre class="code">
 * a["message1","message2"]
 * </pre>
 *
 * @author Rossen Stoyanchev
 * @since 4.0
 */
public interface SockJsMessageCodec extends SockJsMessageCodec_2, SockJsMessageCodec_1 {

}
