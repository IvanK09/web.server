package IvanKo09.webserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WebServerApplication

fun main(args: Array<String>) {
	runApplication<WebServerApplication>(*args)
}
