package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Addresses", schema = "public", catalog = "ErpDB")
public class AddressesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private int id;
    @Basic
    @Column(name = "AddressType")
    private int addressType;
    @Basic
    @Column(name = "StreetName")
    private String streetName;
    @Basic
    @Column(name = "CAP")
    private String cap;
    @Basic
    @Column(name = "City")
    private String city;
    @Basic
    @Column(name = "EmployeeId")
    private Integer employeeId;
    @ManyToOne
    @JoinColumn(name = "EmployeeId", referencedColumnName = "Id")
    private EmployeesEntity employeesByEmployeeId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAddressType() {
        return addressType;
    }

    public void setAddressType(int addressType) {
        this.addressType = addressType;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressesEntity that = (AddressesEntity) o;
        return id == that.id && addressType == that.addressType && Objects.equals(streetName, that.streetName) && Objects.equals(cap, that.cap) && Objects.equals(city, that.city) && Objects.equals(employeeId, that.employeeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, addressType, streetName, cap, city, employeeId);
    }

    public EmployeesEntity getEmployeesByEmployeeId() {
        return employeesByEmployeeId;
    }

    public void setEmployeesByEmployeeId(EmployeesEntity employeesByEmployeeId) {
        this.employeesByEmployeeId = employeesByEmployeeId;
    }
}
