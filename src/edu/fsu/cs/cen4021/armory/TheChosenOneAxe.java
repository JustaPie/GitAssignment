package edu.fsu.cs.cen4021.armory;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by JustaPie on 2/7/2017.
 */


class TheChosenOneAxe extends BasicWeapon implements Weapon {

    TheChosenOneAxe() {
        super(0);
    }


    //started but did not finish

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {

        if (armor > 0 && armor < 20) {
            return DAMAGE;
        }
        int damage = DAMAGE - (armor);

        if (damage < 0) {
            return 0;
        }
        return damage;
    }

}

