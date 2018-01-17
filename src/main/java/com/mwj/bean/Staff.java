package com.mwj.bean;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Time;

@Entity
public class Staff {
    private String myinitial;
    private String staffname;
    private String password;
    private String depname;
    private String mail;
    private Time joindate;
    private String telephone;
    private long gender;
    private long isadmin;
    private long deleted;

    @Id
    @Column(name = "MYINITIAL")
    public String getMyinitial() {
        return myinitial;
    }

    public void setMyinitial(String myinitial) {
        this.myinitial = myinitial;
    }

    @Basic
    @Column(name = "STAFFNAME")
    public String getStaffname() {
        return staffname;
    }

    public void setStaffname(String staffname) {
        this.staffname = staffname;
    }

    @Basic
    @Column(name = "PASSWORD")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "DEPNAME")
    public String getDepname() {
        return depname;
    }

    public void setDepname(String depname) {
        this.depname = depname;
    }

    @Basic
    @Column(name = "MAIL")
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Basic
    @Column(name = "JOINDATE")
    public Time getJoindate() {
        return joindate;
    }

    public void setJoindate(Time joindate) {
        this.joindate = joindate;
    }

    @Basic
    @Column(name = "TELEPHONE")
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Basic
    @Column(name = "GENDER")
    public long getGender() {
        return gender;
    }

    public void setGender(long gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "ISADMIN")
    public long getIsadmin() {
        return isadmin;
    }

    public void setIsadmin(long isadmin) {
        this.isadmin = isadmin;
    }

    @Basic
    @Column(name = "DELETED")
    public long getDeleted() {
        return deleted;
    }

    public void setDeleted(long deleted) {
        this.deleted = deleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Staff staff = (Staff) o;

        if (gender != staff.gender) return false;
        if (isadmin != staff.isadmin) return false;
        if (deleted != staff.deleted) return false;
        if (myinitial != null ? !myinitial.equals(staff.myinitial) : staff.myinitial != null) return false;
        if (staffname != null ? !staffname.equals(staff.staffname) : staff.staffname != null) return false;
        if (password != null ? !password.equals(staff.password) : staff.password != null) return false;
        if (depname != null ? !depname.equals(staff.depname) : staff.depname != null) return false;
        if (mail != null ? !mail.equals(staff.mail) : staff.mail != null) return false;
        if (joindate != null ? !joindate.equals(staff.joindate) : staff.joindate != null) return false;
        if (telephone != null ? !telephone.equals(staff.telephone) : staff.telephone != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = myinitial != null ? myinitial.hashCode() : 0;
        result = 31 * result + (staffname != null ? staffname.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (depname != null ? depname.hashCode() : 0);
        result = 31 * result + (mail != null ? mail.hashCode() : 0);
        result = 31 * result + (joindate != null ? joindate.hashCode() : 0);
        result = 31 * result + (telephone != null ? telephone.hashCode() : 0);
        result = 31 * result + (int) (gender ^ (gender >>> 32));
        result = 31 * result + (int) (isadmin ^ (isadmin >>> 32));
        result = 31 * result + (int) (deleted ^ (deleted >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "myinitial='" + myinitial + '\'' +
                ", staffname='" + staffname + '\'' +
                ", password='" + password + '\'' +
                ", depname='" + depname + '\'' +
                ", mail='" + mail + '\'' +
                ", joindate=" + joindate +
                ", telephone='" + telephone + '\'' +
                ", gender=" + gender +
                ", isadmin=" + isadmin +
                ", deleted=" + deleted +
                '}';
    }
}
