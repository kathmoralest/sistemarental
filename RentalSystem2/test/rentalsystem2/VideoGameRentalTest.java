/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalsystem2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kathy Morales
 */
public class VideoGameRentalTest {
    Ps3Game juego;
    Xbox360Game juegoPro;
    WiiGame juegoSuperPro;    
    
    public VideoGameRentalTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        juego= new Ps3Game("Juego");
        juegoPro = new Xbox360Game("Juego Pro");
        juegoSuperPro = new WiiGame("Juego Super Pro");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getDaysRented method, of class VideoGameRental.
     */
    @Test
    public void testGetDaysRented() {
        System.out.println("getDaysRented");
        assertEquals(2, new VideoGameRental(juegoSuperPro,2,false).getDaysRented());
    }

    /**
     * Test of getVideoGame method, of class VideoGameRental.
     */
    @Test
    public void testGetVideoGame() {
        System.out.println("getVideoGame");
        assertEquals(juego, new VideoGameRental(juego,1,false).getVideoGame());
    }

    /**
     * Test of getCharge method, of class VideoGameRental.
     */
    @Test
    public void testGetCharge() {
        System.out.println("getCharge");
        VideoGameRental instance = new VideoGameRental(juegoPro, 4, false);
        assertEquals(5, instance.getCharge(), 0);
    }

    /**
     * Test of getFrequentRenterPoints method, of class VideoGameRental.
     */
    @Test
    public void testGetFrequentRenterPoints() {
        System.out.println("getFrequentRenterPoints");
        
        VideoGameRental vJSP1 = new VideoGameRental(juegoSuperPro,1,false);
        VideoGameRental vJSP2 = new VideoGameRental(juegoSuperPro,1,true);
        VideoGameRental vJP1 = new VideoGameRental(juegoPro,1,false);
        VideoGameRental vJP2 = new VideoGameRental(juegoPro,5,true);
        VideoGameRental vJ1 = new VideoGameRental(juego,1,false);
        VideoGameRental vJ2 = new VideoGameRental(juego,5,true);
        
        assertEquals(1,vJSP1.getFrequentRenterPoints());
        assertEquals(2,vJSP2.getFrequentRenterPoints());
        assertEquals(2,vJP1.getFrequentRenterPoints());      
        assertEquals(4,vJP2.getFrequentRenterPoints());       
        assertEquals(2,vJ1.getFrequentRenterPoints());
        assertEquals(3,vJ2.getFrequentRenterPoints());
    }
    
}
