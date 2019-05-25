package ua.edu.chmnu.fks.oop.Lab6;

import org.junit.jupiter.api.Test;
import ua.edu.chmnu.fks.oop.lab6.Exceptions.NegativeValueException;
import ua.edu.chmnu.fks.oop.lab6.TV;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TV_Test {

    @Test
    public void brightnessTest() throws NegativeValueException {
        TV tv = new TV();
        tv.setBrightness(100);
        assertEquals(100, tv.getBrightness());
    }

    @Test
    public void holdingCapacityTest() throws NegativeValueException {
        TV tv = new TV();
        tv.setContrast(150);
        assertEquals(100, tv.getBrightness());
    }

    @Test
    public void resolutionTest() throws NegativeValueException {
        TV tv = new TV();
        tv.setResolution(1000);
        assertEquals(1000, tv.getResolution());
    }
}
