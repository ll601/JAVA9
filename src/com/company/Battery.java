package com.company;

//电池类
public class Battery {
    String logo;
    short power;

    boolean inpower() {
        power += 10;
        if (power >= 100) {
            power = 100;
            return true;
        } else {
            return false;
        }
    }

    boolean outpower() {
        if (power >= 10) {
            power -= 10;
            return true;
        } else {
            power = 0;
            return false;
        }
    }
}
