/*
 * ClientTest.java                                                          8 déc. 2020
 * 3IL 2020 - 2021, groupe 2 ni copyright ni copyleft 
 */
package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import classe.Client;
import classe.Service;

/**
 * Classe de test d'un client
 * @author f.mazenq
 *
 */
class ClientTest {

    /** objet de service pour tester */
    private Service oService = new Service ("courrier à poster", 2);
    
    /** objet client pour tester */
    private Client oClient = new Client(oService,15,"Paul",false);

    
    /**
     * Test method for {@link classe.Client#Client()}.
     */
    @Test
    void testClient() {
        Client oClient = new Client();
        assertEquals(oClient.getDateArrivee(), 0);
        assertEquals(oClient.getNom(), "");
    }

    /**
     * Test method for {@link classe.Client#Client(classe.Service, int, java.lang.String)}.
     */
    @Test
    void testClientServiceIntString() {       
        assertSame(oClient.getService(),oService);
        assertEquals(oClient.getDateArrivee(),15);
        assertEquals(oClient.getNom(), "Paul");    
    }

    /**
     * Test method for {@link classe.Client#setService(classe.Service)}.
     */
    @Test
    void testSetService() {
        Service oNewService = new Service ("achat de timbre", 15);
        
        assertNotSame(oClient.getService(),oNewService);
        oClient.setService(oNewService);
        assertSame(oClient.getService(),oNewService);
    }

    /**
     * Test method for {@link classe.Client#setDateArrivee(int)}.
     */
    @Test
    void testSetDateArrivee() {
        int iNewDate = 30;
        
        assertNotEquals(oClient.getDateArrivee(),iNewDate);
        oClient.setDateArrivee(iNewDate);
        assertEquals(oClient.getDateArrivee(),iNewDate);
    }

    /**
     * Test method for {@link classe.Client#setNom(java.lang.String)}.
     */
    @Test
    void testSetNom() {
        String sNewNom = "Claude";
        
        assertNotEquals(oClient.getNom(),sNewNom);
        oClient.setNom(sNewNom);
        assertEquals(oClient.getNom(),sNewNom);
    }

}
