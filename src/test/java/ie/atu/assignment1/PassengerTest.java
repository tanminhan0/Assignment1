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
    void testTitleMr(){
        myPassenger.setTitle("Mr");
        assertEquals("Mr", myPassenger.getTitle());
    }

    @Test
    void testTitleMrs(){
        myPassenger.setTitle("Mrs");
        assertEquals("Mrs", myPassenger.getTitle());
    }

    @Test
    void testTitleMs(){
        myPassenger.setTitle("Ms");
        assertEquals("Ms", myPassenger.getTitle());
    }

    @Test
    void testTitleFail(){
        assertThrows(IllegalArgumentException.class, ()-> {myPassenger.setTitle("Mas");});
    }

    @Test
    void testName(){
        myPassenger.setName("Tan");
        assertEquals("Tan", myPassenger.getName());
    }

    @Test
    void testNameFail(){
        assertThrows(IllegalArgumentException.class, ()-> {myPassenger.setName("Li");});
    }

    @Test
    void testId(){
        myPassenger.setId("0037721199");
        assertEquals("0037721199", myPassenger.getId());
    }

    @Test
    void testIdFail(){
        assertThrows(IllegalArgumentException.class, ()-> {myPassenger.setId("000123");});
    }

    @Test
    void testPhone(){
        myPassenger.setPhone("0833337038");
        assertEquals("0833337038", myPassenger.getPhone());
    }

    @Test
    void testPhoneFail(){
        assertThrows(IllegalArgumentException.class, ()-> {myPassenger.setPhone("999");});
    }

    @Test
    void testAge(){
        myPassenger.setAge(22);
        assertEquals(22, myPassenger.getAge());
    }

    @Test
    void testAgeFail(){
        assertThrows(IllegalArgumentException.class, ()-> {myPassenger.setAge(8);});
    }

//    @Test
//    void testConstructor(){
//        assertThrows(IllegalArgumentException.class, () -> {new Passenger("Mr", "James", "0012834901", "0833337039", 8);});
//    }

    @AfterEach
    void tearDown() {
    }
}