package orb.library.actions

import orb.library.actions._

trait Action extends ( Array[String] => Unit) {
    val verbs:List[String]
}
