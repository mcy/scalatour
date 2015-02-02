// canonical syntax
(i: Int, j: Int) => { x + y } 
// let the compiler guess the signature from context
(i, j) => x + y
// nilary function
() => println("hai")
// another nilary function
val a = { val i = something(); i + 1 }
// underscore notation
List(1, 2, 3).map(_ + 1)