package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "AspNetRoles", schema = "public", catalog = "ErpDB")
public class AspNetRolesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private int id;
    @Basic
    @Column(name = "Name")
    private String name;
    @Basic
    @Column(name = "NormalizedName")
    private String normalizedName;
    @Basic
    @Column(name = "ConcurrencyStamp")
    private String concurrencyStamp;
    @OneToMany(mappedBy = "aspNetRolesByRoleId")
    private Collection<AspNetRoleClaimsEntity> aspNetRoleClaimsById;
    @OneToMany(mappedBy = "aspNetRolesByRoleId")
    private Collection<AspNetUserRolesEntity> aspNetUserRolesById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNormalizedName() {
        return normalizedName;
    }

    public void setNormalizedName(String normalizedName) {
        this.normalizedName = normalizedName;
    }

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

    public Collection<AspNetRoleClaimsEntity> getAspNetRoleClaimsById() {
        return aspNetRoleClaimsById;
    }

    public void setAspNetRoleClaimsById(Collection<AspNetRoleClaimsEntity> aspNetRoleClaimsById) {
        this.aspNetRoleClaimsById = aspNetRoleClaimsById;
    }

    public Collection<AspNetUserRolesEntity> getAspNetUserRolesById() {
        return aspNetUserRolesById;
    }

    public void setAspNetUserRolesById(Collection<AspNetUserRolesEntity> aspNetUserRolesById) {
        this.aspNetUserRolesById = aspNetUserRolesById;
    }
}
