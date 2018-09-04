package edu.hebut.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元模式
 *
 * 享元模式尝试重用现有的同类对象，如果未找到匹配的对象，则创建新对象
 */
public class ShapeFactory {

    private static final Map<String,Circle> circleMap = new HashMap<>();

    public static Circle getCircle(String color) {
        Circle circle = circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color,circle);
        }
        return circle;
    }

    public static void main(String[] args) {

    }

}
