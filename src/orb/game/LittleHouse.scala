package orb.game

import orb.library.objects._
import orb.library.runtime.Adventure

object LittleHouse extends Location {
    val name = "Little House"
    val desc = "a little house"

    s = FrontLawn
}


object FrontLawn extends Location {
    val name = "Lawn"
    val desc = "A well-kept lawn. To the north is a little house"
    
    n = LittleHouse
}


object Game extends Adventure(FrontLawn, "Welcome to ORB")