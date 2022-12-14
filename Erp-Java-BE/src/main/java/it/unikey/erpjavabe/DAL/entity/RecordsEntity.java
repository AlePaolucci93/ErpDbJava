package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "Records", schema = "public", catalog = "ErpDB")
public class RecordsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private int id;
    @Basic
    @Column(name = "DateTime")
    private Timestamp dateTime;
    @Basic
    @Column(name = "WorkedHours")
    private double workedHours;
    @Basic
    @Column(name = "RecordType")
    private short recordType;
    @Basic
    @Column(name = "ProjectId")
    private Integer projectId;
    @Basic
    @Column(name = "TimesheetId")
    private int timesheetId;
    @ManyToOne
    @JoinColumn(name = "ProjectId", referencedColumnName = "Id")
    private ProjectsEntity projectsByProjectId;
    @ManyToOne
    @JoinColumn(name = "TimesheetId", referencedColumnName = "Id", nullable = false)
    private TimesheetsEntity timesheetsByTimesheetId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getDateTime() {
        return dateTime;
    }

    public void setDateTime(Timestamp dateTime) {
        this.dateTime = dateTime;
    }

    public double getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(double workedHours) {
        this.workedHours = workedHours;
    }

    public short getRecordType() {
        return recordType;
    }

    public void setRecordType(short recordType) {
        this.recordType = recordType;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

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

    public ProjectsEntity getProjectsByProjectId() {
        return projectsByProjectId;
    }

    public void setProjectsByProjectId(ProjectsEntity projectsByProjectId) {
        this.projectsByProjectId = projectsByProjectId;
    }

    public TimesheetsEntity getTimesheetsByTimesheetId() {
        return timesheetsByTimesheetId;
    }

    public void setTimesheetsByTimesheetId(TimesheetsEntity timesheetsByTimesheetId) {
        this.timesheetsByTimesheetId = timesheetsByTimesheetId;
    }
}
