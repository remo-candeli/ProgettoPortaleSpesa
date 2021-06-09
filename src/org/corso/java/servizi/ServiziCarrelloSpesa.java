package org.corso.java.servizi;


import org.corso.java.daos.CarrelloSpesaDao;
import org.corso.java.models.CarrelloSpesa;
import org.corso.java.models.Utente;

public class ServiziCarrelloSpesa {

	private CarrelloSpesaDao carrelloSpesaDao;
	
	

	public ServiziCarrelloSpesa() {
		carrelloSpesaDao = new CarrelloSpesaDao();
	}


	public CarrelloSpesa getCarrelloDellaSpesaUtente(Utente utenteIn) {
		// qui verifichiamo se esiste un carrello della spesa per l´utente.
		CarrelloSpesa carrelloSpesa = null;
		
		// Simuliamo la presenza di un carrello della spesa
		if (utenteIn.getUsername().equals("CandeliR")) {
			carrelloSpesa = new CarrelloSpesa();
			carrelloSpesa.setUtente(utenteIn);
		}
		return carrelloSpesa;
	}
	
	
	public static void rimuoviCarrelloDellaSpesa(CarrelloSpesa carrello) {
		System.out.println("Carrello Spesa é stato cancellato.");
	}
}
