import org.junit.Test;

import static org.hamcrest.core.IsEqual.*;
import static org.junit.Assert.*;

public class CalculatriceTests {

    @Test
    public void testAdditionOnTextFields(){
        Calculatrice c = new Calculatrice();
        assertThat(c.Addition(1,3), equalTo(1 + 3));
    }
}
