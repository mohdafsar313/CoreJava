package com.xworkz.jdbc.runner;


import com.xworkz.jdbc.external.MySqlJDBC;
import com.xworkz.jdbc.external.OracleJDBC;
import com.xworkz.jdbc.external.Sql;
import com.xworkz.jdbc.internal.JDBC;

public class runner {
    public static void main(String[] args) {
        JDBC jdbc =new MySqlJDBC();
        Sql sql=new Sql(jdbc);
        sql.sqlInfo();
    }
}
