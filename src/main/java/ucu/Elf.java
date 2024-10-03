package ucu;
public class Elf extends Character {
     
    public Elf() {
        power = 10;
        hp = 10;
    }

    public void kick (Character c) {
        if (c.power < this.power){
            c.hp = 0;
        }
        else{
            c.power--;
        }
    }
    
    @Override
    public String toString() {
        return "Elf{hp=" + hp + ", power=" + power + "}";
    }
}