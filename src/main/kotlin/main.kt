fun main() {
    println(agoToText(600))
}

fun agoToText(timeOnline: Int) {
        var minutes = (timeOnline / 60)
        var hours = (timeOnline / 3600)
        var wordMinute: String = "минуту"
        if (minutes % 10 == 1) wordMinute = "минуту"
        if (minutes % 10 >= 2 && minutes % 10 < 5) wordMinute = "минуты"
        if (minutes % 10 >= 5 || minutes % 10 == 0) wordMinute = "минут"
        if (minutes >= 11 && minutes <= 14) wordMinute = "минут"

        var wordHour: String = "час"
        if (hours % 10 == 1) wordHour = "час"
        if (hours % 10 >= 2 && hours % 10 < 5) wordHour = "часа"
        if (hours % 10 >= 5 || hours % 10 == 0) wordHour = "часов"
        when (timeOnline) {
                in 1..60 -> println("был(а) только что")
                in 60..60 * 60 -> println("был(а) $minutes $wordMinute назад")
                in 60 * 60 + 1..24 * 60 * 60 -> println("был(а) $hours $wordHour назад")
                in 24 * 60 * 60..2 * 24 * 60 * 60 -> println("был(а) вчера")
                in 2 * 24 * 60 * 60..3 * 24 * 60 * 60 -> println("был(а) позавчера")
                else -> println("был(а) давно")
        }
}
