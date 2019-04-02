
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class AdditionTests {

    @Test
    public void testAddition() {
        Addition plus = new Addition();
        plus.setA(2);
        plus.setB(3);
        assertThat(plus.Addition(),equalTo(plus.getA()+plus.getB()));
        plus.setA(0);
        System.out.println(plus.getA());
        assertThat(plus.Addition(),equalTo(plus.getA()+plus.getB()));
        plus.setB(-1);
        assertThat(plus.Addition(),equalTo(plus.getA()+plus.getB()));
        plus.setA(-1);
        assertThat(plus.Addition(),equalTo(plus.getA()+plus.getB()));

        // sélection de mauvais types pour générations d'exceptions
        // vérifier si la méthode existe et si la classe existe aussi
    }
}
