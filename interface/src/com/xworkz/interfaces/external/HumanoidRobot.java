package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.rules.Robot;

public class HumanoidRobot implements Robot {
    @Override
    public void start() {
        System.out.println("Humanoid robot is starting");
    }

    @Override
    public void stop() {
        System.out.println("Humanoid robot is stopping");
    }

    @Override
    public void walk() {
        System.out.println("Humanoid robot is walking");
    }

    @Override
    public void talk() {
        System.out.println("Humanoid robot is talking");
    }

    @Override
    public void pickUpObject() {
        System.out.println("Humanoid robot is picking up an object");
    }

    @Override
    public void performTask() {
        System.out.println("Humanoid robot is performing a task");
    }

    @Override
    public void charge() {
        System.out.println("Humanoid robot is charging");
    }
}
