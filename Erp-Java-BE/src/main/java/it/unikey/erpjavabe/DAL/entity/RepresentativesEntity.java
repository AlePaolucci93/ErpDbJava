package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Representatives", schema = "public", catalog = "ErpDB")
public class RepresentativesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private int id;
    @Basic
    @Column(name = "Name")
    private String name;
    @Basic
    @Column(name = "Email")
    private String email;
    @Basic
    @Column(name = "Phone")
    private String phone;
    @Basic
    @Column(name = "Role")
    private String role;
    @Basic
    @Column(name = "CustomerId")
    private Integer customerId;
    @Basic
    @Column(name = "IsDeleted")
    private boolean isDeleted;
    @ManyToOne
    @JoinColumn(name = "CustomerId", referencedColumnName = "Id")
    private CustomersEntity customersByCustomerId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RepresentativesEntity that = (RepresentativesEntity) o;
        return id == that.id && isDeleted == that.isDeleted && Objects.equals(name, that.name) && Objects.equals(email, that.email) && Objects.equals(phone, that.phone) && Objects.equals(role, that.role) && Objects.equals(customerId, that.customerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, phone, role, customerId, isDeleted);
    }

    public CustomersEntity getCustomersByCustomerId() {
        return customersByCustomerId;
    }

    public void setCustomersByCustomerId(CustomersEntity customersByCustomerId) {
        this.customersByCustomerId = customersByCustomerId;
    }
}
