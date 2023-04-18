import CharacterEnums.AttackEnums;
import CharacterEnums.CharacterStats;
import CharacterEnums.AttackEnums;

/**
 * Represents the warrior class
 */
public class Warrior implements Character
{
    private int health;
    private AttackEnums attack;
    private CharacterStats stat;

    public Warrior(int health, AttackEnums attack, CharacterStats stat)
    {
        this.health = health;
        this.attack = attack;
        this.stat = stat;
    }


    @Override
    public int attack(int diceRoll) {
        int attackPoints = this.attack.getDamagePoints() + diceRoll;
        System.out.println("The warrior uses " + this.attack.getAttackName() + " for " + attackPoints + " damage!");
        return -attackPoints;
    }

    @Override
    public int getHealth() {
        return this.health;
    }

    @Override
    public void setHealth(int newHealth)
    {
        if(newHealth <= 0)
        {
            this.health = 0;
            System.out.println("The Warrior has been defeated!");
        } else
        {
            this.health = newHealth;
            System.out.println("The Warrior's new health is: " + this.health);
        }
    }

    @Override
    public CharacterStats getStat()
    {
        return this.stat;
    }

    @Override
    public void setStat(CharacterStats newStat)
    {
        this.stat = newStat;
    }

    @Override
    public String getAttack()
    {
        return this.attack.getAttackName();
    }

    @Override
    public void setAttack(String newAttack)
    {
        this.attack = AttackEnums.valueOf(newAttack);
    }
}
