import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    @Test
    void greet() {
        assertEquals("Hello world!", new Greeting().greet());
    }
}