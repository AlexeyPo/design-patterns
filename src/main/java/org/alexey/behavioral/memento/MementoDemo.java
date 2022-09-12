package org.alexey.behavioral.memento;

public class MementoDemo {
    public static void main(String[] args) {
        new MementoDemo().run();
    }

    private void run() {
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator(5, 10, careTaker);

        System.out.println("Default state: " + originator);

        originator.setX(originator.getY() * 51);
        System.out.println("State originator: " + originator);

        originator.createSavePoint("SAVE_1");

        originator.setY(originator.getX() / 22);
        System.out.println("State originator: " + originator);

        originator.undo();
        System.out.println("State after undo: " + originator);

        originator.setX(Math.pow(originator.getX(),3));
        originator.createSavePoint("SAVE2");
        System.out.println("State: "+originator);

        originator.setY(originator.getX()-30);
        originator.createSavePoint("SAVE3");
        System.out.println("State: "+originator);

        originator.setY(originator.getX()/22);
        originator.createSavePoint("SAVE4");
        System.out.println("State: "+originator);

        originator.undo("SAVE2");
        System.out.println("Retrieving at: "+originator);

        originator.undoAll();
        System.out.println("State after undo all: "+originator);
    }
}
