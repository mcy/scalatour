val list = 1 to 5 // list of ints from 1 to 5

// map returns a list where each 
// element is the result of a function
list.map(5 - _)
// flatMap is like map, but it flattens
// the resulting list of lists
list.flatMap(i => (1 to 3).map(_ * i))
// foreach does an operation on each 
// element and ignores the result
list.foreach(println(_))
// filter returns a list of elements 
// that match a given predicate
list.filter(_ < 3)