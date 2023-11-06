package com.example.springwebflux.magazine

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController("/magazines")
class MagazineController (
    val magazineRepository: MagazineRepository,
){


    @GetMapping("{name}")
    fun getByName(@PathVariable name : String) : Mono<Magazine> {
        return magazineRepository.findByName(name)

    }


    @PostMapping
    fun create(@RequestBody map : Map<String, Any>) : Mono<Magazine> {
        val magazine = Magazine(
            name = map["name"].toString(),
            price = map["price"] as Int
        )
        return magazineRepository.save(magazine)
    }
}