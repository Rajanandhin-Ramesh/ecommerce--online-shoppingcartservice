package com.ecommerce.online_shoppingcart.payload;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
//@RequiredArgsConstructor
public class CategoryDTO {
    private Long categoryId;
    private String categoryName;
    private String description;
}
