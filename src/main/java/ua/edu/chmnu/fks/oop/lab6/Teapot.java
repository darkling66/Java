package ua.edu.chmnu.fks.oop.lab6;

import ua.edu.chmnu.fks.oop.lab6.Exceptions.NegativeValueException;

public class Teapot extends ElectricalAppliance{
    private int holdingCapacity;
    private String heatingElementType;

    public Teapot(double voltage, double power, String material, int holdingCapacity, String heatingElementType) throws NegativeValueException {
        super(voltage, power, material);

        if(holdingCapacity > 0) {
            this.holdingCapacity = holdingCapacity;
        }
        else {
            throw new NegativeValueException();
        }

        this.heatingElementType = heatingElementType;
    }

    public int getHoldingCapacity() {
        return holdingCapacity;
    }

    public void setHoldingCapacity(int holdingCapacity) throws NegativeValueException {
        if(holdingCapacity > 0) {
            this.holdingCapacity = holdingCapacity;
        }
        else {
            throw new NegativeValueException();
        }
    }

    public String getHeatingElementType() {
        return heatingElementType;
    }

    public void setHeatingElementType(String heatingElementType) {
        this.heatingElementType = heatingElementType;
    }

    @Override
    public String toString() {
        return "Teapot{" +
                "voltage=" + getVoltage() +
                ", power=" + getPower() +
                ", material='" + getMaterial() +
                ", holding capacity='" + holdingCapacity +
                ", heating element type='" + heatingElementType + '\'' +
                '}';
    }
}