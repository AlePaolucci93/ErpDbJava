package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "AspNetUsers", schema = "public", catalog = "ErpDB")
public class AspNetUsersEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id", nullable = false)
    private int id;
    @Basic
    @Column(name = "Name", nullable = true, length = -1)
    private String name;
    @Basic
    @Column(name = "Lastname", nullable = true, length = -1)
    private String lastname;
    @Basic
    @Column(name = "AccountType", nullable = false)
    private int accountType;
    @Basic
    @Column(name = "UserImageId", nullable = true)
    private Integer userImageId;
    @Basic
    @Column(name = "IsDeleted", nullable = false)
    private boolean isDeleted;
    @Basic
    @Column(name = "LastLoginDate", nullable = false)
    private Timestamp lastLoginDate;
    @Basic
    @Column(name = "UserName", nullable = true, length = 256)
    private String userName;
    @Basic
    @Column(name = "NormalizedUserName", nullable = true, length = 256)
    private String normalizedUserName;
    @Basic
    @Column(name = "Email", nullable = true, length = 256)
    private String email;
    @Basic
    @Column(name = "NormalizedEmail", nullable = true, length = 256)
    private String normalizedEmail;
    @Basic
    @Column(name = "EmailConfirmed", nullable = false)
    private boolean emailConfirmed;
    @Basic
    @Column(name = "PasswordHash", nullable = true, length = -1)
    private String passwordHash;
    @Basic
    @Column(name = "SecurityStamp", nullable = true, length = -1)
    private String securityStamp;
    @Basic
    @Column(name = "ConcurrencyStamp", nullable = true, length = -1)
    private String concurrencyStamp;
    @Basic
    @Column(name = "PhoneNumber", nullable = true, length = -1)
    private String phoneNumber;
    @Basic
    @Column(name = "PhoneNumberConfirmed", nullable = false)
    private boolean phoneNumberConfirmed;
    @Basic
    @Column(name = "TwoFactorEnabled", nullable = false)
    private boolean twoFactorEnabled;
    @Basic
    @Column(name = "LockoutEnd", nullable = true)
    private Object lockoutEnd;
    @Basic
    @Column(name = "LockoutEnabled", nullable = false)
    private boolean lockoutEnabled;
    @Basic
    @Column(name = "AccessFailedCount", nullable = false)
    private int accessFailedCount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAccountType() {
        return accountType;
    }

    public void setAccountType(int accountType) {
        this.accountType = accountType;
    }

    public Integer getUserImageId() {
        return userImageId;
    }

    public void setUserImageId(Integer userImageId) {
        this.userImageId = userImageId;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public Timestamp getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Timestamp lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNormalizedUserName() {
        return normalizedUserName;
    }

    public void setNormalizedUserName(String normalizedUserName) {
        this.normalizedUserName = normalizedUserName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNormalizedEmail() {
        return normalizedEmail;
    }

    public void setNormalizedEmail(String normalizedEmail) {
        this.normalizedEmail = normalizedEmail;
    }

    public boolean isEmailConfirmed() {
        return emailConfirmed;
    }

    public void setEmailConfirmed(boolean emailConfirmed) {
        this.emailConfirmed = emailConfirmed;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getSecurityStamp() {
        return securityStamp;
    }

    public void setSecurityStamp(String securityStamp) {
        this.securityStamp = securityStamp;
    }

    public String getConcurrencyStamp() {
        return concurrencyStamp;
    }

    public void setConcurrencyStamp(String concurrencyStamp) {
        this.concurrencyStamp = concurrencyStamp;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isPhoneNumberConfirmed() {
        return phoneNumberConfirmed;
    }

    public void setPhoneNumberConfirmed(boolean phoneNumberConfirmed) {
        this.phoneNumberConfirmed = phoneNumberConfirmed;
    }

    public boolean isTwoFactorEnabled() {
        return twoFactorEnabled;
    }

    public void setTwoFactorEnabled(boolean twoFactorEnabled) {
        this.twoFactorEnabled = twoFactorEnabled;
    }

    public Object getLockoutEnd() {
        return lockoutEnd;
    }

    public void setLockoutEnd(Object lockoutEnd) {
        this.lockoutEnd = lockoutEnd;
    }

    public boolean isLockoutEnabled() {
        return lockoutEnabled;
    }

    public void setLockoutEnabled(boolean lockoutEnabled) {
        this.lockoutEnabled = lockoutEnabled;
    }

    public int getAccessFailedCount() {
        return accessFailedCount;
    }

    public void setAccessFailedCount(int accessFailedCount) {
        this.accessFailedCount = accessFailedCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AspNetUsersEntity that = (AspNetUsersEntity) o;
        return id == that.id && accountType == that.accountType && isDeleted == that.isDeleted && emailConfirmed == that.emailConfirmed && phoneNumberConfirmed == that.phoneNumberConfirmed && twoFactorEnabled == that.twoFactorEnabled && lockoutEnabled == that.lockoutEnabled && accessFailedCount == that.accessFailedCount && Objects.equals(name, that.name) && Objects.equals(lastname, that.lastname) && Objects.equals(userImageId, that.userImageId) && Objects.equals(lastLoginDate, that.lastLoginDate) && Objects.equals(userName, that.userName) && Objects.equals(normalizedUserName, that.normalizedUserName) && Objects.equals(email, that.email) && Objects.equals(normalizedEmail, that.normalizedEmail) && Objects.equals(passwordHash, that.passwordHash) && Objects.equals(securityStamp, that.securityStamp) && Objects.equals(concurrencyStamp, that.concurrencyStamp) && Objects.equals(phoneNumber, that.phoneNumber) && Objects.equals(lockoutEnd, that.lockoutEnd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastname, accountType, userImageId, isDeleted, lastLoginDate, userName, normalizedUserName, email, normalizedEmail, emailConfirmed, passwordHash, securityStamp, concurrencyStamp, phoneNumber, phoneNumberConfirmed, twoFactorEnabled, lockoutEnd, lockoutEnabled, accessFailedCount);
    }
}
