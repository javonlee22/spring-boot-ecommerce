package com.lee.ecommerce.response;

import com.lee.ecommerce.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SingleProductResponse {
    private Product product;
}
