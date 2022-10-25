package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "EmployeePaySlip", schema = "public", catalog = "ErpDB")
public class EmployeePaySlipEntity {
    private int id;
    private Integer employeeId;
    private String employeePaySlipPath;
    private String paySlipDate;
    private EmployeesEntity employeesByEmployeeId;

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
    @Column(name = "EmployeeId", nullable = true)
    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    @Basic
    @Column(name = "EmployeePaySlipPath", nullable = true, length = -1)
    public String getEmployeePaySlipPath() {
        return employeePaySlipPath;
    }

    public void setEmployeePaySlipPath(String employeePaySlipPath) {
        this.employeePaySlipPath = employeePaySlipPath;
    }

    @Basic
    @Column(name = "PaySlipDate", nullable = true, length = -1)
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

    @ManyToOne
    @JoinColumn(name = "EmployeeId", referencedColumnName = "Id")
    public EmployeesEntity getEmployeesByEmployeeId() {
        return employeesByEmployeeId;
    }

    public void setEmployeesByEmployeeId(EmployeesEntity employeesByEmployeeId) {
        this.employeesByEmployeeId = employeesByEmployeeId;
    }
}
