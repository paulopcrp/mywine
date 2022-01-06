package com.github.paulopcrp.mywine.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum WineType {

    MALBEC("malbec"),
    TANNAT("tannat"),
    MERLOT("merlot"),
    BARBERA("barbera"),
    CHARDONNAY("chardonnay"),
    CABERNET("cabernet"),
    SEMILLON("semillon");

    private final String description;
}
