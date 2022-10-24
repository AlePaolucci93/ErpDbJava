package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "AspNetUserRoles", schema = "public", catalog = "ErpDB")
@IdClass(AspNetUserRolesEntityPK.class)
public class AspNetUserRolesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "UserId")
    private int userId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "RoleId")
    private int roleId;
    @ManyToOne
    @JoinColumn(name = "UserId", referencedColumnName = "Id", nullable = false)
    private AspNetUsersEntity aspNetUsersByUserId;
    @ManyToOne
    @JoinColumn(name = "RoleId", referencedColumnName = "Id", nullable = false)
    private AspNetRolesEntity aspNetRolesByRoleId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

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

    public AspNetUsersEntity getAspNetUsersByUserId() {
        return aspNetUsersByUserId;
    }

    public void setAspNetUsersByUserId(AspNetUsersEntity aspNetUsersByUserId) {
        this.aspNetUsersByUserId = aspNetUsersByUserId;
    }

    public AspNetRolesEntity getAspNetRolesByRoleId() {
        return aspNetRolesByRoleId;
    }

    public void setAspNetRolesByRoleId(AspNetRolesEntity aspNetRolesByRoleId) {
        this.aspNetRolesByRoleId = aspNetRolesByRoleId;
    }
}
