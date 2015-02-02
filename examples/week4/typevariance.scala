class T; class S extends T

// Invariant[S] <: Invariant[T] is not true despite S <: T
class Invariant[A]

// Covariant[S] <: Covariant[T] is true because S <: T 
class Covriant[+A]

// Contravariant[S] >: Contravariant[T] is true because S <: T
class Contravariant[-A]