// I am a comment
/* I am a 
   multiline comment */
package com.xorinc.scalatour // package declaration *

object Main extends App { // singleton declaration and inheritance *

    val anInt = 1; // immutable `val`ue definition
                   // the semicolon is allowed but not required
    var anDouble: Double = 0.5 // mutable `var`iable definiton
    anDouble = 1.2 // var reassignment

    def plusTwo(n: Int) = n + 2 // function `def`inition

    println(plusTwo(anInt)) // function call/application
}
// * we'll talk about these later