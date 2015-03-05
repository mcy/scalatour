val list = List(1,2,3,4,5)
val thing = list match {
	// extract the whole list
	case List(1, a, 3, b, 5) => List(a, b)
	// match on the list head
	case a :: 2 :: rest => a :: rest
	// same as above
	case List(a, 2, rest @ _*) => a :: rest
	// match an empty list
	case Nil => List()
	// why is this match not exhaustive?
}
