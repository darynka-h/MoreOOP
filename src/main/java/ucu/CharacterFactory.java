package ucu;

import java.util.Random;

public class CharacterFactory {
    public Character createCharacter(){
        Elf new_elf = new Elf();
        King new_king = new King();
        Knight new_knight = new Knight();
        Character[] heroes = {new_elf, new_king, new_knight};
        int rnd = new Random().nextInt(heroes.length);
        return heroes[rnd];
    }

}
