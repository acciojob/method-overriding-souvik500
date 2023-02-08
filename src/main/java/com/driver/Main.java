package com.driver;

public class Main {
    public static class A {
        String meth() {
            return "Method is overridden in Extendend class B";
        }
    }

    public static class B extends A {
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