package com.codewithmosh.store.dtos;

import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
public class CartDto {
    private UUID id;
    private final List<CartItemDto> items = new ArrayList<>();
    private final BigDecimal totalPrice = BigDecimal.ZERO;
}
