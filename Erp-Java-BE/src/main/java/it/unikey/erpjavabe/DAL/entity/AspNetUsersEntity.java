package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "AspNetUsers", schema = "public", catalog = "ErpDB")
public class AspNetUsersEntity {
    private int id;
    private String name;
    private String lastname;
    private int accountType;
    private Integer userImageId;
    private boolean isDeleted;
    private Timestamp lastLoginDate;
    private String userName;
    private String normalizedUserName;
    private String email;
    private String normalizedEmail;
    private boolean emailConfirmed;
    private String passwordHash;
    private String securityStamp;
    private String concurrencyStamp;
    private String phoneNumber;
    private boolean phoneNumberConfirmed;
    private boolean twoFactorEnabled;
    private Object lockoutEnd;
    private boolean lockoutEnabled;
    private int accessFailedCount;
    private AdministratorsEntity administratorsById;
    private Collection<AspNetUserClaimsEntity> aspNetUserClaimsById;
    private Collection<AspNetUserLoginsEntity> aspNetUserLoginsById;
    private Collection<AspNetUserRolesEntity> aspNetUserRolesById;
    private Collection<AspNetUserTokensEntity> aspNetUserTokensById;
    private ImagesEntity imagesByUserImageId;
    private EmployeesEntity employeesById;
    private ManagersEntity managersById;

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
    @Column(name = "Name", nullable = true, length = -1)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "Lastname", nullable = true, length = -1)
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Basic
    @Column(name = "AccountType", nullable = false)
    public int getAccountType() {
        return accountType;
    }

    public void setAccountType(int accountType) {
        this.accountType = accountType;
    }

    @Basic
    @Column(name = "UserImageId", nullable = true)
    public Integer getUserImageId() {
        return userImageId;
    }

    public void setUserImageId(Integer userImageId) {
        this.userImageId = userImageId;
    }

    @Basic
    @Column(name = "IsDeleted", nullable = false)
    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    @Basic
    @Column(name = "LastLoginDate", nullable = false)
    public Timestamp getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Timestamp lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    @Basic
    @Column(name = "UserName", nullable = true, length = 256)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "NormalizedUserName", nullable = true, length = 256)
    public String getNormalizedUserName() {
        return normalizedUserName;
    }

    public void setNormalizedUserName(String normalizedUserName) {
        this.normalizedUserName = normalizedUserName;
    }

    @Basic
    @Column(name = "Email", nullable = true, length = 256)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "NormalizedEmail", nullable = true, length = 256)
    public String getNormalizedEmail() {
        return normalizedEmail;
    }

    public void setNormalizedEmail(String normalizedEmail) {
        this.normalizedEmail = normalizedEmail;
    }

    @Basic
    @Column(name = "EmailConfirmed", nullable = false)
    public boolean isEmailConfirmed() {
        return emailConfirmed;
    }

    public void setEmailConfirmed(boolean emailConfirmed) {
        this.emailConfirmed = emailConfirmed;
    }

    @Basic
    @Column(name = "PasswordHash", nullable = true, length = -1)
    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    @Basic
    @Column(name = "SecurityStamp", nullable = true, length = -1)
    public String getSecurityStamp() {
        return securityStamp;
    }

    public void setSecurityStamp(String securityStamp) {
        this.securityStamp = securityStamp;
    }

    @Basic
    @Column(name = "ConcurrencyStamp", nullable = true, length = -1)
    public String getConcurrencyStamp() {
        return concurrencyStamp;
    }

    public void setConcurrencyStamp(String concurrencyStamp) {
        this.concurrencyStamp = concurrencyStamp;
    }

    @Basic
    @Column(name = "PhoneNumber", nullable = true, length = -1)
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Basic
    @Column(name = "PhoneNumberConfirmed", nullable = false)
    public boolean isPhoneNumberConfirmed() {
        return phoneNumberConfirmed;
    }

    public void setPhoneNumberConfirmed(boolean phoneNumberConfirmed) {
        this.phoneNumberConfirmed = phoneNumberConfirmed;
    }

    @Basic
    @Column(name = "TwoFactorEnabled", nullable = false)
    public boolean isTwoFactorEnabled() {
        return twoFactorEnabled;
    }

    public void setTwoFactorEnabled(boolean twoFactorEnabled) {
        this.twoFactorEnabled = twoFactorEnabled;
    }

    @Basic
    @Column(name = "LockoutEnd", nullable = true)
    public Object getLockoutEnd() {
        return lockoutEnd;
    }

    public void setLockoutEnd(Object lockoutEnd) {
        this.lockoutEnd = lockoutEnd;
    }

    @Basic
    @Column(name = "LockoutEnabled", nullable = false)
    public boolean isLockoutEnabled() {
        return lockoutEnabled;
    }

    public void setLockoutEnabled(boolean lockoutEnabled) {
        this.lockoutEnabled = lockoutEnabled;
    }

    @Basic
    @Column(name = "AccessFailedCount", nullable = false)
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

    @OneToOne(mappedBy = "aspNetUsersById")
    public AdministratorsEntity getAdministratorsById() {
        return administratorsById;
    }

    public void setAdministratorsById(AdministratorsEntity administratorsById) {
        this.administratorsById = administratorsById;
    }

    @OneToMany(mappedBy = "aspNetUsersByUserId")
    public Collection<AspNetUserClaimsEntity> getAspNetUserClaimsById() {
        return aspNetUserClaimsById;
    }

    public void setAspNetUserClaimsById(Collection<AspNetUserClaimsEntity> aspNetUserClaimsById) {
        this.aspNetUserClaimsById = aspNetUserClaimsById;
    }

    @OneToMany(mappedBy = "aspNetUsersByUserId")
    public Collection<AspNetUserLoginsEntity> getAspNetUserLoginsById() {
        return aspNetUserLoginsById;
    }

    public void setAspNetUserLoginsById(Collection<AspNetUserLoginsEntity> aspNetUserLoginsById) {
        this.aspNetUserLoginsById = aspNetUserLoginsById;
    }

    @OneToMany(mappedBy = "aspNetUsersByUserId")
    public Collection<AspNetUserRolesEntity> getAspNetUserRolesById() {
        return aspNetUserRolesById;
    }

    public void setAspNetUserRolesById(Collection<AspNetUserRolesEntity> aspNetUserRolesById) {
        this.aspNetUserRolesById = aspNetUserRolesById;
    }

    @OneToMany(mappedBy = "aspNetUsersByUserId")
    public Collection<AspNetUserTokensEntity> getAspNetUserTokensById() {
        return aspNetUserTokensById;
    }

    public void setAspNetUserTokensById(Collection<AspNetUserTokensEntity> aspNetUserTokensById) {
        this.aspNetUserTokensById = aspNetUserTokensById;
    }

    @ManyToOne
    @JoinColumn(name = "UserImageId", referencedColumnName = "Id")
    public ImagesEntity getImagesByUserImageId() {
        return imagesByUserImageId;
    }

    public void setImagesByUserImageId(ImagesEntity imagesByUserImageId) {
        this.imagesByUserImageId = imagesByUserImageId;
    }

    @OneToOne(mappedBy = "aspNetUsersById")
    public EmployeesEntity getEmployeesById() {
        return employeesById;
    }

    public void setEmployeesById(EmployeesEntity employeesById) {
        this.employeesById = employeesById;
    }

    @OneToOne(mappedBy = "aspNetUsersById")
    public ManagersEntity getManagersById() {
        return managersById;
    }

    public void setManagersById(ManagersEntity managersById) {
        this.managersById = managersById;
    }
}
