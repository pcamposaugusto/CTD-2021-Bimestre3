import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoupaTest {

    @Test
    void getRoupa() {
        Roupa roupa = RoupaFactory.fabricarRoupa("XS", "vestido", true, false);

        Roupa roupa1 = RoupaFactory.fabricarRoupa("M", "camisa", false, true);

        assertEquals("XS", roupa.getTamanho());
        assertEquals("M", roupa1.getTamanho());
    }
}
