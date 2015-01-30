# A Tour of Scala
A class for MIT Spring HSSP 2015
Language Spec, for the brave: http://www.scala-lang.org/files/archive/spec/2.11/
# Syllabus
## Week 1 - Basics
- The basic premise of Scala: Haskell-like functional programming with Java-like Object-Oriented programming
- The REPL
- Syntax Basics: We'll work inside the repl for now mostly
    - Variable and function basics
        - Legal Identifiers
        - `val myInt = 1`
        - Function appications
            - `a.foo(bar)`
            - `a.bar()`
            - `a.baz`
            - `a foo bar`
        - `def myFunction(s: String): String = s.toUpperCase
    - Basic arithmetic
        - Primitives
    - `if (cond) foo else bar`
    - `while (cond) foo`
    - `do foo while (cond)`
    - `for(i <- 0 until 5) println(i)`
    - String interpolation
    - Exception handling

## Week 2 - OO Programing
- Classes
    - Constructors
    - Fields
    - Methods
    - `this`
- Instantiation
- Inheritance
    - `override`
    - `super`
    - `final`
    - `sealed`
- Casting and Type Tests
- Abstract Classes
- Member Visibility
- Packages & Imports
- Type System
    - `Any`, `AnyRef`, `AnyVal`
    - `Null`, `Nothing`
- Case Classes
- Traits
    - Mixins
    - `abstract override`
- Anon classes and structural refinement
- Singletons
- Special Functions
    - `a.apply(b)` -> `a(b)`
    - `a.field_=(b)` -> `a.field = b`
- Type Aliases

## Week 3 - Functional Programming
- Lists
    - `Nil` and cons
- Function literals
    - `val f = a: Int => { a + 1 }`
    - `foo.bar(_.baz)`
    - `val a = { /* ... */; expression }`
- Currying
- `map`, `flatMap`, `foreach`, `filter`
- `for` comprehensions
    - generators
    - guards
    - `yield`
- Other operations on lists
    - `fold`
    - `reduce`
    - `zip`
    - `find`
    - `forall`
    - `parition`
    - `flatten`
- Tail-recursion
- `lazy val`

## Week 4 - Generics and Implicits
- Generic Classes and Functions
    - Type Variance
    - Wildcards and `forSome`
- Implicit values and parameters
- Implicit conversions and classes
    - Extension methods
- Type Bounds
- Context Bounds
- View Bounds
- Higher Kinds
- `Foo[F <: Foo[F]]`
- Structural Types
- Abstract type members

## Week 5 - Collections
- `Traversable` and `Iterable`
- `Iterator` and `Stream`
- `Set`, `Map`, and `Seq`
- `Option` and Tuples
- Mutable and Immutable Collections
- Iteroperation with Java collections

## Week 6 - Pattern Matching
- Extrator Objects
- Guards
- `PartialFunction`
- Using matching to walk a tree
- Using matching instead of type tests and casing
- `@`
- `// TODO: more pattern stuff`

## Week 7 - How does this mess of a language actually work?
- Some java interop
- `scala.reflect.api`
    - What does the language look like to the compiler?
    - `reify { ... }` and quasiquotes
    - (*Very Unlikely*) Macros
- Typechecking
- `javap` (maybe also some frenflower?)
- Implementations of features like
    - Mixins
    - Structual types
    - Singletons
    - Nonstandard indentifiers
    - Lambdas
    - Anon Classes
    - Other stuff?