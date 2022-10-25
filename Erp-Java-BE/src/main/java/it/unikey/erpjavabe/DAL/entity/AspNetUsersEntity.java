package it.unikey.erpjavabe.DAL.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
@Table(name = "AspNetUsers", schema = "public", catalog = "ErpDB")
public class AspNetUsersEntity {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;


    @Column(name = "Name")
    private String name;

    @Column(name = "Lastname")
    private String lastname;
    @OneToOne(mappedBy = "aspNetUsersById")
    private EmployeesEntity employeesById;


}