// a basic function definiton
def doSomething(n: Int) = n + 1

// equivalent definition
def doSomething(n: Int): Int = {
    // return keyword is optional
    return n + 1 
}

doSomething(3) // function application; evaluates to `4`

foo.bar(baz) // method application (more on what this means later)

// infix notation
1 + 2 /*and*/ (1).+(2) 
// are equivalent

// beware of symbol vs alphanum indents
==#>foo`def` /*and*/ `==#>`.`foo`(`def`)
// are equivalent (!)
