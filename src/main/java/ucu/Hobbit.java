package ucu;
public class Hobbit {
    protected int power = 0;
    protected int hp = 0;
    
    public int getPower() {
        return this.power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public static void toCry(){
        System.out.println("I'm crying");
    };

    public void kick(Character c) {  
        toCry();
    };
}
