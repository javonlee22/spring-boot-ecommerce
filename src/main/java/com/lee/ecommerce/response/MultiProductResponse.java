package com.lee.ecommerce.response;

import com.lee.ecommerce.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MultiProductResponse {
    private List<Product> products;
}
