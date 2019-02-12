package org.springframework.mail.javamail;

import java.io.InputStream;
import javax.mail.internet.MimeMessage;
import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;

public interface JavaMailSender_2 extends MailSender {
    void send(MimeMessage mimeMessage) throws MailException;

    void send(MimeMessage... mimeMessages) throws MailException;

    void send(MimeMessagePreparator mimeMessagePreparator) throws MailException;

    void send(MimeMessagePreparator... mimeMessagePreparators) throws MailException;
}
