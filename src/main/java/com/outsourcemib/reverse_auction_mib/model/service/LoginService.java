package com.outsourcemib.reverse_auction_mib.model.service;

import java.util.List;

import com.google.appengine.api.datastore.KeyFactory;
import com.outsourcemib.reverse_auction_mib.model.persistence.dao.LoginDAO;
import com.outsourcemib.reverse_auction_mib.model.persistence.entity.Login;

public class LoginService {
	
	private LoginDAO loginDAO = new LoginDAO();

	public Login signup(Login arg){
		Login entityLogin = loginDAO.put(arg);
		
		return entityLogin;
	}
	
	public Login get(String id){
		Login login = new Login();
		login.setLoginKey(KeyFactory.createKey("Login", id) );
		return loginDAO.get(login);
	}
	
	public Login delete(Login arg) {
		return new LoginDAO().delete(arg);
	}
	
	public List<Login> listAll() {
		return new LoginDAO().list(null);
	}
}