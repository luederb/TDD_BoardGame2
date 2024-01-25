package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerCharacterTest {
    @Test
    public void getX_whenInputField0_thenReturn0(){
        //GIVEN:
        int expected = 0;
        //WHEN:
        int actual = PlayerCharacter.getX();
        //THEN:
        assertEquals(expected, actual);
    }
}