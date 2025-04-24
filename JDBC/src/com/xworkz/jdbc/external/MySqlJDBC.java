package com.xworkz.jdbc.external;

import com.xworkz.jdbc.internal.JDBC;

public class MySqlJDBC implements JDBC {
    @Override
    public void save() {
        System.out.println("running save in mysqljdbc");
    }
}
