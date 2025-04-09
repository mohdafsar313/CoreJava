package com.xworkz.encapsulation.internal;

public class KeyChainUser {
    public void test() {
        KeyChain keyChain = new KeyChain();
        keyChain.setMaterial("Metal");
        keyChain.setColor("Silver");
        keyChain.setNumberOfKeys(5);
        keyChain.setHasNameTag(true);
        keyChain.setWeight(0.25);

        System.out.println("KeyChain Material: " + keyChain.getMaterial());
        System.out.println("Color: " + keyChain.getColor());
        System.out.println("Has Name Tag? " + keyChain.isHasNameTag());

        keyChain.jingle();
    }
}
