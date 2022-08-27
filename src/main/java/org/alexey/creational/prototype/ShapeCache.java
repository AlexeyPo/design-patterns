package org.alexey.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {

    private static final Map<String, Shape> SHAPE_MAP = new HashMap<>();

    public static Shape getShape(String shapeId) {
        Shape toBeClonedShape = SHAPE_MAP.get(shapeId);
        Shape shape = null;
        try {
            shape = (Shape) toBeClonedShape.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return shape;
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        SHAPE_MAP.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        SHAPE_MAP.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        SHAPE_MAP.put(rectangle.getId(), rectangle);
    }
}
