package org.alexey.behavioral.memento;

import java.util.StringJoiner;

public class Originator {
    private double x;
    private double y;
    private String lastUndoSavePoint;
    CareTaker careTaker;

    public Originator(double x, double y, CareTaker careTaker) {
        this.x = x;
        this.y = y;
        this.careTaker = careTaker;
        createSavePoint("INITIAL");
    }

    public void createSavePoint(String savePointName) {
        careTaker.saveMemento(new Memento(x, y), savePointName);
        lastUndoSavePoint = savePointName;
    }

    public void undo() {
        setOriginatorState(lastUndoSavePoint);
    }

    public void undo(String savePointName) {
        setOriginatorState(savePointName);
    }

    public void undoAll() {
        setOriginatorState("INITIAL");
        careTaker.clearSavePoints();
    }

    private void setOriginatorState(String savePointName) {
        Memento memento = careTaker.getMemento(savePointName);
        this.x = memento.getX();
        this.y = memento.getY();
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", "", "")
                .add("X: " + x)
                .add("Y: " + y)
                .toString();
    }
}
