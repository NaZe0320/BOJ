package implementation

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {
    val date: LocalDateTime = LocalDateTime.now().plusHours(9)
    val formatter = DateTimeFormatter.ISO_DATE
    println(date.format(formatter))
}