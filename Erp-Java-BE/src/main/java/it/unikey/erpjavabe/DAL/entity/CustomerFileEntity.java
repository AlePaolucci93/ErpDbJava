package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "CustomerFile", schema = "public", catalog = "ErpDB")
public class CustomerFileEntity {
    private int id;
    private String path;
    private Timestamp dateOfInsertion;
    private Integer customerId;
    private CustomersEntity customersByCustomerId;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Path", nullable = true, length = -1)
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Basic
    @Column(name = "DateOfInsertion", nullable = false)
    public Timestamp getDateOfInsertion() {
        return dateOfInsertion;
    }

    public void setDateOfInsertion(Timestamp dateOfInsertion) {
        this.dateOfInsertion = dateOfInsertion;
    }

    @Basic
    @Column(name = "CustomerId", nullable = true)
    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerFileEntity that = (CustomerFileEntity) o;
        return id == that.id && Objects.equals(path, that.path) && Objects.equals(dateOfInsertion, that.dateOfInsertion) && Objects.equals(customerId, that.customerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, path, dateOfInsertion, customerId);
    }

    @ManyToOne
    @JoinColumn(name = "CustomerId", referencedColumnName = "Id")
    public CustomersEntity getCustomersByCustomerId() {
        return customersByCustomerId;
    }

    public void setCustomersByCustomerId(CustomersEntity customersByCustomerId) {
        this.customersByCustomerId = customersByCustomerId;
    }
}
