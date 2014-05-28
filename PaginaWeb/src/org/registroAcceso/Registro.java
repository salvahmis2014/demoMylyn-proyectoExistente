package org.registroAcceso;

public class Registro {

	private String stringConnectionDB;
	
	public Registro(String stringConnectionDB){
		this.stringConnectionDB=stringConnectionDB;
	}

	public String getStringConnectionDB() {
		return stringConnectionDB;
	}

	public void setStringConnectionDB(String stringConnectionDB) {
		this.stringConnectionDB = stringConnectionDB;
	}
	
	public boolean comprobarPass(Usuario user){
		if(user.getPass().length()>8)
			return true;
		return false;
	}
}
