package orb.library

import collection.mutable.Map

package object actions {
    private val actionMap = Map[String,( Array[String] => Unit)]()

    def apply(args:Array[String]) = if (args.length > 0)
        actionMap(args(0)).apply(args)

    // Load predefined actions
    private def load(action:Action) =
        action.verbs foreach {actionMap(_) = action}
    
    load(Go)
    load(Look)
}
