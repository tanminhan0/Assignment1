package ie.atu.Assignment1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {
     Passenger myPassenger; //Creating object myPassenger

    //Setting up the Passenger with null and set up @BeforeEach
    @BeforeEach
    void setUp() {
        myPassenger = new Passenger(null,null,null,null,0);
    }

    //Testing the Title with success case Mr,Mrs,Ms and the fail scenario
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

    //Testing the Name for at least min 3 characters and a failure with 2 characters
    @Test
    void testName(){
        myPassenger.setName("Tan");
        assertEquals("Tan", myPassenger.getName());
    }

    @Test
    void testNameFail(){
        assertThrows(IllegalArgumentException.class, ()-> {myPassenger.setName("Li");});
    }

    //Testing the ID for at least min 10 characters and a failure with less than 10 characters
    @Test
    void testId(){
        myPassenger.setId("0037721199");
        assertEquals("0037721199", myPassenger.getId());
    }

    @Test
    void testIdFail(){
        assertThrows(IllegalArgumentException.class, ()-> {myPassenger.setId("000123");});
    }

    //Testing the phone for at least min 7 characters and a failure with less than 7 characters
    @Test
    void testPhone(){
        myPassenger.setPhone("0833337038");
        assertEquals("0833337038", myPassenger.getPhone());
    }

    @Test
    void testPhoneFail(){
        assertThrows(IllegalArgumentException.class, ()-> {myPassenger.setPhone("999");});
    }

    //Testing the age for at least min 16 and a failure with younger than 16 years old
    @Test
    void testAge(){
        myPassenger.setAge(22);
        assertEquals(22, myPassenger.getAge());
    }

    @Test
    void testAgeFail(){
        assertThrows(IllegalArgumentException.class, ()-> {myPassenger.setAge(8);});
    }

    @AfterEach
    void tearDown() {
    }
}