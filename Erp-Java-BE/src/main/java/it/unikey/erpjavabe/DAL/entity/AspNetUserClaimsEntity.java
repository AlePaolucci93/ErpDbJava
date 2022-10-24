package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "AspNetUserClaims", schema = "public", catalog = "ErpDB")
public class AspNetUserClaimsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private int id;
    @Basic
    @Column(name = "UserId")
    private int userId;
    @Basic
    @Column(name = "ClaimType")
    private String claimType;
    @Basic
    @Column(name = "ClaimValue")
    private String claimValue;
    @ManyToOne
    @JoinColumn(name = "UserId", referencedColumnName = "Id", nullable = false)
    private AspNetUsersEntity aspNetUsersByUserId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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
        AspNetUserClaimsEntity that = (AspNetUserClaimsEntity) o;
        return id == that.id && userId == that.userId && Objects.equals(claimType, that.claimType) && Objects.equals(claimValue, that.claimValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, claimType, claimValue);
    }

    public AspNetUsersEntity getAspNetUsersByUserId() {
        return aspNetUsersByUserId;
    }

    public void setAspNetUsersByUserId(AspNetUsersEntity aspNetUsersByUserId) {
        this.aspNetUsersByUserId = aspNetUsersByUserId;
    }
}
