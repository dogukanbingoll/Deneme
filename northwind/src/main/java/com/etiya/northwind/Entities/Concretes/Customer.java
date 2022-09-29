package com.etiya.northwind.Entities.Concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="customers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    @Column(name="customer_id")
    private Long customerId;

    private String firstName;

    private String lastName;

    private String email;

    private String passwor;

    @OneToMany(mappedBy = "customer")
    private List<Order> order;


}
