package com.example.demo.EmailController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.RestController;


import com.example.demoEmailEntity.Entitydata;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class EmailController {
	@Autowired
	private JavaMailSender jmail;

	@PostMapping("/send")
	public ResponseEntity<String> postMethodName(@RequestBody Entitydata user) {

		try {
			SimpleMailMessage sm = new SimpleMailMessage();
			sm.setTo(user.getTomail());
			sm.setFrom("adhiseshan37@gmail.com");
			sm.setSubject(user.getSubject());
			sm.setText(user.getText());

			jmail.send(sm);
			return ResponseEntity.ok("mail sent successfully");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("mail not sent ");

	}

}
