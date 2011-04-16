package orb.game

import orb.library.objects._
import orb.library.runtime.Adventure
import orb.library._

object FrontLawn extends Location {
    name = "Lawn"
    desc = "A well-kept lawn. To the north is a little house. " +
           "a screen door leads on to the porch"

    n = new Door(FrontPorch, FrontLawn, true)
}

object FrontPorch extends Location {
    name = "Front Porch"
    desc = "A nice, tidy porch with a screen door. " +
           "The front door is to the north"

    s = new Door(FrontLawn, FrontPorch, true)
    n = new Door(Foyer, FrontPorch, true)
}

object Foyer extends Location {
    name = "Foyer"
    desc = "A large, spacious foyer, painted red. " +
           "To the east is a door to the cellar; " +
           "to the west is a door into the bathroom."

    s = new Door(FrontPorch, Foyer, true)
    e = new Door(CellarStairs, Foyer, true)
    w = new Door(Bathroom, Foyer, true)
}

object CellarStairs extends Location {
    name = "Cellar Stairs"
    desc = "The cellar stairs"

    w = new Door(Foyer, CellarStairs, true)
}

object Bathroom extends Location {
    name = "Bathroom"
    desc = "The bathroom"

    e = new Door(Foyer, Bathroom, true)
}


object Game extends Adventure(FrontLawn, "Welcome to ORB")
