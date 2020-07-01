package com.company;

public class Magic extends Hero{
    public Magic(int health, int damage, String superPower) {
        super(health, damage, superPower);
    }

    @Override
    public String applySuperAbility(String superAbilityType) {
        return null;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic махнул волшебной палочкой и что-то произошло");
    }
}
