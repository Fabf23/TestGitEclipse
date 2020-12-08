/*
 * Simulation.java                                                          8 d�c. 2020
 * 3IL 2020 - 2021, groupe 2 ni copyright ni copyleft 
 */
package classe;

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
    private int chrono;

    
    /**
     * TODO commenter l'�tat initial construit
     */
    public Simulation() {
        super();
        this.iNbGuichetParticulier = 0;
        this.iNbGuichetProfessionnel = 0;
        this.iDureeSimulation = 0;
        this.chrono = 0;    
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
        this.chrono = chrono;
        
        
    }
}
