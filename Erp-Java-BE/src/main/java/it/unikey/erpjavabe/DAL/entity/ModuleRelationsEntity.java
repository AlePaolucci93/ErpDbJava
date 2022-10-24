package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ModuleRelations", schema = "public", catalog = "ErpDB")
public class ModuleRelationsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private int id;
    @Basic
    @Column(name = "CurrentModuleId")
    private int currentModuleId;
    @Basic
    @Column(name = "ParentModuleId")
    private Integer parentModuleId;
    @ManyToOne
    @JoinColumn(name = "CurrentModuleId", referencedColumnName = "Id", nullable = false)
    private ModulesEntity modulesByCurrentModuleId;
    @ManyToOne
    @JoinColumn(name = "ParentModuleId", referencedColumnName = "Id")
    private ModulesEntity modulesByParentModuleId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCurrentModuleId() {
        return currentModuleId;
    }

    public void setCurrentModuleId(int currentModuleId) {
        this.currentModuleId = currentModuleId;
    }

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

    public ModulesEntity getModulesByCurrentModuleId() {
        return modulesByCurrentModuleId;
    }

    public void setModulesByCurrentModuleId(ModulesEntity modulesByCurrentModuleId) {
        this.modulesByCurrentModuleId = modulesByCurrentModuleId;
    }

    public ModulesEntity getModulesByParentModuleId() {
        return modulesByParentModuleId;
    }

    public void setModulesByParentModuleId(ModulesEntity modulesByParentModuleId) {
        this.modulesByParentModuleId = modulesByParentModuleId;
    }
}
