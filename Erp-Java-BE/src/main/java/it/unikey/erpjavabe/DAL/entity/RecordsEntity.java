package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "Records", schema = "public", catalog = "ErpDB")
public class RecordsEntity {
    private int id;
    private Timestamp dateTime;
    private double workedHours;
    private short recordType;
    private Integer projectId;
    private int timesheetId;
    private ProjectsEntity projectsByProjectId;
    private TimesheetsEntity timesheetsByTimesheetId;

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
    @Column(name = "DateTime", nullable = false)
    public Timestamp getDateTime() {
        return dateTime;
    }

    public void setDateTime(Timestamp dateTime) {
        this.dateTime = dateTime;
    }

    @Basic
    @Column(name = "WorkedHours", nullable = false, precision = 0)
    public double getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(double workedHours) {
        this.workedHours = workedHours;
    }

    @Basic
    @Column(name = "RecordType", nullable = false)
    public short getRecordType() {
        return recordType;
    }

    public void setRecordType(short recordType) {
        this.recordType = recordType;
    }

    @Basic
    @Column(name = "ProjectId", nullable = true)
    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    @Basic
    @Column(name = "TimesheetId", nullable = false)
    public int getTimesheetId() {
        return timesheetId;
    }

    public void setTimesheetId(int timesheetId) {
        this.timesheetId = timesheetId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecordsEntity that = (RecordsEntity) o;
        return id == that.id && Double.compare(that.workedHours, workedHours) == 0 && recordType == that.recordType && timesheetId == that.timesheetId && Objects.equals(dateTime, that.dateTime) && Objects.equals(projectId, that.projectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateTime, workedHours, recordType, projectId, timesheetId);
    }

    @ManyToOne
    @JoinColumn(name = "ProjectId", referencedColumnName = "Id")
    public ProjectsEntity getProjectsByProjectId() {
        return projectsByProjectId;
    }

    public void setProjectsByProjectId(ProjectsEntity projectsByProjectId) {
        this.projectsByProjectId = projectsByProjectId;
    }

    @ManyToOne
    @JoinColumn(name = "TimesheetId", referencedColumnName = "Id", nullable = false)
    public TimesheetsEntity getTimesheetsByTimesheetId() {
        return timesheetsByTimesheetId;
    }

    public void setTimesheetsByTimesheetId(TimesheetsEntity timesheetsByTimesheetId) {
        this.timesheetsByTimesheetId = timesheetsByTimesheetId;
    }
}
