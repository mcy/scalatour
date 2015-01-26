// In scala, pretty much anything is a legal identifier

val alpha1234 = 1
val 0isanumber = 0 // identifiers can't start with numbers

// symbols can be used but can't mix with letters/numbers
val =@= = "?"

def foo_=(i: Int) // alphanum_symbol is allowed only in that order

// if wrapped in backticks, a string becomes an identifier
var `Look Im an Identifier!` = -3