package com.example.mvccrud.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Invoice {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String location;
    private Double amount;
}
