package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "AspNetRoleClaims", schema = "public", catalog = "ErpDB")
public class AspNetRoleClaimsEntity {
    private int id;
    private int roleId;
    private String claimType;
    private String claimValue;
    private AspNetRolesEntity aspNetRolesByRoleId;

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
    @Column(name = "RoleId", nullable = false)
    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "ClaimType", nullable = true, length = -1)
    public String getClaimType() {
        return claimType;
    }

    public void setClaimType(String claimType) {
        this.claimType = claimType;
    }

    @Basic
    @Column(name = "ClaimValue", nullable = true, length = -1)
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

    @ManyToOne
    @JoinColumn(name = "RoleId", referencedColumnName = "Id", nullable = false)
    public AspNetRolesEntity getAspNetRolesByRoleId() {
        return aspNetRolesByRoleId;
    }

    public void setAspNetRolesByRoleId(AspNetRolesEntity aspNetRolesByRoleId) {
        this.aspNetRolesByRoleId = aspNetRolesByRoleId;
    }
}
