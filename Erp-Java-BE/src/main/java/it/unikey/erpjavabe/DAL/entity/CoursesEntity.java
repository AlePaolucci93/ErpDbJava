package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "Courses", schema = "public", catalog = "ErpDB")
public class CoursesEntity {
    private int id;
    private String name;
    private Timestamp startDate;
    private Timestamp endDate;
    private double averageLearnerRate;
    private int placement;
    private Collection<ModulesEntity> modulesById;

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
    @Column(name = "Name", nullable = false, length = -1)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "StartDate", nullable = false)
    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "EndDate", nullable = false)
    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    @Basic
    @Column(name = "AverageLearnerRate", nullable = false, precision = 0)
    public double getAverageLearnerRate() {
        return averageLearnerRate;
    }

    public void setAverageLearnerRate(double averageLearnerRate) {
        this.averageLearnerRate = averageLearnerRate;
    }

    @Basic
    @Column(name = "Placement", nullable = false)
    public int getPlacement() {
        return placement;
    }

    public void setPlacement(int placement) {
        this.placement = placement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoursesEntity that = (CoursesEntity) o;
        return id == that.id && Double.compare(that.averageLearnerRate, averageLearnerRate) == 0 && placement == that.placement && Objects.equals(name, that.name) && Objects.equals(startDate, that.startDate) && Objects.equals(endDate, that.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, startDate, endDate, averageLearnerRate, placement);
    }

    @OneToMany(mappedBy = "coursesByCourseDaoId")
    public Collection<ModulesEntity> getModulesById() {
        return modulesById;
    }

    public void setModulesById(Collection<ModulesEntity> modulesById) {
        this.modulesById = modulesById;
    }
}
