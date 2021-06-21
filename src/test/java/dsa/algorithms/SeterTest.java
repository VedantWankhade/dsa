package dsa.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SeterTest {

    @Test
    void setup() {
        int got = Seter.setup();
        assertEquals(1, got);
        System.out.println("Package algorithms setup successfully.");
    }
}