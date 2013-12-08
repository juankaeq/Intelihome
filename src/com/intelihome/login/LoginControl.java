package com.intelihome.login;

import com.intelihome.usuarios.Usuario;

public class LoginControl {
	
	public static int hacerLogin(String username, String password){
		
		Usuario user = new Usuario(username, password);
		return user.authenticateUser(user);
		
	}

}
