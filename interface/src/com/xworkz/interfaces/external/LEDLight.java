package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.rules.Light;

public class LEDLight implements Light
{
    @Override
    public void turnOn() {
        System.out.println("LED Light is turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("LED Light is turned OFF");
    }

    @Override
    public void dim() {
        System.out.println("LED Light is dimmed");
    }

    @Override
    public void brighten() {
        System.out.println("LED Light is brightened");
    }

    @Override
    public void blink() {
        System.out.println("LED Light is blinking");
    }
}
