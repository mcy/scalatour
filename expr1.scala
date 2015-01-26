// Note that conditionals (if-else statements) are expressions
val aThing = 
    if(condition) {
        ...
    } else if(condition2) {
        ...
    } else {
        ...
    }

// also, note that
val anotherThing = if(condition) { ... }
// is the same as
val anotherThing = 
    if(condition) { ... } 
    else { () /*literal Unit*/ }

// note that these is no `a ? b : c` ternary 
// operation in scala; if-else replaces it.