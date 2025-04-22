package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.rules.Book;

public class Fairytale implements Book {
    @Override
    public void author() {
        System.out.println("running author in book");
    }
}
