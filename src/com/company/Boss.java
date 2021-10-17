package com.company;

import com.company.GameEntity;
import com.company.Weapon;

public class Boss extends GameEntity {
    Weapon weapon = new Weapon();

    public String printInfo() {
        String f = (getHealth() + " " + getDamage() + " " + getAbility() + " " +
                weapon.getName() + " " + weapon.getTypeOfGun());
        System.out.println(f);
        return f;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

}
