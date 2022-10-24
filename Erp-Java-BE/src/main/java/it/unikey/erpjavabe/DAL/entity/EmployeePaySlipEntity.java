package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "EmployeePaySlip", schema = "public", catalog = "ErpDB")
public class EmployeePaySlipEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private int id;
    @Basic
    @Column(name = "EmployeeId")
    private Integer employeeId;
    @Basic
    @Column(name = "EmployeePaySlipPath")
    private String employeePaySlipPath;
    @Basic
    @Column(name = "PaySlipDate")
    private String paySlipDate;
    @ManyToOne
    @JoinColumn(name = "EmployeeId", referencedColumnName = "Id")
    private EmployeesEntity employeesByEmployeeId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeePaySlipPath() {
        return employeePaySlipPath;
    }

    public void setEmployeePaySlipPath(String employeePaySlipPath) {
        this.employeePaySlipPath = employeePaySlipPath;
    }

    public String getPaySlipDate() {
        return paySlipDate;
    }

    public void setPaySlipDate(String paySlipDate) {
        this.paySlipDate = paySlipDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeePaySlipEntity that = (EmployeePaySlipEntity) o;
        return id == that.id && Objects.equals(employeeId, that.employeeId) && Objects.equals(employeePaySlipPath, that.employeePaySlipPath) && Objects.equals(paySlipDate, that.paySlipDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, employeeId, employeePaySlipPath, paySlipDate);
    }

    public EmployeesEntity getEmployeesByEmployeeId() {
        return employeesByEmployeeId;
    }

    public void setEmployeesByEmployeeId(EmployeesEntity employeesByEmployeeId) {
        this.employeesByEmployeeId = employeesByEmployeeId;
    }
}
