package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "AspNetUserTokens", schema = "public", catalog = "ErpDB")
@IdClass(AspNetUserTokensEntityPK.class)
public class AspNetUserTokensEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "UserId")
    private int userId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "LoginProvider")
    private String loginProvider;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Name")
    private String name;
    @Basic
    @Column(name = "Value")
    private String value;
    @ManyToOne
    @JoinColumn(name = "UserId", referencedColumnName = "Id", nullable = false)
    private AspNetUsersEntity aspNetUsersByUserId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getLoginProvider() {
        return loginProvider;
    }

    public void setLoginProvider(String loginProvider) {
        this.loginProvider = loginProvider;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AspNetUserTokensEntity that = (AspNetUserTokensEntity) o;
        return userId == that.userId && Objects.equals(loginProvider, that.loginProvider) && Objects.equals(name, that.name) && Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, loginProvider, name, value);
    }

    public AspNetUsersEntity getAspNetUsersByUserId() {
        return aspNetUsersByUserId;
    }

    public void setAspNetUsersByUserId(AspNetUsersEntity aspNetUsersByUserId) {
        this.aspNetUsersByUserId = aspNetUsersByUserId;
    }
}
