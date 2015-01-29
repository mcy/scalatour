// Scala
println(
    List(1, 2, 3, 4, 5)
        .filter(_ % 2 == 0)
        .map(_ * 3)
        .mkString("\n")
)