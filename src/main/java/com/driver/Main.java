package com.driver;

public class Main {
    static class A {
        String meth() {
            return "Method is overridden in Extendend class B";
        }
    }

    static class B extends A {
        @Override
        String meth() {
            return "Method is overridden in Extendend class B";
        }
    }

    public static void main(String[] args) {
        B obj = new B();
        obj.meth();
    }


}