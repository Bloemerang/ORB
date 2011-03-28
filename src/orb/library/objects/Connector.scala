package orb.library.objects

import orb.library.{StdEngMessages => Msg}

trait Connector {
    var   to:Location
    var from:Location

    def traverseFrom(loc:Location): Location
}

final class AutoConnector(
    toLoc:  Location,
    fromLoc:Location
) extends Connector {
    var to   = toLoc
    var from = fromLoc

    def traverseFrom(loc:Location) =
        if (loc == to) {
            from.acceptTraveler()
            from
        } else {
            to.acceptTraveler()
            to
        }
}

object Impassable extends Connector {
    override var to:Location   = Nowhere
    override var from:Location = Nowhere

    def traverseFrom(loc:Location) = {
        println(Msg.NoTravel)
        loc
    }
}