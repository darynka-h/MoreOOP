package ucu;

public abstract class Character {
    protected int power;
    protected int hp;
    
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

    public boolean isAlive(){
        return true;
    }

    public abstract void kick(Character c);
}

