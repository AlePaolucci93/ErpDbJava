package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Teaches", schema = "public", catalog = "ErpDB")
public class TeachesEntity {
    private int id;
    private int teacherId;
    private int moduleId;
    private TeachersEntity teachersByTeacherId;
    private ModulesEntity modulesByModuleId;

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
    @Column(name = "TeacherId", nullable = false)
    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Basic
    @Column(name = "ModuleId", nullable = false)
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

    @ManyToOne
    @JoinColumn(name = "TeacherId", referencedColumnName = "Id", nullable = false)
    public TeachersEntity getTeachersByTeacherId() {
        return teachersByTeacherId;
    }

    public void setTeachersByTeacherId(TeachersEntity teachersByTeacherId) {
        this.teachersByTeacherId = teachersByTeacherId;
    }

    @ManyToOne
    @JoinColumn(name = "ModuleId", referencedColumnName = "Id", nullable = false)
    public ModulesEntity getModulesByModuleId() {
        return modulesByModuleId;
    }

    public void setModulesByModuleId(ModulesEntity modulesByModuleId) {
        this.modulesByModuleId = modulesByModuleId;
    }
}
