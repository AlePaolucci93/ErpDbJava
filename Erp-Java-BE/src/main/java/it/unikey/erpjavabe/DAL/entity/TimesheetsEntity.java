package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "Timesheets", schema = "public", catalog = "ErpDB")
public class TimesheetsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private int id;
    @Basic
    @Column(name = "Date")
    private Timestamp date;
    @Basic
    @Column(name = "IsLocked")
    private boolean isLocked;
    @Basic
    @Column(name = "EmployeeId")
    private Integer employeeId;
    @Basic
    @Column(name = "ModifiedHours")
    private Integer modifiedHours;
    @OneToMany(mappedBy = "timesheetsByTimesheetId")
    private Collection<RecordsEntity> recordsById;
    @OneToMany(mappedBy = "timesheetsByTimesheetId")
    private Collection<TimesheetFileEntity> timesheetFilesById;
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

    public Collection<RecordsEntity> getRecordsById() {
        return recordsById;
    }

    public void setRecordsById(Collection<RecordsEntity> recordsById) {
        this.recordsById = recordsById;
    }

    public Collection<TimesheetFileEntity> getTimesheetFilesById() {
        return timesheetFilesById;
    }

    public void setTimesheetFilesById(Collection<TimesheetFileEntity> timesheetFilesById) {
        this.timesheetFilesById = timesheetFilesById;
    }

    public EmployeesEntity getEmployeesByEmployeeId() {
        return employeesByEmployeeId;
    }

    public void setEmployeesByEmployeeId(EmployeesEntity employeesByEmployeeId) {
        this.employeesByEmployeeId = employeesByEmployeeId;
    }
}
