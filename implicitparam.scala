implicit val anImplicit: Int = 12

def iHazImplicit(i: Int)(implicit j: Int): Int = i + j

iHazImplicit(8) // 20