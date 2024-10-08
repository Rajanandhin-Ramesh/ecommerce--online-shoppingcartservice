package com.ecommerce.online_shoppingcart.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "addresses")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;

    @NotBlank
    @Size(min = 5, message = "Street must contains atleast 5 characters")
    private String street;

    @NotBlank
    @Size(min = 4, message = "Flat No must contains atleast 4 characters")
    private String buildingName;

    @NotBlank
    @Size(min = 4, message = "City must contains atleast 4 characters")
    private String city;

    @NotBlank
    @Size(min = 4, message = "State must contains atleast 4 characters")
    private String state;

    @NotBlank
    @Size(min = 2, message = "Country must contains atleast 2 characters")
    private String country;

    @NotBlank
    @Size(min = 6, message = "Pincode must contains atleast 6 characters")
    private String pinCode;

    @ToString.Exclude
    @ManyToMany(mappedBy = "addresses")
    private List<User> users = new ArrayList<>();

    public Address(String street, String buildingName, String city, String state, String country, String pinCode) {
        this.street = street;
        this.buildingName = buildingName;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pinCode = pinCode;
    }
}