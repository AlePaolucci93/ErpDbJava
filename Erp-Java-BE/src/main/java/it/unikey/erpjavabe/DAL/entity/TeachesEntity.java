package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Teaches", schema = "public", catalog = "ErpDB")
public class TeachesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private int id;
    @Basic
    @Column(name = "TeacherId")
    private int teacherId;
    @Basic
    @Column(name = "ModuleId")
    private int moduleId;
    @ManyToOne
    @JoinColumn(name = "TeacherId", referencedColumnName = "Id", nullable = false)
    private TeachersEntity teachersByTeacherId;
    @ManyToOne
    @JoinColumn(name = "ModuleId", referencedColumnName = "Id", nullable = false)
    private ModulesEntity modulesByModuleId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public int getModuleId() {
        return moduleId;
    }

    public void setModuleId(int moduleId) {
        this.moduleId = moduleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeachesEntity that = (TeachesEntity) o;
        return id == that.id && teacherId == that.teacherId && moduleId == that.moduleId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, teacherId, moduleId);
    }

    public TeachersEntity getTeachersByTeacherId() {
        return teachersByTeacherId;
    }

    public void setTeachersByTeacherId(TeachersEntity teachersByTeacherId) {
        this.teachersByTeacherId = teachersByTeacherId;
    }

    public ModulesEntity getModulesByModuleId() {
        return modulesByModuleId;
    }

    public void setModulesByModuleId(ModulesEntity modulesByModuleId) {
        this.modulesByModuleId = modulesByModuleId;
    }
}
