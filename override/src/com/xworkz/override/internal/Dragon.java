package com.xworkz.override.internal;

public class Dragon extends MythicalCreature{
    public Dragon() {
        System.out.println("Dragon: Constructor is running");
    }

    @Override
    public void usePower() {
        System.out.println("Dragon: Breathing fire and soaring through the skies");
    }

    public void guardTreasure() {
        System.out.println("Dragon: Guarding the treasure in a hidden cave");
    }

    public void roar() {
        System.out.println("Dragon: Letting out a thunderous roar");
    }
}
