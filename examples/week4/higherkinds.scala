import language.higherKinds

trait AnTrait[A, B[_], ~>[_, _]] {
    def apply(x: A): A ~> B[A]
}

object AnObject extends AnTrait[Int, List, Function1] {
    def apply(x: Int): Int => List[Int] = _ :: x :: Nil
}