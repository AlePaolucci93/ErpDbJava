package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "AspNetUserRoles", schema = "public", catalog = "ErpDB")
@IdClass(AspNetUserRolesEntityPK.class)
public class AspNetUserRolesEntity {
    private int userId;
    private int roleId;
    private AspNetUsersEntity aspNetUsersByUserId;
    private AspNetRolesEntity aspNetRolesByRoleId;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "UserId", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "RoleId", nullable = false)
    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AspNetUserRolesEntity that = (AspNetUserRolesEntity) o;
        return userId == that.userId && roleId == that.roleId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, roleId);
    }

    @ManyToOne
    @JoinColumn(name = "UserId", referencedColumnName = "Id", nullable = false)
    public AspNetUsersEntity getAspNetUsersByUserId() {
        return aspNetUsersByUserId;
    }

    public void setAspNetUsersByUserId(AspNetUsersEntity aspNetUsersByUserId) {
        this.aspNetUsersByUserId = aspNetUsersByUserId;
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
