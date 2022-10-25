package it.unikey.erpjavabe.DAL.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
@Table(name = "Employees", schema = "public", catalog = "ErpDB")
public class EmployeesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private int id;
    @OneToOne
    @JoinColumn(name = "Id", referencedColumnName = "Id", nullable = false)
    private AspNetUsersEntity aspNetUsersById;


}
