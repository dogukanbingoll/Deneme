package com.etiya.northwind.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {
    private Long customerId;

    private String firstName;
    private String lastName;
    private String email;
    private String password;


}
