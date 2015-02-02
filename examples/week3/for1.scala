// prints numbers 1 to 10
for(i <- 1 to 10)
    println(10)
// prints all combinations of the numbers 1 to 10
// except the ones where both numbers are the same
for(i <- 1 to 10; j <- 1 to 10; if i != j)
    println(s"$i $j")
// assigns a list of powers of 5 to `powers`
val powers = 
    for(i <- 1 to 10; j = 5)
        yield Math.pow(j, i)
// equivalent to list.map(f)
for(el <- list)
    yield f(el)
