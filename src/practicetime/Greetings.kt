package practicetime

import java.time.LocalTime
import java.util.*

fun main(args:Array<String>) {
    greet()
    dayOfWeek()
}

fun greet() {
    var hour = LocalTime.now().hour
    when(hour){
        in 0..12 -> println("Good morrning")
        in 12..18 -> println("Good afternoon")
        in 18..23 -> println("Good evening")
    }
}

fun dayOfWeek() {
    println("What day is today?")
    val dayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    when (dayOfWeek) {
        1 -> print("Sunday")
        2 -> print("Monday")
        3 -> print("Tuesday")
        4 -> print("Wednesday")
        5 -> print("Thursday")
        6 -> print("Friday")
        7 -> print("Saturday")
    }
}

