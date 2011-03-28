package orb.library.actions

import orb.library.{GameState,StdEngMessages => Msg}

private[actions] object Go extends Action {
    val verbs = List("go", "n", "north", "s", "south", "e", "east", "w", "west",
                     "u", "up", "d", "down")

    def apply(args:Array[String]) = args(0) match {
        case "go" if args.length == 2 => go(args(1))
        case dir  if args.length == 1 => go(args(0))
        case _                        => println(Msg.NoCanDo)
    }

    private def go(dir:String) = {
        val loc = GameState.currentLoc
        dir match {
            case "n"     => loc.n.traverseFrom(loc)
            case "north" => loc.n.traverseFrom(loc)
            case "s"     => loc.s.traverseFrom(loc)
            case "south" => loc.s.traverseFrom(loc)
            case "e"     => loc.e.traverseFrom(loc)
            case "east"  => loc.e.traverseFrom(loc)
            case "w"     => loc.w.traverseFrom(loc)
            case "west"  => loc.w.traverseFrom(loc)
            case "u"     => loc.u.traverseFrom(loc)
            case "up"    => loc.u.traverseFrom(loc)
            case "d"     => loc.d.traverseFrom(loc)
            case "down"  => loc.d.traverseFrom(loc)
            case other   => println(Msg.IllegalTravel)
        }
    }
}
