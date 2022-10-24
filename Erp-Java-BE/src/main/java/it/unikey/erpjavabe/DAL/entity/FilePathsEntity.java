package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "FilePaths", schema = "public", catalog = "ErpDB")
public class FilePathsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private int id;
    @Basic
    @Column(name = "Path")
    private String path;
    @Basic
    @Column(name = "EmployeeDAOId")
    private int employeeDaoId;
    @ManyToOne
    @JoinColumn(name = "EmployeeDAOId", referencedColumnName = "Id", nullable = false)
    private EmployeesEntity employeesByEmployeeDaoId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getEmployeeDaoId() {
        return employeeDaoId;
    }

    public void setEmployeeDaoId(int employeeDaoId) {
        this.employeeDaoId = employeeDaoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FilePathsEntity that = (FilePathsEntity) o;
        return id == that.id && employeeDaoId == that.employeeDaoId && Objects.equals(path, that.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, path, employeeDaoId);
    }

    public EmployeesEntity getEmployeesByEmployeeDaoId() {
        return employeesByEmployeeDaoId;
    }

    public void setEmployeesByEmployeeDaoId(EmployeesEntity employeesByEmployeeDaoId) {
        this.employeesByEmployeeDaoId = employeesByEmployeeDaoId;
    }
}
