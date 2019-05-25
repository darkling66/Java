package ua.edu.chmnu.fks.oop.lab6;

import ua.edu.chmnu.fks.oop.lab6.Exceptions.NegativeValueException;

public class Conditioner extends ElectricalAppliance{
    private int energyEfficiency;
    private int soundPressure;
    private int coolingPower;

    public Conditioner(){}

    public Conditioner(double voltage, double power, String material, int energyEfficiency, int soundPressure, int coolingPower) throws NegativeValueException {
        super(voltage, power, material);

        if(energyEfficiency > 0) {
            this.energyEfficiency = energyEfficiency;
        }
        else {
            throw new NegativeValueException();
        }

        if(soundPressure > 0) {
            this.soundPressure = soundPressure;
        }
        else {
            throw new NegativeValueException();
        }

        if(coolingPower > 0) {
            this.coolingPower = coolingPower;
        }
        else {
            throw new NegativeValueException();
        }
    }

    public int getEnergyEfficiency() {
        return energyEfficiency;
    }

    public void setEnergyEfficiency(int energyEfficiency) throws NegativeValueException {
        if(energyEfficiency > 0) {
            this.energyEfficiency = energyEfficiency;
        }
        else {
            throw new NegativeValueException();
        }
    }

    public int getSoundPressure() {
        return soundPressure;
    }

    public void setSoundPressure(int soundPressure) throws NegativeValueException {
        if(soundPressure > 0) {
            this.soundPressure = soundPressure;
        }
        else {
            throw new NegativeValueException();
        }
    }

    public int getCoolingPower() {
        return coolingPower;
    }

    public void setCoolingPower(int coolingPower) throws NegativeValueException {
        if(coolingPower > 0) {
            this.coolingPower = coolingPower;
        }
        else {
            throw new NegativeValueException();
        }
    }

    @Override
    public String toString() {
        return "Conditioner{" +
                "voltage=" + getVoltage() +
                ", power=" + getPower() +
                ", material='" + getMaterial() +
                ", energye efficiency='" + energyEfficiency +
                ", sound pressure='" + soundPressure +
                ", cooling power='" + coolingPower + '\'' +
                '}';
    }
}
