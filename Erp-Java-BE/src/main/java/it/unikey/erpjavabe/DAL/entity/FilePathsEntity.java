package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "FilePaths", schema = "public", catalog = "ErpDB")
public class FilePathsEntity {
    private int id;
    private String path;
    private int employeeDaoId;
    private EmployeesEntity employeesByEmployeeDaoId;

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
    @Column(name = "Path", nullable = true, length = -1)
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Basic
    @Column(name = "EmployeeDAOId", nullable = false)
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

    @ManyToOne
    @JoinColumn(name = "EmployeeDAOId", referencedColumnName = "Id", nullable = false)
    public EmployeesEntity getEmployeesByEmployeeDaoId() {
        return employeesByEmployeeDaoId;
    }

    public void setEmployeesByEmployeeDaoId(EmployeesEntity employeesByEmployeeDaoId) {
        this.employeesByEmployeeDaoId = employeesByEmployeeDaoId;
    }
}
