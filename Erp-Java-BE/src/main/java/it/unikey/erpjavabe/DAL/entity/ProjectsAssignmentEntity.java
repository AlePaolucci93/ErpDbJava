package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ProjectsAssignment", schema = "public", catalog = "ErpDB")
public class ProjectsAssignmentEntity {
    private int id;
    private int employeeId;
    private int projectId;
    private Timestamp assignmentDate;
    private Timestamp assignmentEnded;
    private boolean isDeleted;
    private double resourceCost;
    private double salesRate;
    private EmployeesEntity employeesByEmployeeId;
    private ProjectsEntity projectsByProjectId;

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
    @Column(name = "EmployeeId", nullable = false)
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Basic
    @Column(name = "ProjectId", nullable = false)
    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    @Basic
    @Column(name = "AssignmentDate", nullable = false)
    public Timestamp getAssignmentDate() {
        return assignmentDate;
    }

    public void setAssignmentDate(Timestamp assignmentDate) {
        this.assignmentDate = assignmentDate;
    }

    @Basic
    @Column(name = "AssignmentEnded", nullable = true)
    public Timestamp getAssignmentEnded() {
        return assignmentEnded;
    }

    public void setAssignmentEnded(Timestamp assignmentEnded) {
        this.assignmentEnded = assignmentEnded;
    }

    @Basic
    @Column(name = "IsDeleted", nullable = false)
    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    @Basic
    @Column(name = "ResourceCost", nullable = false, precision = 0)
    public double getResourceCost() {
        return resourceCost;
    }

    public void setResourceCost(double resourceCost) {
        this.resourceCost = resourceCost;
    }

    @Basic
    @Column(name = "SalesRate", nullable = false, precision = 0)
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

    @ManyToOne
    @JoinColumn(name = "EmployeeId", referencedColumnName = "Id", nullable = false)
    public EmployeesEntity getEmployeesByEmployeeId() {
        return employeesByEmployeeId;
    }

    public void setEmployeesByEmployeeId(EmployeesEntity employeesByEmployeeId) {
        this.employeesByEmployeeId = employeesByEmployeeId;
    }

    @ManyToOne
    @JoinColumn(name = "ProjectId", referencedColumnName = "Id", nullable = false)
    public ProjectsEntity getProjectsByProjectId() {
        return projectsByProjectId;
    }

    public void setProjectsByProjectId(ProjectsEntity projectsByProjectId) {
        this.projectsByProjectId = projectsByProjectId;
    }
}
