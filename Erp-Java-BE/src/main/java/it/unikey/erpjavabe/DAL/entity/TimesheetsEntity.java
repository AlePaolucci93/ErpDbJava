package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "Timesheets", schema = "public", catalog = "ErpDB")
public class TimesheetsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id", nullable = false)
    private int id;
    @Basic
    @Column(name = "Date", nullable = false)
    private Timestamp date;
    @Basic
    @Column(name = "IsLocked", nullable = false)
    private boolean isLocked;
    @Basic
    @Column(name = "EmployeeId", nullable = true)
    private Integer employeeId;
    @Basic
    @Column(name = "ModifiedHours", nullable = true)
    private Integer modifiedHours;
    @ManyToOne
    @JoinColumn(name = "EmployeeId", referencedColumnName = "Id")
    private EmployeesEntity employeesByEmployeeId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getModifiedHours() {
        return modifiedHours;
    }

    public void setModifiedHours(Integer modifiedHours) {
        this.modifiedHours = modifiedHours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimesheetsEntity that = (TimesheetsEntity) o;
        return id == that.id && isLocked == that.isLocked && Objects.equals(date, that.date) && Objects.equals(employeeId, that.employeeId) && Objects.equals(modifiedHours, that.modifiedHours);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, isLocked, employeeId, modifiedHours);
    }

    public EmployeesEntity getEmployeesByEmployeeId() {
        return employeesByEmployeeId;
    }

    public void setEmployeesByEmployeeId(EmployeesEntity employeesByEmployeeId) {
        this.employeesByEmployeeId = employeesByEmployeeId;
    }
}
