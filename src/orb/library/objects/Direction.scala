package orb.library.objects

object Direction extends Enumeration {
    type Direction = Value

    val North, South, East, West, Up, Down = Value

    def oppositeOf(d:Direction) = d match {
        case North => South
        case South => North
        case East  => West
        case West  => East
        case Up    => Down
        case Down  => Up
    }
}
