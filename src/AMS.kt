import java.util.*


fun main() {
    dayOfWeek()
}

fun dayOfWeek(){
    println("What day is today?")
    val dayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    when (dayOfWeek) {
        1 -> print("Sunday ")
        2 -> print("Monday")
        3 -> print("Tuesday")
        4 -> print("Wednesday")
        5 -> print("Thursday")
        6 -> print("Friday")
        7 -> print("Saturday")
    }
}