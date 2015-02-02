// bound above
class BoundAbove[A <: AnyRef](x: A)

// bound below
class BoundBelow[A >: String](x: A)

// both bounds
class BoundBoth[A <: Product >: Null](x: A)