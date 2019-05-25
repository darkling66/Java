package ua.edu.chmnu.fks.oop.Lab6;

import org.junit.jupiter.api.Test;
import ua.edu.chmnu.fks.oop.lab6.ElectricalAppliance;
import ua.edu.chmnu.fks.oop.lab6.Exceptions.NegativeValueException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElectricalAppliance_Test {

    @Test
    public void voltageTest() throws NegativeValueException {
        ElectricalAppliance electricalAppliance = new ElectricalAppliance();
        electricalAppliance.setVoltage(200);
        assertEquals(200, electricalAppliance.getVoltage());
    }

    @Test
    public void powerTest() throws NegativeValueException {
        ElectricalAppliance electricalAppliance = new ElectricalAppliance();
        electricalAppliance.setPower(100);
        assertEquals(100, electricalAppliance.getPower());
    }

    @Test
    public void materialTest(){
        ElectricalAppliance electricalAppliance = new ElectricalAppliance();
        electricalAppliance.setMaterial("iron");
        assertEquals("iron", electricalAppliance.getMaterial());
    }

}
