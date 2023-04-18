import CharacterEnums.CharacterStats;
import CharacterEnums.AttackEnums;

import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        Warrior warrior = new Warrior(130, AttackEnums.CHARGE, CharacterStats.HIGH_DEFENSE);
        Dummy dummy = new Dummy(100,AttackEnums.NONE,CharacterStats.NONE);

        System.out.println("Warrior: \n" +
                "\t Health: " + warrior.getHealth() + " \n" +
                "\t Attack: " + AttackEnums.valueOf(warrior.getAttack().toUpperCase()) + "\n" +
                "\t Stat:   " + warrior.getStat().getAttributeName());

        System.out.println("Dummy: \n" +
                "\t Health: " + dummy.getHealth() + " \n" +
                "\t Attack: " + AttackEnums.valueOf(dummy.getAttack().toUpperCase()) + "\n" +
                "\t Stat:   " + dummy.getStat().getAttributeName());

        System.out.println("----------------------------");
        System.out.println("Warrior vs Dummy");
        Random random = new Random();
        while(dummy.getHealth() > 0)
        {
            int attack = warrior.attack(random.nextInt(1,20));
            dummy.setHealth(dummy.getHealth() + attack);
        }

    }
}