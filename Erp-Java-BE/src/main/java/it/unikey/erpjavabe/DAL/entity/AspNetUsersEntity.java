package it.unikey.erpjavabe.DAL.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "AspNetUsers", schema = "public", catalog = "ErpDB")
public class AspNetUsersEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private int id;
    @Basic
    @Column(name = "Name")
    private String name;
    @Basic
    @Column(name = "Lastname")
    private String lastname;
    @Basic
    @Column(name = "AccountType")
    private int accountType;
    @Basic
    @Column(name = "UserImageId")
    private Integer userImageId;
    @Basic
    @Column(name = "IsDeleted")
    private boolean isDeleted;
    @Basic
    @Column(name = "LastLoginDate")
    private Timestamp lastLoginDate;
    @Basic
    @Column(name = "UserName")
    private String userName;
    @Basic
    @Column(name = "NormalizedUserName")
    private String normalizedUserName;
    @Basic
    @Column(name = "Email")
    private String email;
    @Basic
    @Column(name = "NormalizedEmail")
    private String normalizedEmail;
    @Basic
    @Column(name = "EmailConfirmed")
    private boolean emailConfirmed;
    @Basic
    @Column(name = "PasswordHash")
    private String passwordHash;
    @Basic
    @Column(name = "SecurityStamp")
    private String securityStamp;
    @Basic
    @Column(name = "ConcurrencyStamp")
    private String concurrencyStamp;
    @Basic
    @Column(name = "PhoneNumber")
    private String phoneNumber;
    @Basic
    @Column(name = "PhoneNumberConfirmed")
    private boolean phoneNumberConfirmed;
    @Basic
    @Column(name = "TwoFactorEnabled")
    private boolean twoFactorEnabled;
    @Basic
    @Column(name = "LockoutEnd")
    private Object lockoutEnd;
    @Basic
    @Column(name = "LockoutEnabled")
    private boolean lockoutEnabled;
    @Basic
    @Column(name = "AccessFailedCount")
    private int accessFailedCount;
    @OneToOne(mappedBy = "aspNetUsersById")
    private AdministratorsEntity administratorsById;
    @OneToMany(mappedBy = "aspNetUsersByUserId")
    private Collection<AspNetUserClaimsEntity> aspNetUserClaimsById;
    @OneToMany(mappedBy = "aspNetUsersByUserId")
    private Collection<AspNetUserLoginsEntity> aspNetUserLoginsById;
    @OneToMany(mappedBy = "aspNetUsersByUserId")
    private Collection<AspNetUserRolesEntity> aspNetUserRolesById;
    @OneToMany(mappedBy = "aspNetUsersByUserId")
    private Collection<AspNetUserTokensEntity> aspNetUserTokensById;
    @ManyToOne
    @JoinColumn(name = "UserImageId", referencedColumnName = "Id")
    private ImagesEntity imagesByUserImageId;
    @OneToOne(mappedBy = "aspNetUsersById")
    private EmployeesEntity employeesById;
    @OneToOne(mappedBy = "aspNetUsersById")
    private ManagersEntity managersById;

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

    public AdministratorsEntity getAdministratorsById() {
        return administratorsById;
    }

    public void setAdministratorsById(AdministratorsEntity administratorsById) {
        this.administratorsById = administratorsById;
    }

    public Collection<AspNetUserClaimsEntity> getAspNetUserClaimsById() {
        return aspNetUserClaimsById;
    }

    public void setAspNetUserClaimsById(Collection<AspNetUserClaimsEntity> aspNetUserClaimsById) {
        this.aspNetUserClaimsById = aspNetUserClaimsById;
    }

    public Collection<AspNetUserLoginsEntity> getAspNetUserLoginsById() {
        return aspNetUserLoginsById;
    }

    public void setAspNetUserLoginsById(Collection<AspNetUserLoginsEntity> aspNetUserLoginsById) {
        this.aspNetUserLoginsById = aspNetUserLoginsById;
    }

    public Collection<AspNetUserRolesEntity> getAspNetUserRolesById() {
        return aspNetUserRolesById;
    }

    public void setAspNetUserRolesById(Collection<AspNetUserRolesEntity> aspNetUserRolesById) {
        this.aspNetUserRolesById = aspNetUserRolesById;
    }

    public Collection<AspNetUserTokensEntity> getAspNetUserTokensById() {
        return aspNetUserTokensById;
    }

    public void setAspNetUserTokensById(Collection<AspNetUserTokensEntity> aspNetUserTokensById) {
        this.aspNetUserTokensById = aspNetUserTokensById;
    }

    public ImagesEntity getImagesByUserImageId() {
        return imagesByUserImageId;
    }

    public void setImagesByUserImageId(ImagesEntity imagesByUserImageId) {
        this.imagesByUserImageId = imagesByUserImageId;
    }

    public EmployeesEntity getEmployeesById() {
        return employeesById;
    }

    public void setEmployeesById(EmployeesEntity employeesById) {
        this.employeesById = employeesById;
    }

    public ManagersEntity getManagersById() {
        return managersById;
    }

    public void setManagersById(ManagersEntity managersById) {
        this.managersById = managersById;
    }
}
