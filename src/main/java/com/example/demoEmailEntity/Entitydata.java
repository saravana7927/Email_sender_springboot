package com.example.demoEmailEntity;

public class Entitydata {
	private String tomail;
	private String text;
	private String subject;

	public String getTomail() {
		return tomail;
	}

	public void setTomail(String tomail) {
		this.tomail = tomail;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Entitydata(String tomail, String text, String subject) {
		super();
		this.tomail = tomail;
		this.text = text;
		this.subject = subject;
	}

	public Entitydata() {
		super();
		// TODO Auto-generated constructor stub
	}
}
