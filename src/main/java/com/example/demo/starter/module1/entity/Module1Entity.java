package com.example.demo.starter.module1.entity;

import com.example.demo.starter.shared.base.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@Table(name = "module1")
@NoArgsConstructor @AllArgsConstructor
public class Module1Entity extends BaseEntity {
    private String name;
}
