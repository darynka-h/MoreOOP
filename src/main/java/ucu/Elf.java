package ucu;
public class Elf extends Character {
     
    public Elf() {
        setPower(10);
        setHp(10);
    }


    public void kick (Character c) {
        if (c.getPower() < this.getPower()){
            c.setHp(0);
        }
        else{
            c.setPower(c.getPower() -1);
        }
    }
    
    @Override
    public String toString() {
        return "Elf{hp=" + getHp() + ", power=" + getPower() + "}";
    }
}