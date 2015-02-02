def contextBound[A : ClassTag](x: A)
// is shorthand for
def contextBound[A](x: A)(implicit tag: ClassTag[A])

// a view bound
def asString[A <% String](x: A): String = x