package org.la.ecom.notification.service;

import javax.activation.DataHandler;
import javax.mail.MessagingException;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.util.ByteArrayDataSource;

import org.la.ecom.notification.dto.Mail;
import org.la.ecom.notification.dto.MailAttachment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamSource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender emailSender;

	public void sendSimpleMessage(Mail mail) throws MessagingException {

		MimeMessage message = emailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, true);

		helper.setSubject(mail.getSubject());
		helper.setText(mail.getBodyContent(), true);
		helper.setTo(mail.getTo());
		helper.setFrom(mail.getTo());

		MailAttachment mailAttachment = mail.getMailAttachment();

		if (mailAttachment != null && mailAttachment.getFile() != null) {
			
			 ByteArrayDataSource byteArrayDataSource = new ByteArrayDataSource(mailAttachment.getFile(), "application/pdf");
			 helper.addAttachment(mailAttachment.getFileName()+".pdf", byteArrayDataSource);
		} else {
			
			helper.addAttachment("entry_exit.jpg", new ClassPathResource("/static/entry_exit.jpg"));
		}

		emailSender.send(message);

	}
}