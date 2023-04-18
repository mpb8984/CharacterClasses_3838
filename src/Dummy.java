import CharacterEnums.AttackEnums;
import CharacterEnums.CharacterStats;

public class Dummy implements Character
{

    private int health;
    private AttackEnums attack;
    private CharacterStats stat;

    public Dummy(int health, AttackEnums attack, CharacterStats stat)
    {
        this.health = health;
        this.attack = attack;
        this.stat = stat;
    }

    @Override
    public int attack(int diceRoll) {
        return this.attack.getDamagePoints();
    }

    @Override
    public int getHealth() {
        return this.health;
    }

    @Override
    public void setHealth(int newHealth) {
        if(newHealth <= 0)
        {
            this.health = 0;
            System.out.println("The Dummy has been defeated!");
        } else
        {
            this.health = newHealth;
            System.out.println("The Dummy's new health is: " + this.health);
        }
    }

    @Override
    public CharacterStats getStat() {
        return this.stat;
    }

    @Override
    public void setStat(CharacterStats newStat) {
        this.stat = newStat;
    }

    @Override
    public String getAttack() {
        return this.attack.getAttackName();
    }

    @Override
    public void setAttack(String newAttack) {
        this.attack = AttackEnums.valueOf(newAttack);
    }
}
