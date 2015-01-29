def factorial(n: Int): Int =
    if(n <= 1) 1
    else factorial(n - 1) * n

def fibs(n: Int): List[Int] =
    if(n <= 2) List(1, 0)
    else {
        val last = fibs(n - 1)
        last.take(2).reduce(_ + _) :: last
    }