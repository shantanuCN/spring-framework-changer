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

package org.springframework.mail.javamail;

import java.io.InputStream;
import org.springframework.mail.javamail.JavaMailSender_1;
import javax.mail.internet.MimeMessage;
import org.springframework.mail.javamail.JavaMailSender_2;

import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;

/**
 * Extended {@link org.springframework.mail.MailSender} interface for JavaMail,
 * supporting MIME messages both as direct arguments and through preparation
 * callbacks. Typically used in conjunction with the {@link MimeMessageHelper}
 * class for convenient creation of JavaMail {@link MimeMessage MimeMessages},
 * including attachments etc.
 *
 * <p>Clients should talk to the mail sender through this interface if they need
 * mail functionality beyond {@link org.springframework.mail.SimpleMailMessage}.
 * The production implementation is {@link JavaMailSenderImpl}; for testing,
 * mocks can be created based on this interface. Clients will typically receive
 * the JavaMailSender reference through dependency injection.
 *
 * <p>The recommended way of using this interface is the {@link MimeMessagePreparator}
 * mechanism, possibly using a {@link MimeMessageHelper} for populating the message.
 * See {@link MimeMessageHelper MimeMessageHelper's javadoc} for an example.
 *
 * <p>The entire JavaMail {@link javax.mail.Session} management is abstracted
 * by the JavaMailSender. Client code should not deal with a Session in any way,
 * rather leave the entire JavaMail configuration and resource handling to the
 * JavaMailSender implementation. This also increases testability.
 *
 * <p>A JavaMailSender client is not as easy to test as a plain
 * {@link org.springframework.mail.MailSender} client, but still straightforward
 * compared to traditional JavaMail code: Just let {@link #createMimeMessage()}
 * return a plain {@link MimeMessage} created with a
 * {@code Session.getInstance(new Properties())} call, and check the passed-in
 * messages in your mock implementations of the various {@code send} methods.
 *
 * @author Juergen Hoeller
 * @since 07.10.2003
 * @see javax.mail.internet.MimeMessage
 * @see javax.mail.Session
 * @see JavaMailSenderImpl
 * @see MimeMessagePreparator
 * @see MimeMessageHelper
 */
public interface JavaMailSender extends MailSender, JavaMailSender_2, JavaMailSender_1 {

}
