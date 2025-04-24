package com.xworkz.jdbc.external;

import com.xworkz.jdbc.internal.JDBC;
import jdk.nashorn.internal.scripts.JD;

public class OracleJDBC implements JDBC {
    @Override
    public void save() {
        System.out.println("running save in oraclejdbc");
    }
}
