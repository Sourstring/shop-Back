package com.example.shop.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.Set;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @OneToMany
    private Set<Product> products;

}
