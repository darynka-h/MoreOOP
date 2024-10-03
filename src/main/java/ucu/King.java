package ucu;
import java.util.Random;

public class King extends Character {
    
    public King() {
        Random rand = new Random();

        int rand_power = rand.nextInt(2, 12);
        power = rand_power;
        int rand_hp = rand.nextInt(2, 12);
        hp = rand_hp;
    }

    
    public void setPower(int power) {
        if (power < 5 || power > 15) {
            throw new IllegalArgumentException("power must be in range 5 and 15.");
        }
    }

    public void setHp(int power) {
        if (power < 5 || power > 15) {
            throw new IllegalArgumentException("hp must be in range 5 and 15.");
        }
    }


    // methods: void kick(Character c) { decrease number of hp of the enemy 
    //     by random number which will be in the range of his power }
    public void kick(Character c){
        Random rand = new Random();
        int rand_int = rand.nextInt(3);
        c.power -= rand_int;
    };
    
}