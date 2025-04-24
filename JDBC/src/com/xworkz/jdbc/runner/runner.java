package com.xworkz.jdbc.runner;


import com.xworkz.jdbc.external.MySqlJDBC;
import com.xworkz.jdbc.external.OracleJDBC;
import com.xworkz.jdbc.internal.JDBC;

public class runner {
    public static void main(String[] args) {
        JDBC jdbc1 =new MySqlJDBC();
        jdbc1.save();
        JDBC jdbc2 =new OracleJDBC();
        jdbc2.save();
    }
}
