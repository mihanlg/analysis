package ru.mail.sphere;

import java.util.ArrayList;
import java.util.List;

public class ListCaster {

    // Проблема каста:
    // Integer extends Number
    // List<Integer> ints = new ArrayList<>();
    // List<Number> nums = ints; => compilation error
    public static <T1, T2 extends T1> List<T1> cast(List<T2> value) {
        List<T1> result = new ArrayList<>();

        for (T2 t2 : value) {
            result.add(t2);
        }

        return result;
    }
}
