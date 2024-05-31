package dam;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCalculatorTest {

    private MyCalculator calc;

    @BeforeEach
    public void novaInstancia() {
        calc = new MyCalculator();
        System.out.println("MyCalculator iniciado");
    }

    @AfterEach
    public void tornarNull() {
        calc = null;
        System.out.println("MyCalculator finalizado");
    }

    @org.junit.jupiter.api.Test
    void add() {
        int expected = 10;
        int actual = calc.add(5, 5);

        assertEquals(expected, actual);
    }

    @Test
    void sub() {
        int expected = 0;
        int actual = calc.sub(5, 5);

        assertEquals(expected, actual);
    }

    @Disabled("Test inhabilitat")
    @Test
    public void addWhenNegativeException() {
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () -> calc.add(-1, 5)
        );
        assertEquals("Negatiu no permès", thrown.getMessage());
    }

    @Disabled("Test inhabilitat")
    @Test
    public void subWhenNegativeException() {
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () -> calc.sub(-1, 5)
        );
        assertEquals("Negatiu no permès", thrown.getMessage());
    }

    @Disabled("Test inhabilitat")
    @Test
    public void mulWhenNegativeException() {
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () -> calc.mul(-1, 5)
        );
        assertEquals("Negatiu no permès", thrown.getMessage());
    }

    @Disabled("Test inhabilitat")
    @Test
    public void divWhenNegativeException() {
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () -> calc.div(-1, 5)
        );
        assertEquals("Negatiu no permès", thrown.getMessage());
    }
}