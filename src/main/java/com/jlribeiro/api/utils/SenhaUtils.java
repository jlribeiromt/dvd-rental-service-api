package com.jlribeiro.api.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SenhaUtils {

	/**
	 * Gera um hash utilizando o BCrypt
	 * 
	 * @param senha
	 * @return String
	 */
	public static String geraBCrypt(String senha) {
		
		if(senha == null) {
			return senha;	
		}
		
		BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();				
		return bCryptEncoder.encode(senha);
	}
	
	/**
	 * Verifica se a senha é válida
	 * 
	 * @param senha 
	 * @param senhaEncoded
	 * @param boolean
	 */
	public static boolean senhaValida(String senha, String senhaEncoded) {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		return bCryptPasswordEncoder.matches(senha, senhaEncoded);
	}
}
