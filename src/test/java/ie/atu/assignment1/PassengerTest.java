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
    }

    //Testing the Title with success case Mr,Mrs,Ms and the fail scenario
    @Test
    void testTitleMr(){
        myPassenger = new Passenger("Mr","Tan","0037721199","0841412414",22);
        assertEquals("Mr", myPassenger.getTitle());
    }

    @Test
    void testTitleMrs(){
        myPassenger = new Passenger("Mrs","Tan","0037721199","0841412414",22);
        assertEquals("Mrs", myPassenger.getTitle());
    }

    @Test
    void testTitleMs(){
        myPassenger = new Passenger("Ms","Tan","0037721199","0841412414",22);
        assertEquals("Ms", myPassenger.getTitle());
    }

    @Test
    void testTitleFail(){
        assertThrows(IllegalArgumentException.class, ()-> {myPassenger = new Passenger("Mass","Tan","0037721199","0841412414",22);
        });
    }

    //Testing the Name for at least min 3 characters and a failure with 2 characters
    @Test
    void testName(){
        myPassenger = new Passenger("Mr","Tan","0037721199","0841412414",22);
        assertEquals("Tan", myPassenger.getName());
    }

    @Test
    void testNameFail(){
        assertThrows(IllegalArgumentException.class, ()-> {myPassenger = new Passenger("Mr","Li","0037721199","0841412414",22);
            ;});
    }

    //Testing the ID for at least min 10 characters and a failure with less than 10 characters
    @Test
    void testId(){
        myPassenger = new Passenger("Mr","Tan","0037721199","0841412414",22);
        assertEquals("0037721199", myPassenger.getId());
    }

    @Test
    void testIdFail(){
        assertThrows(IllegalArgumentException.class, ()-> {myPassenger = new Passenger("Mr","Tan","00123","0841412414",22);
        });
    }

    //Testing the phone for at least min 7 characters and a failure with less than 7 characters
    @Test
    void testPhone(){
        myPassenger = new Passenger("Mr","Tan","0037721199","0833337038",22);
        assertEquals("0833337038", myPassenger.getPhone());
    }

    @Test
    void testPhoneFail(){
        assertThrows(IllegalArgumentException.class, ()-> {myPassenger = new Passenger("Mr","Tan","0037721199","151515",22);
        });
    }

    //Testing the age for at least min 16 and a failure with younger than 16 years old
    @Test
    void testAge(){
        myPassenger = new Passenger("Mr","Tan","0037721199","0841412414",22);
        assertEquals(22, myPassenger.getAge());
    }

    @Test
    void testAgeFail(){
        assertThrows(IllegalArgumentException.class, ()-> {myPassenger = new Passenger("Mr","Tan","0037721199","0841412414",8);
        });
    }

    @AfterEach
    void tearDown() {
    }
}