package com.company;

public class Music {

    String song = "song1";

    void list() {
        System.out.println("song1");
        System.out.println("song2");
        System.out.println("song3");
        System.out.println("song4");

    }

    boolean have() {
        if (song == "null") {
            return false;
        } else {
            return true;
        }
    }

    boolean down(short num) {
        switch ((num)) {
            case 1:
                song = "song1";
                break;
            case 2:
                song = "song2";
                break;
            case 3:
                song = "song3";
                break;
            case 4:
                song = "song4";
                break;
            default:
                return false;
        }
        return true;
    }
}
