package CharacterEnums;

/**
 * This enum represents attacks available to characters
 */
public enum AttackEnums
{
    SLASH("slash",10),
    STAB("stab",12),
    SMASH("smash",15),
    SHIELD_BASH("shield bash",8),
    HAMMER_STRIKE("hammer strike",18),
    CHARGE("charge",20),
    WAR_CRY("war cry",5),
    NONE("none", 0);

    private int damagePoints;
    private String attackName;

    private AttackEnums(String attackName, int damagePoints) {
        this.attackName = attackName;
        this.damagePoints = damagePoints;
    }

    public int getDamagePoints() {
        return this.damagePoints;
    }

    public String getAttackName()
    {
        return this.attackName;
    }

    public int getDamagePointsFromName(String attackName)
    {
        for(AttackEnums attacks : AttackEnums.values())
        {
            if(attackName.toLowerCase().equals(attacks.getAttackName()))
            {
                return attacks.getDamagePoints();
            }
        }
        return 0;
    }

    public String toString()
    {
        return this.attackName + " (" + this.damagePoints + ")";
    }
}
