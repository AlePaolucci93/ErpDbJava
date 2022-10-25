package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Attends", schema = "public", catalog = "ErpDB")
public class AttendsEntity {
    private int id;
    private int learnerId;
    private int moduleId;
    private LearnersEntity learnersByLearnerId;
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
    @Column(name = "LearnerId", nullable = false)
    public int getLearnerId() {
        return learnerId;
    }

    public void setLearnerId(int learnerId) {
        this.learnerId = learnerId;
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
        AttendsEntity that = (AttendsEntity) o;
        return id == that.id && learnerId == that.learnerId && moduleId == that.moduleId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, learnerId, moduleId);
    }

    @ManyToOne
    @JoinColumn(name = "LearnerId", referencedColumnName = "Id", nullable = false)
    public LearnersEntity getLearnersByLearnerId() {
        return learnersByLearnerId;
    }

    public void setLearnersByLearnerId(LearnersEntity learnersByLearnerId) {
        this.learnersByLearnerId = learnersByLearnerId;
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
