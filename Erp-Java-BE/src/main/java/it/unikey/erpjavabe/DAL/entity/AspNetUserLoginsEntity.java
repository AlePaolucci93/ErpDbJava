package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "AspNetUserLogins", schema = "public", catalog = "ErpDB")
@IdClass(AspNetUserLoginsEntityPK.class)
public class AspNetUserLoginsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "LoginProvider")
    private String loginProvider;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ProviderKey")
    private String providerKey;
    @Basic
    @Column(name = "ProviderDisplayName")
    private String providerDisplayName;
    @Basic
    @Column(name = "UserId")
    private int userId;
    @ManyToOne
    @JoinColumn(name = "UserId", referencedColumnName = "Id", nullable = false)
    private AspNetUsersEntity aspNetUsersByUserId;

    public String getLoginProvider() {
        return loginProvider;
    }

    public void setLoginProvider(String loginProvider) {
        this.loginProvider = loginProvider;
    }

    public String getProviderKey() {
        return providerKey;
    }

    public void setProviderKey(String providerKey) {
        this.providerKey = providerKey;
    }

    public String getProviderDisplayName() {
        return providerDisplayName;
    }

    public void setProviderDisplayName(String providerDisplayName) {
        this.providerDisplayName = providerDisplayName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AspNetUserLoginsEntity that = (AspNetUserLoginsEntity) o;
        return userId == that.userId && Objects.equals(loginProvider, that.loginProvider) && Objects.equals(providerKey, that.providerKey) && Objects.equals(providerDisplayName, that.providerDisplayName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loginProvider, providerKey, providerDisplayName, userId);
    }

    public AspNetUsersEntity getAspNetUsersByUserId() {
        return aspNetUsersByUserId;
    }

    public void setAspNetUsersByUserId(AspNetUsersEntity aspNetUsersByUserId) {
        this.aspNetUsersByUserId = aspNetUsersByUserId;
    }
}
