package org.corso.java.daos;

import org.corso.java.models.Utente;

public class UtenteDao {
	
	private Database database = new Database();

	public Utente cercaUtente(String username) {
		Utente utente = null;
		// Simuliamo la presenza dell´utente nel database
		if (username.equals("CandeliR")) {			
			utente = new Utente();
			utente.setNome("Candeli");
			utente.setUsername("CandeliR");
			utente.setPassword("test");
		}
		
		return utente;
	}
	
	public Utente modificaUtente(Utente utente) {
		return null;
	}
	
	public void eliminaUtente(Utente utente) {
	}
	
	public Utente creaUtente(String nome, String username, String password) {
		return null;
	}
}
