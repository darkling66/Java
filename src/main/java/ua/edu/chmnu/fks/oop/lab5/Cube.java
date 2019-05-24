package ua.edu.chmnu.fks.oop.lab5;

public class Cube {
    private double edge;

    public Cube(){ }

    public Cube(double edge){
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge){
        this.edge = edge;
    }

    public double volume() {
        return 6 * edge * edge;
    }

    public double diagonal() {
        return Math.sqrt(3) * edge;
    }
}