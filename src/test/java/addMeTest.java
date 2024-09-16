import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class addMeTest {
    App app = new App();

    @Test
    public void addMeTest() {
        assertEquals(5.0, app.addMethod(2, 3), 0.0001);
    }

}