package com.github.paulopcrp.mywine.dto;


import com.github.paulopcrp.mywine.enums.WineType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WineDTO {

    private Long id;

    @NotNull
    @Size(min=1, max=100)
    private String name;

    @NotNull
    @Size(min=1, max=100)
    private String brand;

    @NotNull
    @Max(100)
    private Integer max;

    @NotNull
    @Max(100)
    private Integer quantity;

    @Enumerated(EnumType.STRING)
    @NotNull
    private WineType type;


}
