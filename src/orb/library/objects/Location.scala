package orb.library.objects

import collection.mutable.Map
import orb.library.GameState
import Direction._

abstract class Location extends Perceptible {
    // Directions of travel.
    // Closed off for travel by default
    private val directions = Map[Direction,Connector] (
        North -> Impassable,
        South -> Impassable,
        East  -> Impassable,
        West  -> Impassable,
        Up    -> Impassable,
        Down  -> Impassable
    )
    
    private def connect(to:Location, going:Direction,
                        our:Connector, their:Connector) = their match {
        case Impassable       =>
            directions(going) = our
            to.directions(oppositeOf(going)) = our
        case theirs:Connector =>
            directions(going) = theirs
    }

    def n = directions(North)
    def n_=(conn:Connector) = connect(conn.to, North, conn, conn.to.directions(South))

    def s = directions(South)
    def s_=(conn:Connector) = connect(conn.to, South, conn, conn.to.directions(North))

    def e = directions(East)
    def e_=(conn:Connector) = connect(conn.to, East, conn, conn.to.directions(West))

    def w = directions(West)
    def w_=(conn:Connector) = connect(conn.to, West, conn, conn.to.directions(East))

    def u = directions(Up)
    def u_=(conn:Connector) = connect(conn.to, Up, conn, conn.to.directions(Down))

    def d = directions(Down)
    def d_=(conn:Connector) = connect(conn.to, Down, conn, conn.to.directions(Up))

    // Have we been visited yet?
    private var visited = false

    def acceptTraveler() = {
        println(name)

        if (!visited) {
            println(desc)
            visited = true
        }
        GameState.currentLoc = this
    }

    // Automatically convert Locations to connectors to those locations
    implicit def connectToLoc(loc:Location) = new AutoConnector(loc, this)
}

object Nowhere extends Location {
    name = "Nowhere"
    desc = ""
}