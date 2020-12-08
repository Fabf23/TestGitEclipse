/*
 * Service.java                                                          8 d�c. 2020
 * 3IL 2020 - 2021, groupe 2 ni copyright ni copyleft 
 */
package classe;

/**
 * Classe repr�sentant un service.
 * Un service est un besoin pour lequel le client se rend au bureau de poste
 * Il est repr�sent� par une dur�e et un nom
 * @author f.mazenq
 *
 */
public class Service {


    /** Nom du service */
    private String sNom;
    
    /** Duree du service exprim� en minute */
    private int iDuree;

    
    /**
     * Constructeur par d�faut pour instancier un service
     * Par d�faut, nom sans valeur particuli�re et dur�e � 0
     */
    public Service() {
        super();
        this.sNom = "";
        this.iDuree = 0;
    }


    /**
     * Constructeur d'un service 
     * @param nom
     * @param duree
     */
    public Service(String nom, int duree) {
        super();
        this.sNom = nom;
        this.iDuree = duree;
    }


    /**
     *  Accesseur sur le nom
     * @return le nom du service
     */
    public String getNom() {
        return sNom;
    }


    /**
     *  Modificateur sur le nom
     * @param nom le nouveau nom
     */
    public void setNom(String nom) {
        this.sNom = nom;
    }


    /**
     * Accesseur sur la dur�e
     * @return la dur�e du service
     */
    public int getDuree() {
        return iDuree;
    }


    /**
     * Modificateur sur la dur�e
     * @param duree la nouvelle duree
     */
    public void setDuree(int duree) {
        this.iDuree = duree;
    }
    
}
