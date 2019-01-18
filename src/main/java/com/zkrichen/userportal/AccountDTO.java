package com.zkrichen.userportal;

import java.io.Serializable;

public class AccountDTO implements Serializable{
	private Long id;
	private String email="";
	private String login="";
	private String jsessionID="";
	
	public AccountDTO() {
		
	}
	public AccountDTO(String sessionID) {
		this.jsessionID=sessionID;
	}
	public AccountDTO(Long id, String email, String login) {
		super();
		this.id = id;
		this.email = email;
		this.login = login;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getJsessionID() {
		return jsessionID;
	}
	public void setJsessionID(String jsessionID) {
		this.jsessionID = jsessionID;
	}
	
	

}