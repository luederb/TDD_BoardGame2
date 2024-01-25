package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class PlayerCharacterTest {
    @Test
    public void getX_whenInputX_thenReturn0() {
        //GIVEN:
        int expected = 0;
        //WHEN:
        int actual = PlayerCharacter.getX();
        //THEN:
        assertEquals(expected, actual);
    }
    @Test
    public void getY_whenInputY_thenReturn0() {
        //GIVEN:
        int expected = 0;
        //WHEN:
        int actual = PlayerCharacter.getY();
        //THEN:
        assertEquals(expected, actual);
    }
    @Test
    public void hasPlayerPressedKeyW_whenInputW_thenYIsOne() {
        //GIVEN:
        String str = "W";
        //WHEN:
        boolean actual = PlayerCharacter.hasPlayerPressedKeyW(str);
        //THEN:
       assertTrue(actual);
    }
    @Test
    public void hasPlayerPressedKeyS_whenInputS_thenYisMinusOne() {
        //GIVEN:
        String str = "S";
        //WHEN:
        boolean actual = PlayerCharacter.hasPlayerPressedKeyS(str);
        //THEN:
        assertTrue(actual);
    }
    @Test
    public void hasPlayerPressedKeyD_whenInputD_thenXisOne() {
        //GIVEN:
        String str = "D";
        //WHEN:
        boolean actual = PlayerCharacter.hasPlayerPressedKeyD(str);
        //THEN:
        assertTrue(actual);
    }
    @Test
    public void hasPlayerPressedKeyA_whenInputA_thenXisMinusOne() {
        //GIVEN:
        String str = "A";
        //WHEN:
        boolean actual = PlayerCharacter.hasPlayerPressedKeyA(str);
        //THEN:
        assertTrue(actual);
    }
}