package com.waterquality.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Parameters")
@ToString
@Data
public class Parameter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "parameter_id")
    private Long parameterId;

    @Column(name = "parameter_name")
    private String parameterName;

}