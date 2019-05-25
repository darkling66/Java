package ua.edu.chmnu.fks.oop.lab6.Exceptions;

public class NegativeValueException extends InvalidValueException{
    public NegativeValueException() {
        super("Value can't be less than zero");
    }
}