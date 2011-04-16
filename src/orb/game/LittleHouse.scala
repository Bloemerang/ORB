package orb.game

import orb.library.objects._
import orb.library.runtime.Adventure
import orb.library._

object FrontLawn extends Location {
    name = "Lawn"
    desc = "A well-kept lawn. To the north is a little house. " +
           "a screen door leads on to the porch"

    n = open door leading to FrontPorch
}

object FrontPorch extends Location {
    name = "Front Porch"
    desc = "A nice, tidy porch with a screen door. " +
           "The front door is to the north"

    s = open door leading to FrontLawn
    n = open door leading to Foyer
}

object Foyer extends Location {
    name = "Foyer"
    desc = "A large, spacious foyer, painted red. " +
           "To the east is a door to the cellar; " +
           "to the west is a door into the bathroom."

    s = open door leading to FrontPorch
    e = door to CellarStairs
    w = open door leading to Bathroom
}

object CellarStairs extends Location {
    name = "Cellar Stairs"
    desc = "The cellar stairs"

    w = door to Foyer
}

object Bathroom extends Location {
    name = "Bathroom"
    desc = "The bathroom"

    e = open door leading to Foyer
}


object Game extends Adventure(FrontLawn)