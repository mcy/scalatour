// (Int, Int) => Int is the type of a function that
// takes two Ints and returns another Int
def combineAndSquare(x: Int, y: Int)(f: (Int, Int) => Int): Int {
    val res = f(x, y)
    res * res
}

combineAndSquare(2, 5)(_ - _ + 1) // 4