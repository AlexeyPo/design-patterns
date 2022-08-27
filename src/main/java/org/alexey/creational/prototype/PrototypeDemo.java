package org.alexey.creational.prototype;

public class PrototypeDemo {
    public static void main(String[] args) {
        new PrototypeDemo().run();
    }

    private void run() {
        ShapeCache.loadCache();

        Shape clonedShape1 = ShapeCache.getShape("1");
        Shape clonedShape2 = ShapeCache.getShape("2");
        Shape clonedShape3 = ShapeCache.getShape("3");

        System.out.println("Shape: " + clonedShape1.getType());
        System.out.println("Shape: " + clonedShape2.getType());
        System.out.println("Shape: " + clonedShape3.getType());
    }
}
