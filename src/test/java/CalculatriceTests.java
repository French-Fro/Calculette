import org.junit.Test;

import static org.hamcrest.core.IsEqual.*;
import static org.junit.Assert.*;

public class CalculatriceTests {

    @Test
    public void testAdditionOnTextFields(){
        Calculatrice c = new Calculatrice();
        // c.Addition(a,b);
        assertThat(c.Addition(a,b), equalTo(1 - 0));
    }
}
