package ua.edu.chmnu.fks.oop.Lab6;

import org.junit.jupiter.api.Test;
import ua.edu.chmnu.fks.oop.lab6.Conditioner;
import ua.edu.chmnu.fks.oop.lab6.Exceptions.NegativeValueException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Conditioner_Test {

    @Test
    public void coolingPowerTest() throws NegativeValueException {
        Conditioner conditioner = new Conditioner();
        conditioner.setCoolingPower(200);
        assertEquals(200, conditioner.getCoolingPower());
    }

    @Test
    public void energyEfficiencyTest() throws NegativeValueException {
        Conditioner conditioner = new Conditioner();
        conditioner.setEnergyEfficiency(100);
        assertEquals(100, conditioner.getEnergyEfficiency());
    }

    @Test
    public void soundPressureTest() throws NegativeValueException {
        Conditioner conditioner = new Conditioner();
        conditioner.setSoundPressure(150);
        assertEquals(150, conditioner.getSoundPressure());
    }
}
