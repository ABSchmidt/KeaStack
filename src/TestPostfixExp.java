import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestPostfixExp {

    @Test
    public void testCalculate(){

        assertEquals(14,PostfixExp.calculate("234+*"));
    }

}
