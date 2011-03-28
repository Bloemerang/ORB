package orb.library.actions

import orb.library.GameState

private[actions] object Look extends Action {
    val verbs = List("look", "l")

    def apply(args:Array[String]) = println(GameState.currentLoc.desc)
}
