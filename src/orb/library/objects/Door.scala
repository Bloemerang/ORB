package orb.library.objects

import orb.library.StdEngMessages

class Door(
    var to:Location,
    var from:Location,
    var open:Boolean
) extends Connector {
    println("In Door constructor")
    def traverseFrom(loc:Location) = if (open)
        if (loc == to)
            from.acceptTraveler()
        else
            to.acceptTraveler()
    else
        println(StdEngMessages.NoTravel)
}