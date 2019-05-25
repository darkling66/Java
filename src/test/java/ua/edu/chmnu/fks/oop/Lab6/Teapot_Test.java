package ua.edu.chmnu.fks.oop.Lab6;

import org.junit.jupiter.api.Test;
import ua.edu.chmnu.fks.oop.lab6.Exceptions.NegativeValueException;
import ua.edu.chmnu.fks.oop.lab6.Teapot;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Teapot_Test {

    @Test
    public void holdingCapacityTest() throws NegativeValueException {
        Teapot conditioner = new Teapot();
        conditioner.setHoldingCapacity(200);
        assertEquals(200, conditioner.getHoldingCapacity());
    }

    @Test
    public void heatingElementTypeTest() {
        Teapot conditioner = new Teapot();
        conditioner.setHeatingElementType("closed");
        assertEquals("closed", conditioner.getHeatingElementType());
    }
}
