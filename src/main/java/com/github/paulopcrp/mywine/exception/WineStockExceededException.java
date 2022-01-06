package com.github.paulopcrp.mywine.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class WineStockExceededException extends Exception {
    public WineStockExceededException(Long id, int quantityToIncrement) {
        super(String.format("Wine with %s ID to increment informed exceeds the max stock capacity: %s", id, quantityToIncrement));
    }
}
