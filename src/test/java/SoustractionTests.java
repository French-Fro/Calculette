import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.*;
import static org.junit.Assert.*;

public class SoustractionTests {

    @Test
    public void should_soustract_two_Integer(){
        Integer first = 4;
        Integer second = 2;
        Soustraction soustraction = new Soustraction(first, second);
        assertThat(soustraction.soustract(), equalTo(first - second));
    }
}
