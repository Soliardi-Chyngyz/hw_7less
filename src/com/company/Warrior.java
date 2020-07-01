package com.company;

public class Warrior extends Hero {
    public Warrior(int health, int damage, String superPower) {
        super(health, damage, superPower);
    }

    @Override
    public String applySuperAbility(String superAbilityType) {
        return null;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Воин ввонзил в тело противнока свой пирочиный нож");
    }
}
