/*
 * Guichet.java                                                          8 d�c. 2020
 * 3IL 2020 - 2021, groupe 2 ni copyright ni copyleft 
 */
package classe;

/**
 * Classe repr�sentant le guichet d'un bureau de poste
 * Un guichet est identifi� par un id
 * @author f.mazenq
 *
 */
public class Guichet {

    /** Id du guichet */
    private int iId;
    
    /** Indique si le guichet est ouvert on nom */
    private boolean bOuvert;
    
    /** Indique si le guichet est disponible ou nom */
    private boolean bOccupe;
    
    /** Client actuellement pr�sent au guichet */
    private Client oClient;
    
    /** Cr�neaux d'ouverture de notre guichet de la forme : [0][0] :
     *  premier cr�neau ...etc... 
     */
    private int[][] iCreneauxOuverture;

    /** Indique si le guichet est d�di� au client professionnel ou non */
    private boolean bEstProfessionnel;
    
    
    
    /**
     * Constructeur d'un guichet
     * @param iId
     * @param bOuvert
     * @param bOccupe
     * @param oClient
     * @param iCreneauxOuverture
     * @param bEstProfessionnel 
     */
    public Guichet(int iId, boolean bOuvert, boolean bOccupe, Client oClient, int[][] iCreneauxOuverture, boolean bEstProfessionnel) {
        super();
        this.iId = iId;
        this.bOuvert = bOuvert;
        this.bOccupe = bOccupe;
        this.oClient = oClient;
        this.iCreneauxOuverture = iCreneauxOuverture;
        this.setbEstProfessionnel(bEstProfessionnel);
    }

    
    /**
     * Constructeur par d�faut
     * Par d�faut guich� ferm�, non occup�, sans client
     */
    public Guichet() {
        super();
        this.iId = 0;
        this.bOuvert = false;
        this.bOccupe = false;
        this.oClient = null;
        this.iCreneauxOuverture = new int [][] {{0,100}};
        this.setbEstProfessionnel(false);
        
    }


    /**
     * TODO commenter le r�le de cette m�thode
     * @return id 
     */
    public int getiId() {
        return iId;
    }

    /**
     * TODO commenter le r�le de cette m�thode
     * @param iId
     */
    public void setiId(int iId) {
        this.iId = iId;
    }

    /**
     * TODO commenter le r�le de cette m�thode
     * @return true si ouvert false sinon
     */
    public boolean isbOuvert() {
        return bOuvert;
    }

    /**
     * TODO commenter le r�le de cette m�thode
     * @param bOuvert
     */
    public void setbOuvert(boolean bOuvert) {
        this.bOuvert = bOuvert;
    }

    /**
     * TODO commenter le r�le de cette m�thode
     * @return true si occupe false sinon
     */
    public boolean isbOccupe() {
        return bOccupe;
    }

    /**
     * TODO commenter le r�le de cette m�thode
     * @param bOccupe
     */
    public void setbOccupe(boolean bOccupe) {
        this.bOccupe = bOccupe;
    }

    /**
     * TODO commenter le r�le de cette m�thode
     * @return client au guichet
     */
    public Client getoClient() {
        return oClient;
    }

    /**
     * TODO commenter le r�le de cette m�thode
     * @param oClient
     */
    public void setoClient(Client oClient) {
        this.oClient = oClient;
    }

    /**
     * TODO commenter le r�le de cette m�thode
     * @return les cr�neaux d'ouvertures
     */
    public int[][] getiCreneauxOuverture() {
        return iCreneauxOuverture;
    }

    /**
     * TODO commenter le r�le de cette m�thode
     * @param iCreneauxOuverture
     */
    public void setiCreneauxOuverture(int[][] iCreneauxOuverture) {
        this.iCreneauxOuverture = iCreneauxOuverture;
    }
    
    /**
     * @return valeur de bEstProfessionnel
     */
    public boolean isbEstProfessionnel() {
        return bEstProfessionnel;
    }


    /**
     * @param bEstProfessionnel nouvelle valeur de bEstProfessionnel
     */
    public void setbEstProfessionnel(boolean bEstProfessionnel) {
        this.bEstProfessionnel = bEstProfessionnel;
    }


    /**
     * M�thode permettant de supprimer un client du guichet
     * Utile quand le client � re�u le service demand�
     */
    public void supprimerClient () {
        // Guichet sans client et non occup�
        this.oClient = null;
        this.bOccupe = false;
    }
    
}
