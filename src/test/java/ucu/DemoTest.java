package ucu;
import org.junit.jupiter.api.Test;
import ucu.Character;
import ucu.Hobbit;
import ucu.Elf;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;


public class DemoTest {
    // private Character character;

    // @BeforeEach
    // public void init() {
    //     character = new Elf();
    // }

    // @Test
    // public void testToString(){ assertEquals("Elf{hp=10, power=10}", character.toString());
    // }

    // @Test
    // public void testKick() {
    //     Hobbit hobbit = new Hobbit();
    //     character.kick(hobbit);
    //     assertEquals(0, hobbit.getHp());
    // }


    // ========================HOBBIT_TEST=============
    // private Hobbit character;

    // @BeforeEach
    // public void init() {
    //     character = new Hobbit();
    // }

    // @Test
    // public void testToString() {
    //     assertEquals("Hobbit{hp=3, power=0}", character.toString());
    // }

    // @Test
    // public void testIsClass() {
    //     assertTrue(character instanceof lotr.Character);
    // }

    // @Test
    // public void testSetHp() {
    //     character.setHp(-100);
    //     assertEquals(0, character.getHp());
    // }

    // ================KING====================
    private Character character;

    @BeforeEach
    public void init() { character = new King(); }

    @Test
    public void testIsClass() {
        assertTrue(character instanceof Character);
    }

    @Test
    public void testHp() {
        assertTrue(character.getHp() >= 5 && character.getHp() <= 15);
    }

    @Test
    public void testPower() {
        assertTrue(character.getPower() >= 5 && character.getPower() <= 15);
    }
// =============================KIGHT=============
// private Character character;

//     @BeforeEach
//     public void init() {
//         character = new Knight();
//     }

//     @Test
//     public void testIsClass() {
//         assertTrue(character instanceof Character);
//     }

//     @Test
//     public void testHp() {
//         assertTrue(character.getHp() >= 2 && character.getHp() <= 12);
//     }

//     @Test
//     public void testPower() {
//         assertTrue(character.getPower() >= 2 && character.getPower() <= 12);
//     }

}