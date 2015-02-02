val foo = ...

// equivalent
foo(bar) -> foo.apply(bar)

// equivalent
foo.baz = beep -> foo.baz_=(beep)

//equivalent
foo(bar) = baz -> foo.update(bar, baz)