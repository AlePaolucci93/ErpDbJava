package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "TimesheetFile", schema = "public", catalog = "ErpDB")
public class TimesheetFileEntity {
    private int id;
    private String fileName;
    private String pathUri;
    private int timesheetId;
    private String originalFileName;
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
    @Column(name = "FileName", nullable = true, length = -1)
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Basic
    @Column(name = "PathUri", nullable = true, length = -1)
    public String getPathUri() {
        return pathUri;
    }

    public void setPathUri(String pathUri) {
        this.pathUri = pathUri;
    }

    @Basic
    @Column(name = "TimesheetId", nullable = false)
    public int getTimesheetId() {
        return timesheetId;
    }

    public void setTimesheetId(int timesheetId) {
        this.timesheetId = timesheetId;
    }

    @Basic
    @Column(name = "OriginalFileName", nullable = true, length = -1)
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

    @ManyToOne
    @JoinColumn(name = "TimesheetId", referencedColumnName = "Id", nullable = false)
    public TimesheetsEntity getTimesheetsByTimesheetId() {
        return timesheetsByTimesheetId;
    }

    public void setTimesheetsByTimesheetId(TimesheetsEntity timesheetsByTimesheetId) {
        this.timesheetsByTimesheetId = timesheetsByTimesheetId;
    }
}
