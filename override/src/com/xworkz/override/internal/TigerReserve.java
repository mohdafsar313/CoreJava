package com.xworkz.override.internal;

public class TigerReserve {
    public TigerReserve() {
        System.out.println("TigerReserve: Constructor is running");
    }

    @Override
    public void protectWildlife() {
        System.out.println("TigerReserve: Focused on conserving tiger population");
    }

    public void monitorTigers() {
        System.out.println("TigerReserve: Monitoring tiger movements with tracking collars");
    }

    public void conductSafari() {
        System.out.println("TigerReserve: Conducting wildlife safaris for visitors");
    }
}
