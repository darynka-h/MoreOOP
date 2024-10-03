package ucu;

import java.util.Random;

public class Knight extends King{
    public void setPower(int power) {
        if (power < 2 || power > 12) {
            throw new IllegalArgumentException("power must be in range 2 and 12.");
        }
    }

    public void setHp(int power) {
        if (power < 2 || power > 12) {
            throw new IllegalArgumentException("hp must be in range 2 and 12.");
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
