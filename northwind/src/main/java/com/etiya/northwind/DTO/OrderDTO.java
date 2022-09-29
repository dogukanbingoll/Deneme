package com.etiya.northwind.DTO;

import com.etiya.northwind.Entities.Concretes.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {

    private Long customerId;
    private Long price;
}
