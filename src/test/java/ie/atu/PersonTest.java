package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @BeforeEach
    void setUp() {
    }


    @Test
    void testCity(){
        Person p = new Person("Ted","Athlone","12345",22,54);
        assertEquals("Athlone",p.getCity());
    }

    @Test
    void testCityF(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> new Person("Ted","athlone","12345",22,54));
        assertEquals("Must begin with uppercase",exMessage.getMessage());
        System.out.println(exMessage);
    }

    @Test
    void testBalance(){
        Person p = new Person("Ted","Athlone","12345",22,54);
        assertEquals(54,p.getBalance());
    }

    @Test
    void testBalanceF(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> new Person("Ted","Athlone","12345",22,1));
        assertEquals("Must be over 10",exMessage.getMessage());
        System.out.println(exMessage);
    }

    @AfterEach
    void tearDown() {
    }
}