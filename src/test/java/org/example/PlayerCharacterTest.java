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
    public void move_whenInputW_thenYIsOne() {
        //GIVEN:
        String str = "W";
        //WHEN:
        boolean actual = PlayerCharacter.move(str);
        //THEN:
       assertTrue(actual);
    }
    @Test
    public void moveS_whenInputS_thenYisMinusOne() {
        //GIVEN:
        String str = "S";
        //WHEN:
        boolean actual = PlayerCharacter.moveS(str);
        //THEN:
        assertTrue(actual);
    }
    @Test
    public void moveD_whenInputD_thenXisOne() {
        //GIVEN:
        String str = "D";
        //WHEN:
        boolean actual = PlayerCharacter.moveD(str);
        //THEN:
        assertTrue(actual);
    }
    @Test
    public void moveA_whenInputA_thenXisMinusOne() {
        //GIVEN:
        String str = "A";
        //WHEN:
        boolean actual = PlayerCharacter.moveA(str);
        //THEN:
        assertTrue(actual);
    }
}