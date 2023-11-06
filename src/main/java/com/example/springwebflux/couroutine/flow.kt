package com.example.springwebflux.couroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    val flow = simple()

    // collect 최종연산자....
    flow.collect { value -> println(value) }
}

fun simple(): Flow<Int> = flow {
    println("Flow start")

    for (i in 1..5) {
        delay(100)
        emit(i)
    }
}

