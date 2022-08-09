import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {
    Sample sample;
    //setup - pre-conditions using either @Before or @BeforeEach
    //test the method using @Test, by creating separate method to cover all the different method of your source
    //tear down - remove all the resources like object allocation, like Scanner

    //setup
    @BeforeEach // -> this method will execute before each test case,
    void setUp(){
        // initializing the object of the class which is under test
        sample = new Sample();

    }
    //test
    @Test
    void additionTestForValidInput(){
        //declare any parameters needed for testing method
        int num1 = 50;
        int num2 = 100;
        int expectedValue = 150;
        //actual value, by calling the method using class object
        int actualValue = sample.addition(num1, num2);
        //test by suing assert method
        assertEquals(expectedValue, actualValue);
        assertEquals(100,sample.addition(50,50));
    }

    @Test
    void isPrimeTestForPositiveNumberGreaterThan1(){
        int number = 97;
        //boolean expected = true;
        boolean actual = sample.isPrime(number);
        assertTrue(actual);
    }
    @Test
    void isPrimeTestForNegativeValues(){
        int number = -97;
        boolean actual = sample.isPrime(number);
        assertFalse(actual);
    }
    @Test
    void divisionTest(){
        float num1 = 10.0f;
        float num2 = 3.0f;
        float actual = sample.division(num1,num2);
        assertEquals(3.33f,actual,0.1);
    }

    @AfterEach
    void tearDown(){
        sample = null;
    }

}