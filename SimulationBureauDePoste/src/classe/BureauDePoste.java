/*
 * BureauDePoste.java                                                          8 d�c. 2020
 * 3IL 2020 - 2021, groupe 2 ni copyright ni copyleft 
 */
package classe;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Classe repr�sentant un bureau de poste avec ses guichets, et ses clients
 * @author f.mazenq
 *
 */
public class BureauDePoste {

    /** Liste des guichets de notre Bureau de poste */
    private ArrayList<Guichet> listeGuichet = new ArrayList<Guichet>() ;
    
    /** Liste des clients de notre Bureau de poste */
    private ConcurrentLinkedQueue<Client> listeClient = new ConcurrentLinkedQueue<Client>();

    
    /**
     * Constructeur par d�faut
     */
    public BureauDePoste() {
        super();
        this.listeGuichet = new ArrayList<Guichet>() ;
        this.listeClient = new ConcurrentLinkedQueue<Client>();
    }

    /**
     * Constructeur d'un bureau de poste
     * @param listeGuichet
     * @param listeClient
     */
    public BureauDePoste(ArrayList<Guichet> listeGuichet, ConcurrentLinkedQueue<Client> listeClient) {
        super();
        this.listeGuichet = listeGuichet;
        this.listeClient = listeClient;
    }

    /**
     * TODO commenter le r�le de cette m�thode
     * @return la liste des guichets
     */
    public ArrayList<Guichet> getListeGuichet() {
        return listeGuichet;
    }

    /**
     * TODO commenter le r�le de cette m�thode
     * @param listeGuichet
     */
    public void setListeGuichet(ArrayList<Guichet> listeGuichet) {
        this.listeGuichet = listeGuichet;
    }

    /**
     * TODO commenter le r�le de cette m�thode
     * @return la liste des clients
     */
    public ConcurrentLinkedQueue<Client> getListeClient() {
        return listeClient;
    }

    /**
     * TODO commenter le r�le de cette m�thode
     * @param listeClient
     */
    public void setListeClient(ConcurrentLinkedQueue<Client> listeClient) {
        this.listeClient = listeClient;
    }
    
    
}
