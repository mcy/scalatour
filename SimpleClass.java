package com.xorinc.scalatour;

/**
  * A simple class that contains a mutable int and 
  * an immutable string, and an extra function.
  */
public class SimpleClass {

    private int foo;
    private String bar;

    public SimpleClass(int foo, String bar){
        this.foo = foo % 10; 
        this.bar = bar;
        System.out.println("Hello from SimpleClass");
    }

    public int getFoo() { return foo; }
    public String getBar() { return bar; }

    public void setFoo(int newFoo) { 
        this.foo = newFoo % 10;
    }

    public String something(String pre) {
        return pre + " " + foo + " " + bar;
    }
}