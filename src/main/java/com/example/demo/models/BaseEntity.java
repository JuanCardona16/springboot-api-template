package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

// Clase padre de las entidades
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @UuidGenerator
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long uuid;

    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    @Column(nullable = false, updatable = false, name = "createAt")
    private Date createAt; // Fecha de creacion como en nodeJS

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updateAt")
    private Date updateAt; // Fecha de actualizacion como en nodeJS

    // Cada que halla una actualizacion crea una instancia nueva
    @PreUpdate
    public void preUpdate() {
        updateAt = new Date();
    }

}
