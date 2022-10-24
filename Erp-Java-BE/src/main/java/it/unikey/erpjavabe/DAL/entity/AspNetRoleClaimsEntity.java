package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "AspNetRoleClaims", schema = "public", catalog = "ErpDB")
public class AspNetRoleClaimsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private int id;
    @Basic
    @Column(name = "RoleId")
    private int roleId;
    @Basic
    @Column(name = "ClaimType")
    private String claimType;
    @Basic
    @Column(name = "ClaimValue")
    private String claimValue;
    @ManyToOne
    @JoinColumn(name = "RoleId", referencedColumnName = "Id", nullable = false)
    private AspNetRolesEntity aspNetRolesByRoleId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getClaimType() {
        return claimType;
    }

    public void setClaimType(String claimType) {
        this.claimType = claimType;
    }

    public String getClaimValue() {
        return claimValue;
    }

    public void setClaimValue(String claimValue) {
        this.claimValue = claimValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AspNetRoleClaimsEntity that = (AspNetRoleClaimsEntity) o;
        return id == that.id && roleId == that.roleId && Objects.equals(claimType, that.claimType) && Objects.equals(claimValue, that.claimValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, roleId, claimType, claimValue);
    }

    public AspNetRolesEntity getAspNetRolesByRoleId() {
        return aspNetRolesByRoleId;
    }

    public void setAspNetRolesByRoleId(AspNetRolesEntity aspNetRolesByRoleId) {
        this.aspNetRolesByRoleId = aspNetRolesByRoleId;
    }
}
