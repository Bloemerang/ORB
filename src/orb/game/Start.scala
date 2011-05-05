package orb.game

import orb.library.objects._
import orb.library.runtime.Adventure
import orb.library._

object Start extends Adventure (DarkRoom, "Welcome to The Cave")

object DarkRoom extends Location {
   name = "The Cave"
   desc =
"""You find yourself in a dark damp cave. It is not immediately clear how
long you have been here...perhaps forever. There is a guy here named Steven
drinking Killians, but you ignore him. Something tells you this is all his
fault.

To the north you see a group of stalagmites. They will probably fall and kill
you if you go over there. The eastern side is a wall, and to south is that dude
with the Killians. Seems like the only way to freedom is by trekking west along
the Oregon Trail. I mean, oops...wrong era. But yes, west it is, and how you
have a sense of direction in The Cave is inexplicable. But at least you wont die
of dysentery. """

    //n = "Dude! The stalagmites!"
    //w = new Door (DarkRoom, Corridor, true)


}