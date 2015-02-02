// a conversion
// note that we can't use String.toInt 
// because that invokes another ambiguous implicit
implicit def string2int(s: String): Int = Integer.parseInt(s)

val anInt = "2" - 2 // 0

// String already has the method +(x: Any): String
val anotherInt = "2" + 2 // "22"