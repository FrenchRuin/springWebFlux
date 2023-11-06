package com.example.springwebflux.couroutine

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main() = runBlocking<Unit> {


    val job1: Job = launch {
        val time = measureTimeMillis {
            delay(150)
        }
        println("async task - 1 $time ms")
    }
    job1.cancel()

    val job2: Job = launch(start = CoroutineStart.LAZY) {

        val time = measureTimeMillis {
            delay(100)
        }
        println("async task - 2 $time ms")
    }

    println("start task 2")

    job2.start()
}


