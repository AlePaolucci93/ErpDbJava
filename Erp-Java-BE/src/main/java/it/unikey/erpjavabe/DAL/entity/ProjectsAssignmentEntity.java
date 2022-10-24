package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ProjectsAssignment", schema = "public", catalog = "ErpDB")
public class ProjectsAssignmentEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private int id;
    @Basic
    @Column(name = "EmployeeId")
    private int employeeId;
    @Basic
    @Column(name = "ProjectId")
    private int projectId;
    @Basic
    @Column(name = "AssignmentDate")
    private Timestamp assignmentDate;
    @Basic
    @Column(name = "AssignmentEnded")
    private Timestamp assignmentEnded;
    @Basic
    @Column(name = "IsDeleted")
    private boolean isDeleted;
    @Basic
    @Column(name = "ResourceCost")
    private double resourceCost;
    @Basic
    @Column(name = "SalesRate")
    private double salesRate;
    @ManyToOne
    @JoinColumn(name = "EmployeeId", referencedColumnName = "Id", nullable = false)
    private EmployeesEntity employeesByEmployeeId;
    @ManyToOne
    @JoinColumn(name = "ProjectId", referencedColumnName = "Id", nullable = false)
    private ProjectsEntity projectsByProjectId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public Timestamp getAssignmentDate() {
        return assignmentDate;
    }

    public void setAssignmentDate(Timestamp assignmentDate) {
        this.assignmentDate = assignmentDate;
    }

    public Timestamp getAssignmentEnded() {
        return assignmentEnded;
    }

    public void setAssignmentEnded(Timestamp assignmentEnded) {
        this.assignmentEnded = assignmentEnded;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public double getResourceCost() {
        return resourceCost;
    }

    public void setResourceCost(double resourceCost) {
        this.resourceCost = resourceCost;
    }

    public double getSalesRate() {
        return salesRate;
    }

    public void setSalesRate(double salesRate) {
        this.salesRate = salesRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProjectsAssignmentEntity that = (ProjectsAssignmentEntity) o;
        return id == that.id && employeeId == that.employeeId && projectId == that.projectId && isDeleted == that.isDeleted && Double.compare(that.resourceCost, resourceCost) == 0 && Double.compare(that.salesRate, salesRate) == 0 && Objects.equals(assignmentDate, that.assignmentDate) && Objects.equals(assignmentEnded, that.assignmentEnded);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, employeeId, projectId, assignmentDate, assignmentEnded, isDeleted, resourceCost, salesRate);
    }

    public EmployeesEntity getEmployeesByEmployeeId() {
        return employeesByEmployeeId;
    }

    public void setEmployeesByEmployeeId(EmployeesEntity employeesByEmployeeId) {
        this.employeesByEmployeeId = employeesByEmployeeId;
    }

    public ProjectsEntity getProjectsByProjectId() {
        return projectsByProjectId;
    }

    public void setProjectsByProjectId(ProjectsEntity projectsByProjectId) {
        this.projectsByProjectId = projectsByProjectId;
    }
}
