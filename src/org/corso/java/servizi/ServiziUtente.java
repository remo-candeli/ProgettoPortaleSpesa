package org.corso.java.servizi;

import org.corso.java.daos.UtenteDao;
import org.corso.java.models.CarrelloSpesa;
import org.corso.java.models.Utente;

public class ServiziUtente {
	
	private UtenteDao utenteDao;
	private ServiziCarrelloSpesa serviziCarrelloSpesa;
	
	public ServiziUtente() {
		utenteDao = new UtenteDao();
		serviziCarrelloSpesa = new ServiziCarrelloSpesa();	
	}
	
	public ServiziUtente(String username) {
		this();
	}
	
	public void creaUtente(String nome, String username, String password) {
		Utente utente = new Utente(nome, username, password);
	
		// creiamo il nuovo utente
		System.out.println("\nNuovo utente creato: " + utente);
	}
	
	public void modificaUtente(String username, String cognome, String password) {
		// modifichiamo l´utente
		System.out.println("\nUtente modificato");
	}
	
	
	public void eliminaUtente(String username) {
		// verificare se l´utente esiste		
		Utente utente = utenteDao.cercaUtente(username);
		if (utente==null) {
			System.out.println("\nUtente non esiste");
			return;
		}	
		
		// controllare se esiste una carrello associato all'utente.
		CarrelloSpesa carrelloSpesa = serviziCarrelloSpesa.getCarrelloDellaSpesaUtente(utente);
		if (carrelloSpesa!=null)
			serviziCarrelloSpesa.rimuoviCarrelloDellaSpesa(carrelloSpesa);
		
		// cancelliamo l´utente
		System.out.println("\nUtente cancellato");
	}
	
	// overload del metodo eliminaUtente
	public void eliminaUtente(Utente utenteIn) {
		// verificare se l´utente esiste
		Utente utente = utenteDao.cercaUtente(utenteIn.getUsername());
		if (utente==null)
			System.out.println("\nUtente non esiste cancellato");

		// controllare se esiste una carrello associato all'utente.
		CarrelloSpesa carrelloSpesa = serviziCarrelloSpesa.getCarrelloDellaSpesaUtente(utente);
		if (carrelloSpesa!=null)
			serviziCarrelloSpesa.rimuoviCarrelloDellaSpesa(carrelloSpesa);
		
		// cancelliamo l´utente
		System.out.println("\nUtente cancellato");
	}

}
