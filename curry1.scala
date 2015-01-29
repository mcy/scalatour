def foo(i: Int)(s: String) = s * i
val a = foo _ // type: (Int) => (String) => String
val b = foo(3) _ // type: (String) => String

println(b("foo")) // foofoofoo
println(a(2)("foo")) // foofoo