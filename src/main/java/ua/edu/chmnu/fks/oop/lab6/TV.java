package ua.edu.chmnu.fks.oop.lab6;

import ua.edu.chmnu.fks.oop.lab6.Exceptions.NegativeValueException;

public class TV extends ElectricalAppliance {
    private int brightness;
    private int resolution;
    private int contrast;

    public TV(){}

    public TV(double voltage, double power, String material, int brightness, int resolution, int contrast) throws NegativeValueException {
        super(voltage, power, material);
        this.brightness = brightness;
        this.resolution = resolution;
        this.contrast = contrast;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) throws NegativeValueException {
        if(brightness > 0) {
            this.brightness = brightness;
        }
        else {
            throw new NegativeValueException();
        }
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) throws NegativeValueException {
        if(resolution > 0) {
            this.resolution = resolution;
        }
        else {
            throw new NegativeValueException();
        }
    }

    public int getContrast() {
        return contrast;
    }

    public void setContrast(int contrast) throws NegativeValueException {
        if(contrast > 0) {
            this.contrast = contrast;
        }
        else {
            throw new NegativeValueException();
        }
    }

    @Override
    public String toString() {
        return "TV{" +
                "voltage=" + getVoltage() +
                ", power=" + getPower() +
                ", material='" + getMaterial() +
                ", brightness='" + brightness +
                ", resolution='" + resolution +
                ", contrast='" + contrast + '\'' +
                '}';
    }
}
