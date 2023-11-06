package com.example.springwebflux.magazine

import org.springframework.data.repository.reactive.ReactiveCrudRepository
import reactor.core.publisher.Mono

interface MagazineRepository : ReactiveCrudRepository<Magazine, Long> {

    fun findByName(name: String): Mono<Magazine>
}