package org.corso.java.models;

public class CarrelloSpesa {

	
	private Prodotto[] prodotti;
	private Utente utente;
	
	
	public Prodotto[] getProdotti() {
		return prodotti;
	}
	public void setProdotti(Prodotto[] prodotti) {
		this.prodotti = prodotti;
	}
	public Utente getUtente() {
		return utente;
	}
	public void setUtente(Utente utente) {
		this.utente = utente;
	}
	
}
