package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "AspNetRoles", schema = "public", catalog = "ErpDB")
public class AspNetRolesEntity {
    private int id;
    private String name;
    private String normalizedName;
    private String concurrencyStamp;
    private Collection<AspNetRoleClaimsEntity> aspNetRoleClaimsById;
    private Collection<AspNetUserRolesEntity> aspNetUserRolesById;

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
    @Column(name = "Name", nullable = true, length = 256)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "NormalizedName", nullable = true, length = 256)
    public String getNormalizedName() {
        return normalizedName;
    }

    public void setNormalizedName(String normalizedName) {
        this.normalizedName = normalizedName;
    }

    @Basic
    @Column(name = "ConcurrencyStamp", nullable = true, length = -1)
    public String getConcurrencyStamp() {
        return concurrencyStamp;
    }

    public void setConcurrencyStamp(String concurrencyStamp) {
        this.concurrencyStamp = concurrencyStamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AspNetRolesEntity that = (AspNetRolesEntity) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(normalizedName, that.normalizedName) && Objects.equals(concurrencyStamp, that.concurrencyStamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, normalizedName, concurrencyStamp);
    }

    @OneToMany(mappedBy = "aspNetRolesByRoleId")
    public Collection<AspNetRoleClaimsEntity> getAspNetRoleClaimsById() {
        return aspNetRoleClaimsById;
    }

    public void setAspNetRoleClaimsById(Collection<AspNetRoleClaimsEntity> aspNetRoleClaimsById) {
        this.aspNetRoleClaimsById = aspNetRoleClaimsById;
    }

    @OneToMany(mappedBy = "aspNetRolesByRoleId")
    public Collection<AspNetUserRolesEntity> getAspNetUserRolesById() {
        return aspNetUserRolesById;
    }

    public void setAspNetUserRolesById(Collection<AspNetUserRolesEntity> aspNetUserRolesById) {
        this.aspNetUserRolesById = aspNetUserRolesById;
    }
}
