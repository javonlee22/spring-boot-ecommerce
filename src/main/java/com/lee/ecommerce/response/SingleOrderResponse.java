package com.lee.ecommerce.response;

import com.lee.ecommerce.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SingleOrderResponse {
    private Order order;
}
