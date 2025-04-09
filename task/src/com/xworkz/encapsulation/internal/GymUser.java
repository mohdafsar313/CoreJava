package com.xworkz.encapsulation.internal;

public class GymUser {
    public void test() {
        Gym gym = new Gym();
        gym.setName("FitZone");
        gym.setLocation("Indiranagar");
        gym.setNumberOfTrainers(8);
        gym.setOpen24Hours(true);
        gym.setMonthlyFee(1500.0);

        System.out.println("Gym Name: " + gym.getName());
        System.out.println("Location: " + gym.getLocation());
        System.out.println("Open 24 Hours? " + gym.isOpen24Hours());

        gym.startWorkout();
    }
}
