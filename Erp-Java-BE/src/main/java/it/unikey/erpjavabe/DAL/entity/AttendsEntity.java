package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Attends", schema = "public", catalog = "ErpDB")
public class AttendsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private int id;
    @Basic
    @Column(name = "LearnerId")
    private int learnerId;
    @Basic
    @Column(name = "ModuleId")
    private int moduleId;
    @ManyToOne
    @JoinColumn(name = "LearnerId", referencedColumnName = "Id", nullable = false)
    private LearnersEntity learnersByLearnerId;
    @ManyToOne
    @JoinColumn(name = "ModuleId", referencedColumnName = "Id", nullable = false)
    private ModulesEntity modulesByModuleId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLearnerId() {
        return learnerId;
    }

    public void setLearnerId(int learnerId) {
        this.learnerId = learnerId;
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
        AttendsEntity that = (AttendsEntity) o;
        return id == that.id && learnerId == that.learnerId && moduleId == that.moduleId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, learnerId, moduleId);
    }

    public LearnersEntity getLearnersByLearnerId() {
        return learnersByLearnerId;
    }

    public void setLearnersByLearnerId(LearnersEntity learnersByLearnerId) {
        this.learnersByLearnerId = learnersByLearnerId;
    }

    public ModulesEntity getModulesByModuleId() {
        return modulesByModuleId;
    }

    public void setModulesByModuleId(ModulesEntity modulesByModuleId) {
        this.modulesByModuleId = modulesByModuleId;
    }
}
