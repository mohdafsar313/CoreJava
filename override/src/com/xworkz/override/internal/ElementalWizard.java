package com.xworkz.override.internal;

public class ElementalWizard extends Wizard{
    public ElementalWizard() {
        System.out.println("ElementalWizard: Constructor is running");
    }

    @Override
    public void castSpell() {
        System.out.println("ElementalWizard: Casting powerful elemental magic");
    }

    public void summonFire() {
        System.out.println("ElementalWizard: Summoning fire from the ancient realm");
    }

    public void controlWind() {
        System.out.println("ElementalWizard: Controlling the winds with precision");
    }
}
