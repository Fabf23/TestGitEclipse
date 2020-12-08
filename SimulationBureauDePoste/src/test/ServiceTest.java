/*
 * ServiceTest.java                                                          8 d�c. 2020
 * 3IL 2020 - 2021, groupe 2 ni copyright ni copyleft 
 */
package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import classe.Service;

/**
 * Classe de test associ�e � la classe service
 * @author f.mazenq
 *
 */
class ServiceTest {

    /** objet de service pour tester */
    Service oServiceTest = new Service ("courrier � poster", 2);
    
    /**
     * Test method for {@link classe.Service#Service()}.
     */
    @Test
    void testService() {
        Service oServiceTestDefaut = new Service ();
        assertEquals(oServiceTestDefaut.getNom(),"");
        assertEquals(oServiceTestDefaut.getDuree(),0);
    }

    /**
     * Test method for {@link classe.Service#setDuree(int)}.
     */
    @Test
    void testSetDuree() {
        int nouvelleDuree = 10;
        assertNotEquals(oServiceTest.getNom(),nouvelleDuree);       
        oServiceTest.setDuree(nouvelleDuree);      
        assertEquals(oServiceTest.getDuree(),nouvelleDuree);
    }

    /**
     * Test method for {@link classe.Service#setDuree(java.lang.String)}.
     */
    @Test
    void testSetNom() {     
        String sNouveauNom = "achat de timbre";
        
        assertNotEquals(oServiceTest.getNom(),sNouveauNom);       
        oServiceTest.setNom(sNouveauNom);      
        assertEquals(oServiceTest.getNom(),sNouveauNom);
    }
}
