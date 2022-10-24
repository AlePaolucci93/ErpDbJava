package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class AspNetUserLoginsEntityPK implements Serializable {
    @Column(name = "LoginProvider")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String loginProvider;
    @Column(name = "ProviderKey")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String providerKey;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AspNetUserLoginsEntityPK that = (AspNetUserLoginsEntityPK) o;
        return Objects.equals(loginProvider, that.loginProvider) && Objects.equals(providerKey, that.providerKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loginProvider, providerKey);
    }
}
