package org.la.att.system.service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.la.att.system.dto.Mail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;


@Service
public class EmailService {

	@Autowired
	private JavaMailSender emailSender;

	public void sendMail(Mail mail) throws MessagingException {

		MimeMessage message = emailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, true);

		helper.setSubject(mail.getSubject());
		helper.setText(mail.getBodyContent(), true);
		helper.setTo(mail.getTo());
		helper.setFrom(mail.getTo());

		emailSender.send(message);

	}
}