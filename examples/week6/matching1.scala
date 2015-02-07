def mash(o: Option[_]): Int = o match {
    case Some("one") => 1
    case Some(i: Int) => i
    case Some(l: List[_]) => l.length
    case Some(s: String) => s.length
    case Some(_) => 0
    case None => -1
} 

case class Foo(x: Any, y: Any)
def mash(f: Foo): String = f match {
    case Foo("toString", x) => x.toString
    case Foo(_, "toString") => "toString"
    case Foo(x: String, y: String) => x + y
    case Foo(_, _) => "nada"
}