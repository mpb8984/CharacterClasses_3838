import CharacterEnums.CharacterStats;

/**
 * Interface that represents the character class, the super class of all characters
 */
public interface Character
{
    int attack(int diceRoll);

    int getHealth();

    void setHealth(int newHealth);

    CharacterStats getStat();

    void setStat(CharacterStats newStat);

    String getAttack();

    void setAttack(String newAttack);

}
