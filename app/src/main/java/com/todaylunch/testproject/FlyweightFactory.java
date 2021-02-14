package com.todaylunch.testproject;

import java.util.HashMap;

public class FlyweightFactory {


    private static HashMap<String, FlyweightShape> map = new HashMap<>();

    public static FlyweightShape getShape(String name) {
        FlyweightShape shape = map.get(name);

        if (shape == null) {
            //Can write switch context
            shape = new Circle(name);
            map.put(name, shape);
            System.out.println("====New object create====");
        }

        return shape;
    }

}
