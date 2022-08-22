package com.zzaisang.kotlinspringkafkastreams

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinSpringKafkaStreamsApplication

fun main(args: Array<String>) {
    runApplication<KotlinSpringKafkaStreamsApplication>(*args)
}
