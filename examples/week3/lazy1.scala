lazy val expensiveResult = {
    val x = myExpensiveComputation()
    x * 10
}

def until(cond: => Boolean)(f: => Unit): Unit = while(!cond) f

var foo = 10
until (foo == 0) {
    println(foo)
    foo -= 1
}