package com.example.coffee2.domain.menu.dto;

import com.example.coffee2.domain.menu.entity.Menu;

public record MenuResponse(
        Long id,
        String name,
        Long price
) {

    public static MenuResponse from(Menu menu) {
        return new MenuResponse(
                menu.getId(),
                menu.getName(),
                menu.getPrice()
        );
    }
}