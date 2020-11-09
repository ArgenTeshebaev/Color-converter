import org.junit.Test;
import sample.ConverterClass;

import static org.junit.Assert.assertEquals;

public class HexTest {

    @Test
    public void checkIfTheMethodWritesTheProperFile() {
        ConverterClass converter = new ConverterClass();
        converter.setR(255);
        converter.setG(255);
        converter.setB(255);
        assertEquals("#FFFFFF", converter.getHexCode());
    }
    @Test
    public void test2() {
        ConverterClass converter = new ConverterClass();
        converter.setR(232);
        converter.setG(107);
        converter.setB(107);
        assertEquals("#E86B6B", converter.getHexCode());
    }
    @Test
    public void test3() {
        ConverterClass converter = new ConverterClass();
        converter.setR(105);
        converter.setG(55);
        converter.setB(30);
        assertEquals("#69371E", converter.getHexCode());
    }
    @Test
    public void test4() {
        ConverterClass converter = new ConverterClass();
        converter.setR(102);
        converter.setG(222);
        converter.setB(232);
        assertEquals("#66DEE8", converter.getHexCode());
    }
    @Test
    public void test5() {
        ConverterClass converter = new ConverterClass();
        converter.setR(86);
        converter.setG(102);
        converter.setB(135);
        assertEquals("#566687", converter.getHexCode());
    }
}
