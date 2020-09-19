import models.LogWriter
import models.Person

fun main(args: Array<String>) {
    val log: LogWriter = LogWriter("log")

    val personVitor: Person = Person("Vitor", 18, "Development")

    log.write(personVitor.showInfo())
}