// equivalent, compiler can guess the type
val anInt = 1
val anInt: Int = 1

// compiler complains, anInt is 
// immutable and can't be changed
anInt = 2

var anDouble = 0.2
var anAny: Any = 0.2

// compiler complains, `anDouble` is of type Double
anDouble = "foo" 

// anything can be assigned to an Any var
anAny = "foo" 


