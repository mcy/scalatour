// implicit class, extension method pattern
implicit class _double(val d: Double) extends AnyVal {
    def **(other: Double): Double = Math.pow(d, other)
}

val power = 2 ** 3 // 8.0