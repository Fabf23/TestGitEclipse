/*
 * Client.java                                                          8 déc. 2020
 * 3IL 2020 - 2021, groupe 2 ni copyright ni copyleft 
 */
package classe;

/**
 * Classe représentant un client du bureau de poste
 * Un client est représenté par un nom, une date d'arrivee (en minute) et par le service
 * pour lequel il se rend au bureau de poste
 * @author f.mazenq
 *
 */
public class Client {

    /** Service pour lequel le client  se rend au bureau */
    private Service oService;
    
    /** Date à laquelle le client rentre dans le bureau de poste (en minute) */
    private int iDateArrivee;

    /** Nom définissant le client */
    private String sNom;
    
    /** Client professionnel ou nom */
    private boolean bEstProfessionnel;
    /**
     * Constructeur par défaut d'un client
     * service par défaut, date d'arrivée à 0 et nom vide
     * client non professionel
     */
    public Client() {
        super();
        this.oService = new Service();
        this.iDateArrivee = 0;
        this.sNom = "";
        this.bEstProfessionnel = false;
    }

    
    /**
     * Constructeur d'un client
     * @param service
     * @param dateArrivee
     * @param nom 
     * @param estProfessionnel 
     */
    public Client(Service service, int dateArrivee, String nom,boolean estProfessionnel) {
        super();
        this.oService = service;
        this.iDateArrivee = dateArrivee;
        this.sNom = nom;
        this.bEstProfessionnel = estProfessionnel;
    }


    /**
     * Accesseur sur le service
     * @return le service du client
     */
    public Service getService() {
        return oService;
    }

    /**
     * Modificateur sur le service
     * @param service
     */
    public void setService(Service service) {
        this.oService = service;
    }

    /**
     * Accesseur sur la date d'arrivée
     * @return la date d'arrivée du client
     */
    public int getDateArrivee() {
        return iDateArrivee;
    }

    /**
     * Modificateur sur la date d'arrivée
     * @param dateArrivee du client
     */
    public void setDateArrivee(int dateArrivee) {
        this.iDateArrivee = dateArrivee;
    }

    /**
     * Accesseur sur le nom du client
     * @return le nom du client
     */
    public String getNom() {
        return sNom;
    }

    /**
     * Modificateur sur le nom du client
     * @param nom
     */
    public void setNom(String nom) {
        this.sNom = nom;
    }
    
    /**
     * TODO commenter le rôle de cette méthode
     * @return true si le client est professionnel false sinon
     */
    public boolean getbEstProfessionnel() {
        return bEstProfessionnel;
    }


    /**
     * TODO commenter le rôle de cette méthode
     * @param bEstProfessionnel
     */
    public void setbEstProfessionnel(boolean bEstProfessionnel) {
        this.bEstProfessionnel = bEstProfessionnel;
    }
    
}
