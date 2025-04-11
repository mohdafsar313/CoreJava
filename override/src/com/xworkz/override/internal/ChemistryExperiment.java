package com.xworkz.override.internal;

public class ChemistryExperiment extends Experiment{
    public ChemistryExperiment() {
        System.out.println("ChemistryExperiment: Constructor is running");
    }

    @Override
    public void conduct() {
        System.out.println("ChemistryExperiment: Mixing chemicals in a lab");
    }

    public void heatSample() {
        System.out.println("ChemistryExperiment: Heating the sample");
    }

    public void recordResults() {
        System.out.println("ChemistryExperiment: Recording the observations");
    }
}
