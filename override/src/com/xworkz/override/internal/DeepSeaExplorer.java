package com.xworkz.override.internal;

public class DeepSeaExplorer extends Submarine{
    public DeepSeaExplorer() {
        System.out.println("DeepSeaExplorer: Constructor is running");
    }

    @Override
    public void dive() {
        System.out.println("DeepSeaExplorer: Diving to extreme depths to explore marine life");
    }

    public void captureFootage() {
        System.out.println("DeepSeaExplorer: Capturing high-resolution underwater footage");
    }

    public void analyzePressure() {
        System.out.println("DeepSeaExplorer: Analyzing deep-sea pressure conditions");
    }
}
