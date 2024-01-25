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
}