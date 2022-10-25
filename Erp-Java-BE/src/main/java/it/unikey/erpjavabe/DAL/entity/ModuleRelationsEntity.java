package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ModuleRelations", schema = "public", catalog = "ErpDB")
public class ModuleRelationsEntity {
    private int id;
    private int currentModuleId;
    private Integer parentModuleId;
    private ModulesEntity modulesByCurrentModuleId;
    private ModulesEntity modulesByParentModuleId;

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
    @Column(name = "CurrentModuleId", nullable = false)
    public int getCurrentModuleId() {
        return currentModuleId;
    }

    public void setCurrentModuleId(int currentModuleId) {
        this.currentModuleId = currentModuleId;
    }

    @Basic
    @Column(name = "ParentModuleId", nullable = true)
    public Integer getParentModuleId() {
        return parentModuleId;
    }

    public void setParentModuleId(Integer parentModuleId) {
        this.parentModuleId = parentModuleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ModuleRelationsEntity that = (ModuleRelationsEntity) o;
        return id == that.id && currentModuleId == that.currentModuleId && Objects.equals(parentModuleId, that.parentModuleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, currentModuleId, parentModuleId);
    }

    @ManyToOne
    @JoinColumn(name = "CurrentModuleId", referencedColumnName = "Id", nullable = false)
    public ModulesEntity getModulesByCurrentModuleId() {
        return modulesByCurrentModuleId;
    }

    public void setModulesByCurrentModuleId(ModulesEntity modulesByCurrentModuleId) {
        this.modulesByCurrentModuleId = modulesByCurrentModuleId;
    }

    @ManyToOne
    @JoinColumn(name = "ParentModuleId", referencedColumnName = "Id")
    public ModulesEntity getModulesByParentModuleId() {
        return modulesByParentModuleId;
    }

    public void setModulesByParentModuleId(ModulesEntity modulesByParentModuleId) {
        this.modulesByParentModuleId = modulesByParentModuleId;
    }
}
