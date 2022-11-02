package ie.atu.Assignment1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {
     Passenger myPassenger;


    @BeforeEach
    void setUp() {
        myPassenger = new Passenger(null,null,null,null,0);
    }

    @Test
    void testTitle(){
        myPassenger.setTitle("Mr");
        assertEquals("Mr", myPassenger.getTitle());
    }

    @Test
    void testName(){
        myPassenger.setName("Tan");
        assertEquals("Tan", myPassenger.getName());
    }

    @Test
    void testId(){
        myPassenger.setId("0037721199");
        assertEquals("0037721199", myPassenger.getId());
    }

    @Test
    void testPhone(){
        myPassenger.setPhone("0833337038");
        assertEquals("0833337038", myPassenger.getPhone());
    }

    @Test
    void testAge(){
        myPassenger.setAge(22);
        assertEquals(22, myPassenger.getAge());
    }

//    @Test
//    void testConstructor(){
//        assertThrows(IllegalArgumentException.class, () -> {new Passenger("Mr", "James", "0012834901", "0833337039", 8);});
//    }

    @AfterEach
    void tearDown() {
    }
}