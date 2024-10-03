package ucu;

import java.util.Random;

public class Knight extends King{

    public Knight() {
        Random rand = new Random();

        int rand_power = rand.nextInt(2, 12);
        setPower(rand_power);
        int rand_hp = rand.nextInt(2, 12);
        setHp(rand_hp);
    }

    

    // public void setPower(int power) {
    //     if (getPower() < 2 || getPower() > 12) {
    //         throw new IllegalArgumentException("power must be in range 2 and 12.");
    //     }
    //     else{
    //         setPower(power);
    //     };
    // }

    // public void setHp(int power) {
    //     if (getHp() < 2 || getHp() > 12) {
    //         throw new IllegalArgumentException("hp must be in range 2 and 12.");
    //     }
    //     else{
    //         this.hp = hp;
    //     };
    // }

    // methods: void kick(Character c) { decrease number of hp of the enemy 
    //     by random number which will be in the range of his power }
    // public void kick(Character c){
    //     Random rand = new Random();
    //     int rand_int = rand.nextInt(5);
    //     int test = c.power - rand_int;
    //     if (c instanceof King && (test > 5 || test < 15)){
    //         c.power = test;
    //     }
    //     else if (c instanceof King) {
    //         c.power --;
    //     }

    //     if (c instanceof Knight && (test > 2 || test < 12)){
    //         c.power = test;
    //     }
    //     else if (c instanceof King) {
    //         c.power --;
    //     }
    //     c.power -= rand_int;
    // };
    
}
