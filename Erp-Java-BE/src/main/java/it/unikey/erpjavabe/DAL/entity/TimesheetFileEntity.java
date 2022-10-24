package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "TimesheetFile", schema = "public", catalog = "ErpDB")
public class TimesheetFileEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private int id;
    @Basic
    @Column(name = "FileName")
    private String fileName;
    @Basic
    @Column(name = "PathUri")
    private String pathUri;
    @Basic
    @Column(name = "TimesheetId")
    private int timesheetId;
    @Basic
    @Column(name = "OriginalFileName")
    private String originalFileName;
    @ManyToOne
    @JoinColumn(name = "TimesheetId", referencedColumnName = "Id", nullable = false)
    private TimesheetsEntity timesheetsByTimesheetId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getPathUri() {
        return pathUri;
    }

    public void setPathUri(String pathUri) {
        this.pathUri = pathUri;
    }

    public int getTimesheetId() {
        return timesheetId;
    }

    public void setTimesheetId(int timesheetId) {
        this.timesheetId = timesheetId;
    }

    public String getOriginalFileName() {
        return originalFileName;
    }

    public void setOriginalFileName(String originalFileName) {
        this.originalFileName = originalFileName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimesheetFileEntity that = (TimesheetFileEntity) o;
        return id == that.id && timesheetId == that.timesheetId && Objects.equals(fileName, that.fileName) && Objects.equals(pathUri, that.pathUri) && Objects.equals(originalFileName, that.originalFileName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fileName, pathUri, timesheetId, originalFileName);
    }

    public TimesheetsEntity getTimesheetsByTimesheetId() {
        return timesheetsByTimesheetId;
    }

    public void setTimesheetsByTimesheetId(TimesheetsEntity timesheetsByTimesheetId) {
        this.timesheetsByTimesheetId = timesheetsByTimesheetId;
    }
}
