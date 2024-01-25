package org.example;
import java.util.Objects;
public class PlayerCharacter {
    public static int getX() {
        return 0;
    }
    public static int getY(){
        return 0;
    }
    public static boolean hasPlayerPressedKeyW(String str){
        int y = 0;
        if (Objects.equals(str, "W")) {
             y = 1;
        }
        return y == 1;
    }
    public static boolean hasPlayerPressedKeyS(String str) {
        int y = 0;
        if (Objects.equals(str, "S")) {
            y = (-1);
        }
        return y == (-1);
    }
    public static boolean hasPlayerPressedKeyD(String str) {
        int x = 0;
        if (Objects.equals(str, "D")) {
            x = 1;
        }
        return x == (1);
    }
    public static boolean hasPlayerPressedKeyA(String str) {
        int x = 0;
        if (Objects.equals(str, "A")) {
            x = (-1);
        }
        return x == (-1);
    }
}
