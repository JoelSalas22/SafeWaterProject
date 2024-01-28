package com.waterquality.entity;

import jakarta.persistence.*;
import lombok.*;
@Getter
@Setter
@Entity
@Table(name = "Parameters")
@AllArgsConstructor
@NoArgsConstructor
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