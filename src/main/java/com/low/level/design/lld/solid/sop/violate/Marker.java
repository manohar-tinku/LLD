package com.low.level.design.lld.solid.sop.violate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Marker {
    private String name;
    private String color;
    private String brand;
    private int price;
}
