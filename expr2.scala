// exactly like Java's while loop
while (cond) {
    ...
}

// exactly like java's do-while
do {
    ...
} while (cond)

// Note that these are valid:
while (cond) foo()
do foo() while (cond)

// there is no "break"
// or "continue" in scala