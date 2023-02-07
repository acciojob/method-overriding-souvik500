package com.driver;

public class Main {
    class A {
        String meth() {
            return "Method is overridden in Extendend class B";
        }
    }

    class B extends A {
        String meth() {
            return "Method is overridden in Extendend class B";
        }
    }

    public void main(String[] args) {
        B obj = new B();
        obj.meth();
    }


}