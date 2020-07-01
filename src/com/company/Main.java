package com.company;

public class Main {

    public static void main(String[] args) {
        Magic magic = new Magic(500,40,"Магия");
        Medic medic = new Medic(400, 30,"Лечит");
        Warrior warrior = new Warrior(500,50,"Бъет");

        Hero[] heroes = {magic, medic, warrior};
        for (Hero i: heroes) {
            ((HavingSuperAbility)i).applySuperAbility();
            System.out.println(i.getHealth() + " " + i.getDamage() + " "+ i.getSuperPower());
        }
    }
}
