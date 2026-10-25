package lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    @Test
    void greetingIsCorrect() {
        assertEquals("Hello Jenkins", App.greeting());
    }
}