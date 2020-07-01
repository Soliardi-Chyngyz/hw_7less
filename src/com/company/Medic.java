package com.company;

public class Medic extends Hero{
    public Medic(int health, int damage, String superPower) {
        super(health, damage, superPower);
    }

    @Override
    public String applySuperAbility(String superAbilityType) {
        return null;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Медик подлечил одно героя");
    }
}
