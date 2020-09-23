package ch.derlin.bbdata.sbadmin

import de.codecentric.boot.admin.server.config.EnableAdminServer
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Configuration

@Configuration
@EnableAutoConfiguration
@EnableAdminServer
class SpringBootAdminApplication

fun main(args: Array<String>) {
	runApplication<SpringBootAdminApplication>(*args)
}
