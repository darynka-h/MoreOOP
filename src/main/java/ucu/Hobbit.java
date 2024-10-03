package ucu;


public class Hobbit extends Character {
    
    public Hobbit() {
        setPower(0);
        setHp(3);
    }

    // public void setHp(int hp) {
    //     if (hp < 0 ) {
    //         this.hp = 0;
    //     }
    //     else{
    //         this.hp = hp;
    //     };
        
    // }

    public static void toCry() {
        System.out.println("I'm crying");
    }

    public void kick(Character c) {  
        toCry();
    }

    @Override
    public String toString() {
        return "Hobbit{hp=" + getHp() + ", power=" + getPower() + "}";
    }
}
