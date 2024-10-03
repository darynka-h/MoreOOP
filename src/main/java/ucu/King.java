package ucu;
import java.util.Random;

public class King extends Character {
    
    public King() {
        Random rand = new Random();

        int rand_power = rand.nextInt(5, 15);
        setPower(rand_power);
        int rand_hp = rand.nextInt(5, 15);
        setHp(rand_hp);
    }

    
    // public void setPower(int power) {
    //     if (power < 5 || power > 15) {
    //         throw new IllegalArgumentException("power must be in range 5 and 15.");
    //     }
    //     else{
    //         this.power = power;
    //     };
    // }

    // public void setHp(int power) {
    //     if (power < 5 || power > 15) {
    //         throw new IllegalArgumentException("hp must be in range 5 and 15.");
    //     }
    //     else{
    //         this.hp = hp;
    //     };
    // }


    // methods: void kick(Character c) { decrease number of hp of the enemy 
    //     by random number which will be in the range of his power }
    public void kick(Character c){
        Random rand = new Random();
        int rand_int = rand.nextInt(5);
        int test = c.getPower() - rand_int;
        if ((c instanceof King) && (!(c instanceof Knight)) && (test > 5 || test < 15)){
            c.setHp(test);
        }
        else if (c instanceof King) {
            c.setPower(c.getPower()-1);
        }

        if (c instanceof Knight && (test > 2 || test < 12)){
            setHp(test);
        }
        else if (c instanceof Knight) {
            // c.hp --;
            c.setHp(c.getHp()-1);
        }
        

        if (c instanceof Elf && (test > 0 || test < 10)){
            // c.hp = test;
            c.setHp(test);
        }
        else if (c instanceof Elf) {
            // c.hp --;
            c.setHp(c.getHp()-1);
        }

        else {
            c.setHp(c.getHp()-1);
        }

        c.setHp(c.getHp()-rand_int);

    };
    
}