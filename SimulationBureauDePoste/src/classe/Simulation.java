/*
 * Simulation.java                                                          8 d�c. 2020
 * 3IL 2020 - 2021, groupe 2 ni copyright ni copyleft 
 */
package classe;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Classe permettant de simuler les actions d'un bureau de poste
 * @author f.mazenq
 *
 */
public class Simulation {



    /** TODO commenter le r�le de ce champ (attribut, r�le d'association) */
    private int iNbGuichetParticulier;
    
    /** TODO commenter le r�le de ce champ (attribut, r�le d'association) */
    private int iNbGuichetProfessionnel;   
    
    /** TODO commenter le r�le de ce champ (attribut, r�le d'association) */
    private int iNbClientParticulier;
    
    /** TODO commenter le r�le de ce champ (attribut, r�le d'association) */
    private int iNbClientProfessionnel;  
    
    /** TODO commenter le r�le de ce champ (attribut, r�le d'association) */
    private int iDureeSimulation;   
    
    /** TODO commenter le r�le de ce champ (attribut, r�le d'association) */
    private int iChrono;

    /** TODO commenter le r�le de ce champ (attribut, r�le d'association) */
    private BureauDePoste oBureauDePoste = new BureauDePoste();
    
    /**
     * TODO commenter l'�tat initial construit
     */
    public Simulation() {
        super();
        this.iNbGuichetParticulier = 0;
        this.iNbGuichetProfessionnel = 0;
        this.iDureeSimulation = 0;
        this.iChrono = 0; 
        this.oBureauDePoste = new BureauDePoste();
    }


    /**
     * TODO commenter l'�tat initial construit
     * @param iNbGuichetParticulier
     * @param iNbGuichetProfessionnel
     * @param iDureeSimulation
     * @param chrono
     */
    public Simulation(int iNbGuichetParticulier, int iNbGuichetProfessionnel, int iDureeSimulation, int chrono) {
        super();
        this.iNbGuichetParticulier = iNbGuichetParticulier;
        this.iNbGuichetProfessionnel = iNbGuichetProfessionnel;
        this.iDureeSimulation = iDureeSimulation;
        this.iChrono = chrono;
        this.oBureauDePoste = new BureauDePoste();       
    }
    
    /**
     * M�thode permettant d'ajouter les clients � un bureau de poste
     */
    public void ajouterClientsBureauPoste() {
        // Liste des clients
        // Cr�ation de quelque service 
        Service serviceUn = new Service ("Achat de timbre", 5);
        Service serviceDeux = new Service ("Achat d'enveloppe", 5);

        
        int idClient = 1;

        // Creation des clients particulier et ajout � notre bureau de poste
        for (int i = 0 ; i < iNbClientParticulier; i++) {    
            
            Client client = new Client(serviceUn,0,"client" + idClient,false);
            idClient++;
            oBureauDePoste.ajouterClient(client);       
        }
        
        // Creation des clients professionnels et ajout � notre bureau de poste
        for (int i = 0 ; i < iNbClientProfessionnel; i++) {    
            
            Client client = new Client(serviceDeux,0,"client" + idClient,true);
            idClient++;
            oBureauDePoste.ajouterClient(client);       
        }      
    }  
}
