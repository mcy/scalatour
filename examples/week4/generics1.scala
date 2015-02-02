// a class with a type constructor
case class AnClass[A](x: A, f: A => A) {
    def mash(): A = f(x)
}

// you can construct the type 
// and save is as a type variable...
type AnIntClass = AnClass[Int]

// and instantiate it
val anThing = new AnIntClass(1, _ + 2)

// or instantiate it immediately
val anOtherThing = new AnClass[String]("foo", _.toUpperCase)