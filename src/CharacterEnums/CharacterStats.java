package CharacterEnums;

/**
 * This enum represents possible character stats
 */
public enum CharacterStats 
{
        HIGH_STRENGTH("high strength"),
        HIGH_AGILITY("high agility"),
        HIGH_INTELLIGENCE("high intelligence"),
        HIGH_DEFENSE("high defense"),
        HIGH_HEALTH("high health"),
        HIGH_SPEED("high speed"),
        HIGH_MANA("high mana"),
        NONE("none");

        private String attributeName;

        private CharacterStats(String attributeName) {
            this.attributeName = attributeName;
        }

        public String getAttributeName() {
            return this.attributeName;
        }
        
        public CharacterStats getStatByName(String statName)
        {
            for(CharacterStats stats : CharacterStats.values())
            {
                if(statName.toLowerCase().equals(stats.getAttributeName()))
                {
                    return stats;
                }
            }
            return null;
        }
}
