package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class AspNetUserTokensEntityPK implements Serializable {
    private int userId;
    private String loginProvider;
    private String name;

    @Column(name = "UserId", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Column(name = "LoginProvider", nullable = false, length = -1)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String getLoginProvider() {
        return loginProvider;
    }

    public void setLoginProvider(String loginProvider) {
        this.loginProvider = loginProvider;
    }

    @Column(name = "Name", nullable = false, length = -1)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
