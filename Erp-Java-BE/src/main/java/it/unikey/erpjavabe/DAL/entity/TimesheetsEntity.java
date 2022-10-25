package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "Timesheets", schema = "public", catalog = "ErpDB")
public class TimesheetsEntity {
    private int id;
    private Timestamp date;
    private boolean isLocked;
    private Integer employeeId;
    private Integer modifiedHours;
    private Collection<RecordsEntity> recordsById;
    private Collection<TimesheetFileEntity> timesheetFilesById;
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
    @Column(name = "Date", nullable = false)
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Basic
    @Column(name = "IsLocked", nullable = false)
    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
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
    @Column(name = "ModifiedHours", nullable = true)
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

    @OneToMany(mappedBy = "timesheetsByTimesheetId")
    public Collection<RecordsEntity> getRecordsById() {
        return recordsById;
    }

    public void setRecordsById(Collection<RecordsEntity> recordsById) {
        this.recordsById = recordsById;
    }

    @OneToMany(mappedBy = "timesheetsByTimesheetId")
    public Collection<TimesheetFileEntity> getTimesheetFilesById() {
        return timesheetFilesById;
    }

    public void setTimesheetFilesById(Collection<TimesheetFileEntity> timesheetFilesById) {
        this.timesheetFilesById = timesheetFilesById;
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
