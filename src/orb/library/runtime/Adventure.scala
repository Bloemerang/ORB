package orb.library.runtime

import orb.library.objects.Location
import orb.library.actions
import orb.library.{StdEngMessages => Msg}

class Adventure(initial:Location, intro:String) extends Application {
    def this(initial:Location) = this(initial, "")

    println(intro)
    initial.acceptTraveler()

    var input = readLine(">> ") split " "
    while (input.length == 0 || input(0) != "exit") {
        try actions apply input
        catch {
            case e:NoSuchElementException => println(Msg.NoCanDo)
        }
        input = readLine(">> ") split " "
    }
    println("Bye!")
}
