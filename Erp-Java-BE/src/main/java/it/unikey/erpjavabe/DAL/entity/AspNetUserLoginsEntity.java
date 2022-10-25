package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "AspNetUserLogins", schema = "public", catalog = "ErpDB")
@IdClass(AspNetUserLoginsEntityPK.class)
public class AspNetUserLoginsEntity {
    private String loginProvider;
    private String providerKey;
    private String providerDisplayName;
    private int userId;
    private AspNetUsersEntity aspNetUsersByUserId;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "LoginProvider", nullable = false, length = -1)
    public String getLoginProvider() {
        return loginProvider;
    }

    public void setLoginProvider(String loginProvider) {
        this.loginProvider = loginProvider;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ProviderKey", nullable = false, length = -1)
    public String getProviderKey() {
        return providerKey;
    }

    public void setProviderKey(String providerKey) {
        this.providerKey = providerKey;
    }

    @Basic
    @Column(name = "ProviderDisplayName", nullable = true, length = -1)
    public String getProviderDisplayName() {
        return providerDisplayName;
    }

    public void setProviderDisplayName(String providerDisplayName) {
        this.providerDisplayName = providerDisplayName;
    }

    @Basic
    @Column(name = "UserId", nullable = false)
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

    @ManyToOne
    @JoinColumn(name = "UserId", referencedColumnName = "Id", nullable = false)
    public AspNetUsersEntity getAspNetUsersByUserId() {
        return aspNetUsersByUserId;
    }

    public void setAspNetUsersByUserId(AspNetUsersEntity aspNetUsersByUserId) {
        this.aspNetUsersByUserId = aspNetUsersByUserId;
    }
}
