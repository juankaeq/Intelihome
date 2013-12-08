package com.intelihome.usuarios;

public class Usuario {

	private String username;
	private String password;

	public Usuario(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public int authenticateUser(Usuario user) {
		if (user.username.equals(username)) {
			if (user.password.equals(password)) {
				return 0;
			} else {
				return 1;
			}
		} else {
			return 2;
		}
	}
	
}
