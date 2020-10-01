package com.company;

public class Warrior extends Hero{
    @Override
    public void applySuperAbility(String superAbilityType) {
        super.applySuperAbility(superAbilityType);
    }

    public String applySuperAbility() {
        return "Warrior применил суперспособность CRITICAL DAMAGE";
    }
}
