package com.neutron.server.persistence.model;

import java.io.Serializable;
import java.util.Date;

public class T_user implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -7061139590725067593L;

	private Integer tUserId;

    private Integer tUserRegtag;

    private String tUserAvatar;

    private String tUserName;

    private Integer tUserGender;

    private String tUserBirth;

    private String tUserPhonenumber;

    private String tUserPasscode;

    private Date tUserPasscodeTimestamp;

    private String tUserAreacode;

    private String tUserDeltag;

    private Date tUserRegdate;

    private String tUserImei;

    private String tUserImsi;

    private byte[] tUserPicture;

    public Integer gettUserId() {
        return tUserId;
    }

    public void settUserId(Integer tUserId) {
        this.tUserId = tUserId;
    }

    public Integer gettUserRegtag() {
        return tUserRegtag;
    }

    public void settUserRegtag(Integer tUserRegtag) {
        this.tUserRegtag = tUserRegtag;
    }

    public String gettUserAvatar() {
        return tUserAvatar;
    }

    public void settUserAvatar(String tUserAvatar) {
        this.tUserAvatar = tUserAvatar == null ? null : tUserAvatar.trim();
    }

    public String gettUserName() {
        return tUserName;
    }

    public void settUserName(String tUserName) {
        this.tUserName = tUserName == null ? null : tUserName.trim();
    }

    public Integer gettUserGender() {
        return tUserGender;
    }

    public void settUserGender(Integer tUserGender) {
        this.tUserGender = tUserGender;
    }

    public String gettUserBirth() {
        return tUserBirth;
    }

    public void settUserBirth(String tUserBirth) {
        this.tUserBirth = tUserBirth == null ? null : tUserBirth.trim();
    }

    public String gettUserPhonenumber() {
        return tUserPhonenumber;
    }

    public void settUserPhonenumber(String tUserPhonenumber) {
        this.tUserPhonenumber = tUserPhonenumber == null ? null : tUserPhonenumber.trim();
    }

    public String gettUserPasscode() {
        return tUserPasscode;
    }

    public void settUserPasscode(String tUserPasscode) {
        this.tUserPasscode = tUserPasscode == null ? null : tUserPasscode.trim();
    }

    public Date gettUserPasscodeTimestamp() {
        return tUserPasscodeTimestamp;
    }

    public void settUserPasscodeTimestamp(Date tUserPasscodeTimestamp) {
        this.tUserPasscodeTimestamp = tUserPasscodeTimestamp;
    }

    public String gettUserAreacode() {
        return tUserAreacode;
    }

    public void settUserAreacode(String tUserAreacode) {
        this.tUserAreacode = tUserAreacode == null ? null : tUserAreacode.trim();
    }

    public String gettUserDeltag() {
        return tUserDeltag;
    }

    public void settUserDeltag(String tUserDeltag) {
        this.tUserDeltag = tUserDeltag == null ? null : tUserDeltag.trim();
    }

    public Date gettUserRegdate() {
        return tUserRegdate;
    }

    public void settUserRegdate(Date tUserRegdate) {
        this.tUserRegdate = tUserRegdate;
    }

    public String gettUserImei() {
        return tUserImei;
    }

    public void settUserImei(String tUserImei) {
        this.tUserImei = tUserImei == null ? null : tUserImei.trim();
    }

    public String gettUserImsi() {
        return tUserImsi;
    }

    public void settUserImsi(String tUserImsi) {
        this.tUserImsi = tUserImsi == null ? null : tUserImsi.trim();
    }

    public byte[] gettUserPicture() {
        return tUserPicture;
    }

    public void settUserPicture(byte[] tUserPicture) {
        this.tUserPicture = tUserPicture;
    }
}