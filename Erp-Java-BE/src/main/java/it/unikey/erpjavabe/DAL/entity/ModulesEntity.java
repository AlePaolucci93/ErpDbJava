package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "Modules", schema = "public", catalog = "ErpDB")
public class ModulesEntity {
    private int id;
    private Timestamp startDate;
    private Timestamp endDate;
    private int type;
    private Integer courseDaoId;
    private Collection<AttendsEntity> attendsById;
    private Collection<ModuleRelationsEntity> moduleRelationsById;
    private Collection<ModuleRelationsEntity> moduleRelationsById_0;
    private CoursesEntity coursesByCourseDaoId;
    private Collection<TeachesEntity> teachesById;

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
    @Column(name = "Type", nullable = false)
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Basic
    @Column(name = "CourseDAOId", nullable = true)
    public Integer getCourseDaoId() {
        return courseDaoId;
    }

    public void setCourseDaoId(Integer courseDaoId) {
        this.courseDaoId = courseDaoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ModulesEntity that = (ModulesEntity) o;
        return id == that.id && type == that.type && Objects.equals(startDate, that.startDate) && Objects.equals(endDate, that.endDate) && Objects.equals(courseDaoId, that.courseDaoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, startDate, endDate, type, courseDaoId);
    }

    @OneToMany(mappedBy = "modulesByModuleId")
    public Collection<AttendsEntity> getAttendsById() {
        return attendsById;
    }

    public void setAttendsById(Collection<AttendsEntity> attendsById) {
        this.attendsById = attendsById;
    }

    @OneToMany(mappedBy = "modulesByCurrentModuleId")
    public Collection<ModuleRelationsEntity> getModuleRelationsById() {
        return moduleRelationsById;
    }

    public void setModuleRelationsById(Collection<ModuleRelationsEntity> moduleRelationsById) {
        this.moduleRelationsById = moduleRelationsById;
    }

    @OneToMany(mappedBy = "modulesByParentModuleId")
    public Collection<ModuleRelationsEntity> getModuleRelationsById_0() {
        return moduleRelationsById_0;
    }

    public void setModuleRelationsById_0(Collection<ModuleRelationsEntity> moduleRelationsById_0) {
        this.moduleRelationsById_0 = moduleRelationsById_0;
    }

    @ManyToOne
    @JoinColumn(name = "CourseDAOId", referencedColumnName = "Id")
    public CoursesEntity getCoursesByCourseDaoId() {
        return coursesByCourseDaoId;
    }

    public void setCoursesByCourseDaoId(CoursesEntity coursesByCourseDaoId) {
        this.coursesByCourseDaoId = coursesByCourseDaoId;
    }

    @OneToMany(mappedBy = "modulesByModuleId")
    public Collection<TeachesEntity> getTeachesById() {
        return teachesById;
    }

    public void setTeachesById(Collection<TeachesEntity> teachesById) {
        this.teachesById = teachesById;
    }
}
