/*
 * GuichetTest.java                                                          8 déc. 2020
 * 3IL 2020 - 2021, groupe 2 ni copyright ni copyleft 
 */
package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import classe.Client;
import classe.Guichet;
import classe.Service;



/**
 * Classe de test associée à Guichet
 * @author f.mazenq
 *
 */
class GuichetTest {

    /** objet de service pour tester */
    private Service oService = new Service ("courrier à poster", 2);
    
    /** objet client pour tester */
    private Client oClient = new Client(oService,15,"Paul",false);
    
    /** Planning d'ouverture */ 
    private int [][] planningOuverture = new int [][] {{0,100},{130,200}};
    /** objet client pour tester */
    private Guichet oGuichet = new Guichet(1,false,true,oClient, planningOuverture,false);
    
    /**
     * Test method for {@link classe.Guichet#Guichet(int, boolean, boolean, classe.Client, int[][])}.
     */
    @Test
    void testGuichetIntBooleanBooleanClientIntArrayArray() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link classe.Guichet#Guichet()}.
     */
    @Test
    void testGuichet() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link classe.Guichet#setiId(int)}.
     */
    @Test
    void testSetiId() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link classe.Guichet#setbOuvert(boolean)}.
     */
    @Test
    void testSetbOuvert() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link classe.Guichet#setbOccupe(boolean)}.
     */
    @Test
    void testSetbOccupe() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link classe.Guichet#setoClient(classe.Client)}.
     */
    @Test
    void testSetoClient() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link classe.Guichet#setiCreneauxOuverture(int[][])}.
     */
    @Test
    void testSetiCreneauxOuverture() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link classe.Guichet#supprimerClient()}.
     */
    @Test
    void testSupprimerClient() {
        
        assertNotNull(oGuichet.getoClient());
        assertTrue(oGuichet.isbOccupe());
      
        oGuichet.supprimerClient();
        // Plus de client au guichet et plus occupée
        assertNull(oGuichet.getoClient());
        assertFalse(oGuichet.isbOccupe()); 
    }

}
