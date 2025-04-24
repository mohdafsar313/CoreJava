package com.xworkz.jdbc.external;

import com.xworkz.jdbc.internal.JDBC;

public class Sql {
    private JDBC jdbc;

    public Sql(JDBC jdbc){
        this .jdbc=jdbc;
    }
    public void sqlInfo(){
        this.jdbc.save();
        if(this.jdbc!=null){
            System.out.println("running sqlinfo");
        }
        else {
            System.out.println("jdbc is null");
        }
    }
}
