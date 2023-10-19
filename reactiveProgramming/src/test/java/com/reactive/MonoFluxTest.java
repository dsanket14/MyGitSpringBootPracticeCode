package com.reactive;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class MonoFluxTest {

    @Test
    public void monoTest(){
        Mono<?> monoString=Mono.just("Sanket")
                .then(Mono.error(new RuntimeException("error")))
                .log();

        monoString.subscribe(System.out::println);
    }
    @Test
    public void fluxTest(){
        Flux<?> fluxString=Flux.just("Sanket","Deshmukh","Nagarro")
                .concatWithValues("aws")
                .concatWith(Flux.error(new RuntimeException("error")))
                .concatWithValues("cloud")
                .log();

        fluxString.subscribe(i->System.out.println(i));
    }
}
