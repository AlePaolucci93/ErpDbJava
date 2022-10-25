package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "EmployeeCvs", schema = "public", catalog = "ErpDB")
public class EmployeeCvsEntity {
    private int id;
    private String cvpath;
    private Timestamp dateOfInsertion;
    private Integer employeeId;
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
    @Column(name = "Cvpath", nullable = true, length = -1)
    public String getCvpath() {
        return cvpath;
    }

    public void setCvpath(String cvpath) {
        this.cvpath = cvpath;
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
    @Column(name = "EmployeeId", nullable = true)
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
        EmployeeCvsEntity that = (EmployeeCvsEntity) o;
        return id == that.id && Objects.equals(cvpath, that.cvpath) && Objects.equals(dateOfInsertion, that.dateOfInsertion) && Objects.equals(employeeId, that.employeeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cvpath, dateOfInsertion, employeeId);
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
