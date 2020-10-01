package com.company;

public class Medic extends Hero {

    @Override
    public void applySuperAbility(String superAbilityType) {
        super.applySuperAbility(superAbilityType);
    }

    public String applySuperAbility() {
        return "Medic применил суперспособность CRITICAL DAMAGE";
    }
}
