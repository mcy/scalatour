val anonClass = new SomeClass {
    override def foo: Int = compute();
    def aNewFunction(s: String): String = 
        s + "hello from anon class"
}
println(aNewFunction("foo")) // prints "foohello from anon class"
