package org.example;

import java.util.Objects;

public class PlayerCharacter {
    public static int getX() {
        return 0;
    }

    public static int getY(){
        return 0;
    }
    public static boolean move(String str){
        int y = 0;
        if (Objects.equals(str, "W")) {
             y=1;
        }
        return y == 1;
    }
}
