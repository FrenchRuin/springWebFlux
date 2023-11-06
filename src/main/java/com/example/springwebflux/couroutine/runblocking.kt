package com.example.springwebflux.couroutine

import kotlinx.coroutines.runBlocking

fun main(){

    // 코루틴 빌더
    runBlocking {
        println("Hello")
        println(Thread.currentThread().name)
        /* 테스트코드, 특정라이브러리들에서 논블락킹을 지원하지 않기때문에 필요*/
    }

    println("World")
    println(Thread.currentThread().name)
}