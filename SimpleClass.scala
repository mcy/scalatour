package com.xorinc.scalatour

/**
  * A simple class that contains a mutable int and 
  * an immutable string, and an extra function.
  */
class SimpleClass(newFoo: Int, newBar: String) {

    private var _foo = newFoo % 10
    val bar: String = newBar

    println("Hello from SimpleClass")

    // getter for _foo
    def foo: Int = _foo

    // setter for _foo
    def foo_=(i: Int): Unit = _foo = i % 10

    def something(pre: String): String = s"${pre.toUpperCase} $foo $bar"
    
}

// example usage
val simple = new SimpleClass(11, "Hi")
println(simple.foo) // prints "1"
simple.foo = 24
println(simple.something("Foo")) // prints "FOO 4 Hi"