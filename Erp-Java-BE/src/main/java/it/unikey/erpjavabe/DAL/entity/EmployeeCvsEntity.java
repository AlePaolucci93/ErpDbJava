package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "EmployeeCvs", schema = "public", catalog = "ErpDB")
public class EmployeeCvsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private int id;
    @Basic
    @Column(name = "Cvpath")
    private String cvpath;
    @Basic
    @Column(name = "DateOfInsertion")
    private Timestamp dateOfInsertion;
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

    public String getCvpath() {
        return cvpath;
    }

    public void setCvpath(String cvpath) {
        this.cvpath = cvpath;
    }

    public Timestamp getDateOfInsertion() {
        return dateOfInsertion;
    }

    public void setDateOfInsertion(Timestamp dateOfInsertion) {
        this.dateOfInsertion = dateOfInsertion;
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
        EmployeeCvsEntity that = (EmployeeCvsEntity) o;
        return id == that.id && Objects.equals(cvpath, that.cvpath) && Objects.equals(dateOfInsertion, that.dateOfInsertion) && Objects.equals(employeeId, that.employeeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cvpath, dateOfInsertion, employeeId);
    }

    public EmployeesEntity getEmployeesByEmployeeId() {
        return employeesByEmployeeId;
    }

    public void setEmployeesByEmployeeId(EmployeesEntity employeesByEmployeeId) {
        this.employeesByEmployeeId = employeesByEmployeeId;
    }
}
