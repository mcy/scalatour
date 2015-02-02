case class AnCaseClass(i: Int, s: String)
// becomes
class AnCaseClass(val i: Int, val s: String) extends scala.Product {

    override def toString() = s"AnCaseClass($i,$s)"

    // plus some other compiler-generated members
}
object AnCaseClass {

    def apply(i: Int, s: String): AnCaseClass = new AnCaseClass(i, s)

    // this is for pattern matching, more on this later
    def unapply(x: AnCaseClass): Option[(Int, String)] = Some(x.i, x.s)
}