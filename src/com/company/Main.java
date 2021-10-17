package com.company;

import java.lang.annotation.Target;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(100);
        boss.setDamage(50);
        boss.setAbility("Super power");
        boss.weapon.setName("m4a1");
        boss.weapon.setTypeOfGun("Автомат");
        boss.printInfo();

        Skeleton skeleton = new Skeleton();
        skeleton.setHealth(22);
        skeleton.setDamage(10);
        skeleton.setAbility(" Sila power");
        skeleton.weapon.setName("ak47");
        skeleton.weapon.setTypeOfGun("Пушка");
        skeleton.setNumberOfSkeletons(22);
        skeleton.printInfo();

        Skeleton skeleton1 = new Skeleton();
        skeleton1.setHealth(40);
        skeleton1.setDamage(15);
        skeleton1.setAbility(" Sila Joke ");
        skeleton1.weapon.setName("usp");
        skeleton1.weapon.setTypeOfGun("Пистолет");
        skeleton1.setNumberOfSkeletons(10);
        skeleton1.printInfo();


    }
}

