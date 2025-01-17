package com.somgu.violet.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class SampleController {
  @GetMapping
  public Mono<String> getMain() {
    return Mono.just("Hello World!");
  }
}