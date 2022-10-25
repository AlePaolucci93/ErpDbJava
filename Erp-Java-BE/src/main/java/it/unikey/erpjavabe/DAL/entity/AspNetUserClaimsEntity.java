package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "AspNetUserClaims", schema = "public", catalog = "ErpDB")
public class AspNetUserClaimsEntity {
    private int id;
    private int userId;
    private String claimType;
    private String claimValue;
    private AspNetUsersEntity aspNetUsersByUserId;

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
    @Column(name = "UserId", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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
        AspNetUserClaimsEntity that = (AspNetUserClaimsEntity) o;
        return id == that.id && userId == that.userId && Objects.equals(claimType, that.claimType) && Objects.equals(claimValue, that.claimValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, claimType, claimValue);
    }

    @ManyToOne
    @JoinColumn(name = "UserId", referencedColumnName = "Id", nullable = false)
    public AspNetUsersEntity getAspNetUsersByUserId() {
        return aspNetUsersByUserId;
    }

    public void setAspNetUsersByUserId(AspNetUsersEntity aspNetUsersByUserId) {
        this.aspNetUsersByUserId = aspNetUsersByUserId;
    }
}
