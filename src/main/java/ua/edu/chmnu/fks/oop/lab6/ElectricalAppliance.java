package ua.edu.chmnu.fks.oop.lab6;

import ua.edu.chmnu.fks.oop.lab6.Exceptions.NegativeValueException;

public class ElectricalAppliance {
    private double voltage;
    private double power;
    private String material;

    public ElectricalAppliance() {
    }

    public ElectricalAppliance(double voltage, double power, String material) throws NegativeValueException {

        if(voltage > 0) {
            this.voltage = voltage;
        }
        else {
            throw new NegativeValueException();
        }

        if(power > 0) {
            this.power = power;
        }
        else {
            throw new NegativeValueException();
        }

        this.material = material;
    }

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) throws NegativeValueException {
        if(voltage > 0) {
            this.voltage = voltage;
        }
        else {
            throw new NegativeValueException();
        }
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) throws NegativeValueException {
        if(power > 0) {
            this.power = power;
        }
        else {
            throw new NegativeValueException();
        }
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "ElectricalAppliance{" +
                "voltage=" + voltage +
                ", power=" + power +
                ", material='" + material + '\'' +
                '}';
    }
}
