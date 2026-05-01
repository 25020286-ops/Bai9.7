import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    void testApp() {
        App app = new App();
        assertEquals("Hello World", app.sayHello());
    }
}