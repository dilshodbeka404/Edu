package testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MathTestingTest {
    MathTesting mathTesting = new MathTesting();

    @Test
    void onePlusOneEqualTwo() {

        assertEquals(2, mathTesting.add(1, 1));

        assertNotEquals(3, mathTesting.add(1, 1));
    }


    @Test
    void isThrows() {
        assertThrows(IllegalArgumentException.class, () -> mathTesting.div(5, 0));
    }

}