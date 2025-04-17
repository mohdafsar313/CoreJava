package com.xworkz.object.internal;

import java.util.Objects;

public class MyString {
    private String value;
    private int length;
    private String encoding;
    private boolean isEmpty;

    public MyString() {
    }

    public void setString(String value, int length, String encoding, boolean isEmpty) {
        this.value = value;
        this.length = length;
        this.encoding = encoding;
        this.isEmpty = isEmpty;
    }

    @Override
    public String toString() {
        return "MyString{value='" + value + "', length=" + length + ", encoding='" + encoding + "', isEmpty=" + isEmpty + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof MyString) {
            MyString myString = (MyString) obj;
            if (Objects.equals(this.value, myString.value) &&
                    this.length == myString.length &&
                    Objects.equals(this.encoding, myString.encoding) &&
                    this.isEmpty == myString.isEmpty) {
                System.out.println("Strings are matching..");
                return true;
            }
        }
        return false;
    }
}
