package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class AspNetUserTokensEntityPK implements Serializable {
    @Column(name = "UserId")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    @Column(name = "LoginProvider")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String loginProvider;
    @Column(name = "Name")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AspNetUserTokensEntityPK that = (AspNetUserTokensEntityPK) o;
        return userId == that.userId && Objects.equals(loginProvider, that.loginProvider) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, loginProvider, name);
    }
}
