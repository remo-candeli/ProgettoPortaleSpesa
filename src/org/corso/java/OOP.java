package org.corso.java;

import org.corso.java.servizi.ServiziUtente;

import java.util.Scanner;

/**
 * Scriviamo una applicazione che gestisce gli utenti di un portale che vende prodotti online.
 * Il cliente ci chiede di fare alcune verifiche se l´utente si vuole cancellare.
 * Non possono esistere carrelli attivi per un cliente cancellato.
 * Il carrello deve essere, a sua volta rimosso.
 * 
 * Proviamo con l´oop.
 * 
 * @author remos
 */
public class OOP {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Crea Utente: 1");  
		System.out.println("Elimina Utente: 2");
		System.out.println("Modifica Utente: 3");
		
		System.out.println("\nScegli opzione: ");
        int opzione = in.nextInt();
        
        ServiziUtente serviziUtente = new ServiziUtente();
        
        if (opzione==1)
        	serviziUtente.creaUtente("Candeli", "CandeliR", "Test");
        
        if (opzione==2)
        	serviziUtente.eliminaUtente("Candeli");
        
        if (opzione==3)
        	serviziUtente.modificaUtente("CandeliR", "Candeli", "testX");
		
	}
	
}
