package com.xworkz.encapsulation.internal;

public class KeyChain {
    private String material;
    private String color;
    private int numberOfKeys;
    private boolean hasNameTag;
    private double weight;

    void setMaterial(String material) { this.material = material; }
    void setColor(String color) { this.color = color; }
    void setNumberOfKeys(int numberOfKeys) { this.numberOfKeys = numberOfKeys; }
    void setHasNameTag(boolean hasNameTag) { this.hasNameTag = hasNameTag; }
    void setWeight(double weight) { this.weight = weight; }

    public String getMaterial() { return material; }
    public String getColor() { return color; }
    public int getNumberOfKeys() { return numberOfKeys; }
    public boolean isHasNameTag() { return hasNameTag; }
    public double getWeight() { return weight; }

    public void jingle() {
        System.out.println("The keychain made of " + material + " is jingling with " + numberOfKeys + " keys!");
    }
}
