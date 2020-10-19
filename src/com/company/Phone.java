package com.company;
//电话类

public class Phone {

    String logo;
    Battery battery = new Battery();
    Music music = new Music();

    void music() {
        if (music.have()) {
            if (battery.outpower()) {
                System.out.println("music......." + music.song);
            } else {
                System.out.println("battery low");
            }
        } else {
            System.out.println("song null");
        }
    }

    void inpower() {
        if (battery.inpower()) {
            System.out.println("电量已充满");
        } else {
            showpower();
        }
    }

    void showpower() {
        System.out.println("当前电量" + battery.power);
    }
}
