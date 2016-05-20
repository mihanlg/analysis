package ru.mail.sphere;

import java.util.Collection;

public class CommonTwo {

    // Допускаем, что commonTwo(("word", "word"), ("word")) == 2
    public int commonTwo(Collection<String> one, Collection<String> two) {
        int numberOfCommons = 0;
        if (one == null || two == null) {
            return 0;
        }
        for (String anOne : one) {
            for (String s1 : two) {
                if (anOne.equals(s1)) {
                    ++numberOfCommons;
                }
            }
        }
        return numberOfCommons;
    }

}
