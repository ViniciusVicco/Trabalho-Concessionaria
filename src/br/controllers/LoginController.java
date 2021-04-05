package br.controllers;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.models.Login;
@Named
@ViewScoped
public class LoginController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1919145528239045155L;
	
	Login login = new Login();

	public Login getLogin() {
		if(login == null) {
			login = new Login();
		}
		return login;
	}
	
	public void enviar() {
		System.out.println("Enviar");
	}

	public void setLogin(Login login) {
		this.login = login;
	}
	
	
		
}
