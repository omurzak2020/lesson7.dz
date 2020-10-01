package com.company;

public class Magic extends Hero{


    @Override
    public void applySuperAbility(String superAbilityType) {
        super.applySuperAbility(superAbilityType);
    }

    public String applySuperAbility() {
        return "Magic применил суперспособность CRITICAL DAMAGE";
    }
}
