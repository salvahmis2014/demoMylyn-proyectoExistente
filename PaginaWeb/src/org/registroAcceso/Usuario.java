package org.registroAcceso;

public class Usuario {

	private String email;
	private String pass;
	private String pais;
	
	public Usuario(){
		this.email=null;
		this.pass=null;
		this.pais=null;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
}
