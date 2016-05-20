package ru.mail.sphere;

public class HasOne {

    public static boolean hasOne(int n) {
        int number = n;
        while (number > 0) {
            if ( number % 10 == 1) {
                return true;
            }
            number = number / 10;
        }
        return false;
    }
}
