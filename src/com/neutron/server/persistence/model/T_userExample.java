package com.neutron.server.persistence.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class T_userExample implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -6498366849997596402L;

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public T_userExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria implements Serializable{
        /**
		 * 
		 */
		private static final long serialVersionUID = -1045513357648037346L;
		
		protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andTUserIdIsNull() {
            addCriterion("T_USER_id is null");
            return (Criteria) this;
        }

        public Criteria andTUserIdIsNotNull() {
            addCriterion("T_USER_id is not null");
            return (Criteria) this;
        }

        public Criteria andTUserIdEqualTo(Integer value) {
            addCriterion("T_USER_id =", value, "tUserId");
            return (Criteria) this;
        }

        public Criteria andTUserIdNotEqualTo(Integer value) {
            addCriterion("T_USER_id <>", value, "tUserId");
            return (Criteria) this;
        }

        public Criteria andTUserIdGreaterThan(Integer value) {
            addCriterion("T_USER_id >", value, "tUserId");
            return (Criteria) this;
        }

        public Criteria andTUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("T_USER_id >=", value, "tUserId");
            return (Criteria) this;
        }

        public Criteria andTUserIdLessThan(Integer value) {
            addCriterion("T_USER_id <", value, "tUserId");
            return (Criteria) this;
        }

        public Criteria andTUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("T_USER_id <=", value, "tUserId");
            return (Criteria) this;
        }

        public Criteria andTUserIdIn(List<Integer> values) {
            addCriterion("T_USER_id in", values, "tUserId");
            return (Criteria) this;
        }

        public Criteria andTUserIdNotIn(List<Integer> values) {
            addCriterion("T_USER_id not in", values, "tUserId");
            return (Criteria) this;
        }

        public Criteria andTUserIdBetween(Integer value1, Integer value2) {
            addCriterion("T_USER_id between", value1, value2, "tUserId");
            return (Criteria) this;
        }

        public Criteria andTUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("T_USER_id not between", value1, value2, "tUserId");
            return (Criteria) this;
        }

        public Criteria andTUserRegtagIsNull() {
            addCriterion("T_USER_regtag is null");
            return (Criteria) this;
        }

        public Criteria andTUserRegtagIsNotNull() {
            addCriterion("T_USER_regtag is not null");
            return (Criteria) this;
        }

        public Criteria andTUserRegtagEqualTo(Integer value) {
            addCriterion("T_USER_regtag =", value, "tUserRegtag");
            return (Criteria) this;
        }

        public Criteria andTUserRegtagNotEqualTo(Integer value) {
            addCriterion("T_USER_regtag <>", value, "tUserRegtag");
            return (Criteria) this;
        }

        public Criteria andTUserRegtagGreaterThan(Integer value) {
            addCriterion("T_USER_regtag >", value, "tUserRegtag");
            return (Criteria) this;
        }

        public Criteria andTUserRegtagGreaterThanOrEqualTo(Integer value) {
            addCriterion("T_USER_regtag >=", value, "tUserRegtag");
            return (Criteria) this;
        }

        public Criteria andTUserRegtagLessThan(Integer value) {
            addCriterion("T_USER_regtag <", value, "tUserRegtag");
            return (Criteria) this;
        }

        public Criteria andTUserRegtagLessThanOrEqualTo(Integer value) {
            addCriterion("T_USER_regtag <=", value, "tUserRegtag");
            return (Criteria) this;
        }

        public Criteria andTUserRegtagIn(List<Integer> values) {
            addCriterion("T_USER_regtag in", values, "tUserRegtag");
            return (Criteria) this;
        }

        public Criteria andTUserRegtagNotIn(List<Integer> values) {
            addCriterion("T_USER_regtag not in", values, "tUserRegtag");
            return (Criteria) this;
        }

        public Criteria andTUserRegtagBetween(Integer value1, Integer value2) {
            addCriterion("T_USER_regtag between", value1, value2, "tUserRegtag");
            return (Criteria) this;
        }

        public Criteria andTUserRegtagNotBetween(Integer value1, Integer value2) {
            addCriterion("T_USER_regtag not between", value1, value2, "tUserRegtag");
            return (Criteria) this;
        }

        public Criteria andTUserAvatarIsNull() {
            addCriterion("T_USER_avatar is null");
            return (Criteria) this;
        }

        public Criteria andTUserAvatarIsNotNull() {
            addCriterion("T_USER_avatar is not null");
            return (Criteria) this;
        }

        public Criteria andTUserAvatarEqualTo(String value) {
            addCriterion("T_USER_avatar =", value, "tUserAvatar");
            return (Criteria) this;
        }

        public Criteria andTUserAvatarNotEqualTo(String value) {
            addCriterion("T_USER_avatar <>", value, "tUserAvatar");
            return (Criteria) this;
        }

        public Criteria andTUserAvatarGreaterThan(String value) {
            addCriterion("T_USER_avatar >", value, "tUserAvatar");
            return (Criteria) this;
        }

        public Criteria andTUserAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("T_USER_avatar >=", value, "tUserAvatar");
            return (Criteria) this;
        }

        public Criteria andTUserAvatarLessThan(String value) {
            addCriterion("T_USER_avatar <", value, "tUserAvatar");
            return (Criteria) this;
        }

        public Criteria andTUserAvatarLessThanOrEqualTo(String value) {
            addCriterion("T_USER_avatar <=", value, "tUserAvatar");
            return (Criteria) this;
        }

        public Criteria andTUserAvatarLike(String value) {
            addCriterion("T_USER_avatar like", value, "tUserAvatar");
            return (Criteria) this;
        }

        public Criteria andTUserAvatarNotLike(String value) {
            addCriterion("T_USER_avatar not like", value, "tUserAvatar");
            return (Criteria) this;
        }

        public Criteria andTUserAvatarIn(List<String> values) {
            addCriterion("T_USER_avatar in", values, "tUserAvatar");
            return (Criteria) this;
        }

        public Criteria andTUserAvatarNotIn(List<String> values) {
            addCriterion("T_USER_avatar not in", values, "tUserAvatar");
            return (Criteria) this;
        }

        public Criteria andTUserAvatarBetween(String value1, String value2) {
            addCriterion("T_USER_avatar between", value1, value2, "tUserAvatar");
            return (Criteria) this;
        }

        public Criteria andTUserAvatarNotBetween(String value1, String value2) {
            addCriterion("T_USER_avatar not between", value1, value2, "tUserAvatar");
            return (Criteria) this;
        }

        public Criteria andTUserNameIsNull() {
            addCriterion("T_USER_name is null");
            return (Criteria) this;
        }

        public Criteria andTUserNameIsNotNull() {
            addCriterion("T_USER_name is not null");
            return (Criteria) this;
        }

        public Criteria andTUserNameEqualTo(String value) {
            addCriterion("T_USER_name =", value, "tUserName");
            return (Criteria) this;
        }

        public Criteria andTUserNameNotEqualTo(String value) {
            addCriterion("T_USER_name <>", value, "tUserName");
            return (Criteria) this;
        }

        public Criteria andTUserNameGreaterThan(String value) {
            addCriterion("T_USER_name >", value, "tUserName");
            return (Criteria) this;
        }

        public Criteria andTUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("T_USER_name >=", value, "tUserName");
            return (Criteria) this;
        }

        public Criteria andTUserNameLessThan(String value) {
            addCriterion("T_USER_name <", value, "tUserName");
            return (Criteria) this;
        }

        public Criteria andTUserNameLessThanOrEqualTo(String value) {
            addCriterion("T_USER_name <=", value, "tUserName");
            return (Criteria) this;
        }

        public Criteria andTUserNameLike(String value) {
            addCriterion("T_USER_name like", value, "tUserName");
            return (Criteria) this;
        }

        public Criteria andTUserNameNotLike(String value) {
            addCriterion("T_USER_name not like", value, "tUserName");
            return (Criteria) this;
        }

        public Criteria andTUserNameIn(List<String> values) {
            addCriterion("T_USER_name in", values, "tUserName");
            return (Criteria) this;
        }

        public Criteria andTUserNameNotIn(List<String> values) {
            addCriterion("T_USER_name not in", values, "tUserName");
            return (Criteria) this;
        }

        public Criteria andTUserNameBetween(String value1, String value2) {
            addCriterion("T_USER_name between", value1, value2, "tUserName");
            return (Criteria) this;
        }

        public Criteria andTUserNameNotBetween(String value1, String value2) {
            addCriterion("T_USER_name not between", value1, value2, "tUserName");
            return (Criteria) this;
        }

        public Criteria andTUserGenderIsNull() {
            addCriterion("T_USER_gender is null");
            return (Criteria) this;
        }

        public Criteria andTUserGenderIsNotNull() {
            addCriterion("T_USER_gender is not null");
            return (Criteria) this;
        }

        public Criteria andTUserGenderEqualTo(Integer value) {
            addCriterion("T_USER_gender =", value, "tUserGender");
            return (Criteria) this;
        }

        public Criteria andTUserGenderNotEqualTo(Integer value) {
            addCriterion("T_USER_gender <>", value, "tUserGender");
            return (Criteria) this;
        }

        public Criteria andTUserGenderGreaterThan(Integer value) {
            addCriterion("T_USER_gender >", value, "tUserGender");
            return (Criteria) this;
        }

        public Criteria andTUserGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("T_USER_gender >=", value, "tUserGender");
            return (Criteria) this;
        }

        public Criteria andTUserGenderLessThan(Integer value) {
            addCriterion("T_USER_gender <", value, "tUserGender");
            return (Criteria) this;
        }

        public Criteria andTUserGenderLessThanOrEqualTo(Integer value) {
            addCriterion("T_USER_gender <=", value, "tUserGender");
            return (Criteria) this;
        }

        public Criteria andTUserGenderIn(List<Integer> values) {
            addCriterion("T_USER_gender in", values, "tUserGender");
            return (Criteria) this;
        }

        public Criteria andTUserGenderNotIn(List<Integer> values) {
            addCriterion("T_USER_gender not in", values, "tUserGender");
            return (Criteria) this;
        }

        public Criteria andTUserGenderBetween(Integer value1, Integer value2) {
            addCriterion("T_USER_gender between", value1, value2, "tUserGender");
            return (Criteria) this;
        }

        public Criteria andTUserGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("T_USER_gender not between", value1, value2, "tUserGender");
            return (Criteria) this;
        }

        public Criteria andTUserBirthIsNull() {
            addCriterion("T_USER_birth is null");
            return (Criteria) this;
        }

        public Criteria andTUserBirthIsNotNull() {
            addCriterion("T_USER_birth is not null");
            return (Criteria) this;
        }

        public Criteria andTUserBirthEqualTo(String value) {
            addCriterion("T_USER_birth =", value, "tUserBirth");
            return (Criteria) this;
        }

        public Criteria andTUserBirthNotEqualTo(String value) {
            addCriterion("T_USER_birth <>", value, "tUserBirth");
            return (Criteria) this;
        }

        public Criteria andTUserBirthGreaterThan(String value) {
            addCriterion("T_USER_birth >", value, "tUserBirth");
            return (Criteria) this;
        }

        public Criteria andTUserBirthGreaterThanOrEqualTo(String value) {
            addCriterion("T_USER_birth >=", value, "tUserBirth");
            return (Criteria) this;
        }

        public Criteria andTUserBirthLessThan(String value) {
            addCriterion("T_USER_birth <", value, "tUserBirth");
            return (Criteria) this;
        }

        public Criteria andTUserBirthLessThanOrEqualTo(String value) {
            addCriterion("T_USER_birth <=", value, "tUserBirth");
            return (Criteria) this;
        }

        public Criteria andTUserBirthLike(String value) {
            addCriterion("T_USER_birth like", value, "tUserBirth");
            return (Criteria) this;
        }

        public Criteria andTUserBirthNotLike(String value) {
            addCriterion("T_USER_birth not like", value, "tUserBirth");
            return (Criteria) this;
        }

        public Criteria andTUserBirthIn(List<String> values) {
            addCriterion("T_USER_birth in", values, "tUserBirth");
            return (Criteria) this;
        }

        public Criteria andTUserBirthNotIn(List<String> values) {
            addCriterion("T_USER_birth not in", values, "tUserBirth");
            return (Criteria) this;
        }

        public Criteria andTUserBirthBetween(String value1, String value2) {
            addCriterion("T_USER_birth between", value1, value2, "tUserBirth");
            return (Criteria) this;
        }

        public Criteria andTUserBirthNotBetween(String value1, String value2) {
            addCriterion("T_USER_birth not between", value1, value2, "tUserBirth");
            return (Criteria) this;
        }

        public Criteria andTUserPhonenumberIsNull() {
            addCriterion("T_USER_phonenumber is null");
            return (Criteria) this;
        }

        public Criteria andTUserPhonenumberIsNotNull() {
            addCriterion("T_USER_phonenumber is not null");
            return (Criteria) this;
        }

        public Criteria andTUserPhonenumberEqualTo(String value) {
            addCriterion("T_USER_phonenumber =", value, "tUserPhonenumber");
            return (Criteria) this;
        }

        public Criteria andTUserPhonenumberNotEqualTo(String value) {
            addCriterion("T_USER_phonenumber <>", value, "tUserPhonenumber");
            return (Criteria) this;
        }

        public Criteria andTUserPhonenumberGreaterThan(String value) {
            addCriterion("T_USER_phonenumber >", value, "tUserPhonenumber");
            return (Criteria) this;
        }

        public Criteria andTUserPhonenumberGreaterThanOrEqualTo(String value) {
            addCriterion("T_USER_phonenumber >=", value, "tUserPhonenumber");
            return (Criteria) this;
        }

        public Criteria andTUserPhonenumberLessThan(String value) {
            addCriterion("T_USER_phonenumber <", value, "tUserPhonenumber");
            return (Criteria) this;
        }

        public Criteria andTUserPhonenumberLessThanOrEqualTo(String value) {
            addCriterion("T_USER_phonenumber <=", value, "tUserPhonenumber");
            return (Criteria) this;
        }

        public Criteria andTUserPhonenumberLike(String value) {
            addCriterion("T_USER_phonenumber like", value, "tUserPhonenumber");
            return (Criteria) this;
        }

        public Criteria andTUserPhonenumberNotLike(String value) {
            addCriterion("T_USER_phonenumber not like", value, "tUserPhonenumber");
            return (Criteria) this;
        }

        public Criteria andTUserPhonenumberIn(List<String> values) {
            addCriterion("T_USER_phonenumber in", values, "tUserPhonenumber");
            return (Criteria) this;
        }

        public Criteria andTUserPhonenumberNotIn(List<String> values) {
            addCriterion("T_USER_phonenumber not in", values, "tUserPhonenumber");
            return (Criteria) this;
        }

        public Criteria andTUserPhonenumberBetween(String value1, String value2) {
            addCriterion("T_USER_phonenumber between", value1, value2, "tUserPhonenumber");
            return (Criteria) this;
        }

        public Criteria andTUserPhonenumberNotBetween(String value1, String value2) {
            addCriterion("T_USER_phonenumber not between", value1, value2, "tUserPhonenumber");
            return (Criteria) this;
        }

        public Criteria andTUserPasscodeIsNull() {
            addCriterion("T_USER_passcode is null");
            return (Criteria) this;
        }

        public Criteria andTUserPasscodeIsNotNull() {
            addCriterion("T_USER_passcode is not null");
            return (Criteria) this;
        }

        public Criteria andTUserPasscodeEqualTo(String value) {
            addCriterion("T_USER_passcode =", value, "tUserPasscode");
            return (Criteria) this;
        }

        public Criteria andTUserPasscodeNotEqualTo(String value) {
            addCriterion("T_USER_passcode <>", value, "tUserPasscode");
            return (Criteria) this;
        }

        public Criteria andTUserPasscodeGreaterThan(String value) {
            addCriterion("T_USER_passcode >", value, "tUserPasscode");
            return (Criteria) this;
        }

        public Criteria andTUserPasscodeGreaterThanOrEqualTo(String value) {
            addCriterion("T_USER_passcode >=", value, "tUserPasscode");
            return (Criteria) this;
        }

        public Criteria andTUserPasscodeLessThan(String value) {
            addCriterion("T_USER_passcode <", value, "tUserPasscode");
            return (Criteria) this;
        }

        public Criteria andTUserPasscodeLessThanOrEqualTo(String value) {
            addCriterion("T_USER_passcode <=", value, "tUserPasscode");
            return (Criteria) this;
        }

        public Criteria andTUserPasscodeLike(String value) {
            addCriterion("T_USER_passcode like", value, "tUserPasscode");
            return (Criteria) this;
        }

        public Criteria andTUserPasscodeNotLike(String value) {
            addCriterion("T_USER_passcode not like", value, "tUserPasscode");
            return (Criteria) this;
        }

        public Criteria andTUserPasscodeIn(List<String> values) {
            addCriterion("T_USER_passcode in", values, "tUserPasscode");
            return (Criteria) this;
        }

        public Criteria andTUserPasscodeNotIn(List<String> values) {
            addCriterion("T_USER_passcode not in", values, "tUserPasscode");
            return (Criteria) this;
        }

        public Criteria andTUserPasscodeBetween(String value1, String value2) {
            addCriterion("T_USER_passcode between", value1, value2, "tUserPasscode");
            return (Criteria) this;
        }

        public Criteria andTUserPasscodeNotBetween(String value1, String value2) {
            addCriterion("T_USER_passcode not between", value1, value2, "tUserPasscode");
            return (Criteria) this;
        }

        public Criteria andTUserPasscodeTimestampIsNull() {
            addCriterion("t_user_passcode_timestamp is null");
            return (Criteria) this;
        }

        public Criteria andTUserPasscodeTimestampIsNotNull() {
            addCriterion("t_user_passcode_timestamp is not null");
            return (Criteria) this;
        }

        public Criteria andTUserPasscodeTimestampEqualTo(Date value) {
            addCriterion("t_user_passcode_timestamp =", value, "tUserPasscodeTimestamp");
            return (Criteria) this;
        }

        public Criteria andTUserPasscodeTimestampNotEqualTo(Date value) {
            addCriterion("t_user_passcode_timestamp <>", value, "tUserPasscodeTimestamp");
            return (Criteria) this;
        }

        public Criteria andTUserPasscodeTimestampGreaterThan(Date value) {
            addCriterion("t_user_passcode_timestamp >", value, "tUserPasscodeTimestamp");
            return (Criteria) this;
        }

        public Criteria andTUserPasscodeTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("t_user_passcode_timestamp >=", value, "tUserPasscodeTimestamp");
            return (Criteria) this;
        }

        public Criteria andTUserPasscodeTimestampLessThan(Date value) {
            addCriterion("t_user_passcode_timestamp <", value, "tUserPasscodeTimestamp");
            return (Criteria) this;
        }

        public Criteria andTUserPasscodeTimestampLessThanOrEqualTo(Date value) {
            addCriterion("t_user_passcode_timestamp <=", value, "tUserPasscodeTimestamp");
            return (Criteria) this;
        }

        public Criteria andTUserPasscodeTimestampIn(List<Date> values) {
            addCriterion("t_user_passcode_timestamp in", values, "tUserPasscodeTimestamp");
            return (Criteria) this;
        }

        public Criteria andTUserPasscodeTimestampNotIn(List<Date> values) {
            addCriterion("t_user_passcode_timestamp not in", values, "tUserPasscodeTimestamp");
            return (Criteria) this;
        }

        public Criteria andTUserPasscodeTimestampBetween(Date value1, Date value2) {
            addCriterion("t_user_passcode_timestamp between", value1, value2, "tUserPasscodeTimestamp");
            return (Criteria) this;
        }

        public Criteria andTUserPasscodeTimestampNotBetween(Date value1, Date value2) {
            addCriterion("t_user_passcode_timestamp not between", value1, value2, "tUserPasscodeTimestamp");
            return (Criteria) this;
        }

        public Criteria andTUserAreacodeIsNull() {
            addCriterion("T_USER_areacode is null");
            return (Criteria) this;
        }

        public Criteria andTUserAreacodeIsNotNull() {
            addCriterion("T_USER_areacode is not null");
            return (Criteria) this;
        }

        public Criteria andTUserAreacodeEqualTo(String value) {
            addCriterion("T_USER_areacode =", value, "tUserAreacode");
            return (Criteria) this;
        }

        public Criteria andTUserAreacodeNotEqualTo(String value) {
            addCriterion("T_USER_areacode <>", value, "tUserAreacode");
            return (Criteria) this;
        }

        public Criteria andTUserAreacodeGreaterThan(String value) {
            addCriterion("T_USER_areacode >", value, "tUserAreacode");
            return (Criteria) this;
        }

        public Criteria andTUserAreacodeGreaterThanOrEqualTo(String value) {
            addCriterion("T_USER_areacode >=", value, "tUserAreacode");
            return (Criteria) this;
        }

        public Criteria andTUserAreacodeLessThan(String value) {
            addCriterion("T_USER_areacode <", value, "tUserAreacode");
            return (Criteria) this;
        }

        public Criteria andTUserAreacodeLessThanOrEqualTo(String value) {
            addCriterion("T_USER_areacode <=", value, "tUserAreacode");
            return (Criteria) this;
        }

        public Criteria andTUserAreacodeLike(String value) {
            addCriterion("T_USER_areacode like", value, "tUserAreacode");
            return (Criteria) this;
        }

        public Criteria andTUserAreacodeNotLike(String value) {
            addCriterion("T_USER_areacode not like", value, "tUserAreacode");
            return (Criteria) this;
        }

        public Criteria andTUserAreacodeIn(List<String> values) {
            addCriterion("T_USER_areacode in", values, "tUserAreacode");
            return (Criteria) this;
        }

        public Criteria andTUserAreacodeNotIn(List<String> values) {
            addCriterion("T_USER_areacode not in", values, "tUserAreacode");
            return (Criteria) this;
        }

        public Criteria andTUserAreacodeBetween(String value1, String value2) {
            addCriterion("T_USER_areacode between", value1, value2, "tUserAreacode");
            return (Criteria) this;
        }

        public Criteria andTUserAreacodeNotBetween(String value1, String value2) {
            addCriterion("T_USER_areacode not between", value1, value2, "tUserAreacode");
            return (Criteria) this;
        }

        public Criteria andTUserDeltagIsNull() {
            addCriterion("T_USER_deltag is null");
            return (Criteria) this;
        }

        public Criteria andTUserDeltagIsNotNull() {
            addCriterion("T_USER_deltag is not null");
            return (Criteria) this;
        }

        public Criteria andTUserDeltagEqualTo(String value) {
            addCriterion("T_USER_deltag =", value, "tUserDeltag");
            return (Criteria) this;
        }

        public Criteria andTUserDeltagNotEqualTo(String value) {
            addCriterion("T_USER_deltag <>", value, "tUserDeltag");
            return (Criteria) this;
        }

        public Criteria andTUserDeltagGreaterThan(String value) {
            addCriterion("T_USER_deltag >", value, "tUserDeltag");
            return (Criteria) this;
        }

        public Criteria andTUserDeltagGreaterThanOrEqualTo(String value) {
            addCriterion("T_USER_deltag >=", value, "tUserDeltag");
            return (Criteria) this;
        }

        public Criteria andTUserDeltagLessThan(String value) {
            addCriterion("T_USER_deltag <", value, "tUserDeltag");
            return (Criteria) this;
        }

        public Criteria andTUserDeltagLessThanOrEqualTo(String value) {
            addCriterion("T_USER_deltag <=", value, "tUserDeltag");
            return (Criteria) this;
        }

        public Criteria andTUserDeltagLike(String value) {
            addCriterion("T_USER_deltag like", value, "tUserDeltag");
            return (Criteria) this;
        }

        public Criteria andTUserDeltagNotLike(String value) {
            addCriterion("T_USER_deltag not like", value, "tUserDeltag");
            return (Criteria) this;
        }

        public Criteria andTUserDeltagIn(List<String> values) {
            addCriterion("T_USER_deltag in", values, "tUserDeltag");
            return (Criteria) this;
        }

        public Criteria andTUserDeltagNotIn(List<String> values) {
            addCriterion("T_USER_deltag not in", values, "tUserDeltag");
            return (Criteria) this;
        }

        public Criteria andTUserDeltagBetween(String value1, String value2) {
            addCriterion("T_USER_deltag between", value1, value2, "tUserDeltag");
            return (Criteria) this;
        }

        public Criteria andTUserDeltagNotBetween(String value1, String value2) {
            addCriterion("T_USER_deltag not between", value1, value2, "tUserDeltag");
            return (Criteria) this;
        }

        public Criteria andTUserRegdateIsNull() {
            addCriterion("T_USER_regdate is null");
            return (Criteria) this;
        }

        public Criteria andTUserRegdateIsNotNull() {
            addCriterion("T_USER_regdate is not null");
            return (Criteria) this;
        }

        public Criteria andTUserRegdateEqualTo(Date value) {
            addCriterionForJDBCDate("T_USER_regdate =", value, "tUserRegdate");
            return (Criteria) this;
        }

        public Criteria andTUserRegdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("T_USER_regdate <>", value, "tUserRegdate");
            return (Criteria) this;
        }

        public Criteria andTUserRegdateGreaterThan(Date value) {
            addCriterionForJDBCDate("T_USER_regdate >", value, "tUserRegdate");
            return (Criteria) this;
        }

        public Criteria andTUserRegdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_USER_regdate >=", value, "tUserRegdate");
            return (Criteria) this;
        }

        public Criteria andTUserRegdateLessThan(Date value) {
            addCriterionForJDBCDate("T_USER_regdate <", value, "tUserRegdate");
            return (Criteria) this;
        }

        public Criteria andTUserRegdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_USER_regdate <=", value, "tUserRegdate");
            return (Criteria) this;
        }

        public Criteria andTUserRegdateIn(List<Date> values) {
            addCriterionForJDBCDate("T_USER_regdate in", values, "tUserRegdate");
            return (Criteria) this;
        }

        public Criteria andTUserRegdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("T_USER_regdate not in", values, "tUserRegdate");
            return (Criteria) this;
        }

        public Criteria andTUserRegdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_USER_regdate between", value1, value2, "tUserRegdate");
            return (Criteria) this;
        }

        public Criteria andTUserRegdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_USER_regdate not between", value1, value2, "tUserRegdate");
            return (Criteria) this;
        }

        public Criteria andTUserImeiIsNull() {
            addCriterion("t_user_imei is null");
            return (Criteria) this;
        }

        public Criteria andTUserImeiIsNotNull() {
            addCriterion("t_user_imei is not null");
            return (Criteria) this;
        }

        public Criteria andTUserImeiEqualTo(String value) {
            addCriterion("t_user_imei =", value, "tUserImei");
            return (Criteria) this;
        }

        public Criteria andTUserImeiNotEqualTo(String value) {
            addCriterion("t_user_imei <>", value, "tUserImei");
            return (Criteria) this;
        }

        public Criteria andTUserImeiGreaterThan(String value) {
            addCriterion("t_user_imei >", value, "tUserImei");
            return (Criteria) this;
        }

        public Criteria andTUserImeiGreaterThanOrEqualTo(String value) {
            addCriterion("t_user_imei >=", value, "tUserImei");
            return (Criteria) this;
        }

        public Criteria andTUserImeiLessThan(String value) {
            addCriterion("t_user_imei <", value, "tUserImei");
            return (Criteria) this;
        }

        public Criteria andTUserImeiLessThanOrEqualTo(String value) {
            addCriterion("t_user_imei <=", value, "tUserImei");
            return (Criteria) this;
        }

        public Criteria andTUserImeiLike(String value) {
            addCriterion("t_user_imei like", value, "tUserImei");
            return (Criteria) this;
        }

        public Criteria andTUserImeiNotLike(String value) {
            addCriterion("t_user_imei not like", value, "tUserImei");
            return (Criteria) this;
        }

        public Criteria andTUserImeiIn(List<String> values) {
            addCriterion("t_user_imei in", values, "tUserImei");
            return (Criteria) this;
        }

        public Criteria andTUserImeiNotIn(List<String> values) {
            addCriterion("t_user_imei not in", values, "tUserImei");
            return (Criteria) this;
        }

        public Criteria andTUserImeiBetween(String value1, String value2) {
            addCriterion("t_user_imei between", value1, value2, "tUserImei");
            return (Criteria) this;
        }

        public Criteria andTUserImeiNotBetween(String value1, String value2) {
            addCriterion("t_user_imei not between", value1, value2, "tUserImei");
            return (Criteria) this;
        }

        public Criteria andTUserImsiIsNull() {
            addCriterion("t_user_imsi is null");
            return (Criteria) this;
        }

        public Criteria andTUserImsiIsNotNull() {
            addCriterion("t_user_imsi is not null");
            return (Criteria) this;
        }

        public Criteria andTUserImsiEqualTo(String value) {
            addCriterion("t_user_imsi =", value, "tUserImsi");
            return (Criteria) this;
        }

        public Criteria andTUserImsiNotEqualTo(String value) {
            addCriterion("t_user_imsi <>", value, "tUserImsi");
            return (Criteria) this;
        }

        public Criteria andTUserImsiGreaterThan(String value) {
            addCriterion("t_user_imsi >", value, "tUserImsi");
            return (Criteria) this;
        }

        public Criteria andTUserImsiGreaterThanOrEqualTo(String value) {
            addCriterion("t_user_imsi >=", value, "tUserImsi");
            return (Criteria) this;
        }

        public Criteria andTUserImsiLessThan(String value) {
            addCriterion("t_user_imsi <", value, "tUserImsi");
            return (Criteria) this;
        }

        public Criteria andTUserImsiLessThanOrEqualTo(String value) {
            addCriterion("t_user_imsi <=", value, "tUserImsi");
            return (Criteria) this;
        }

        public Criteria andTUserImsiLike(String value) {
            addCriterion("t_user_imsi like", value, "tUserImsi");
            return (Criteria) this;
        }

        public Criteria andTUserImsiNotLike(String value) {
            addCriterion("t_user_imsi not like", value, "tUserImsi");
            return (Criteria) this;
        }

        public Criteria andTUserImsiIn(List<String> values) {
            addCriterion("t_user_imsi in", values, "tUserImsi");
            return (Criteria) this;
        }

        public Criteria andTUserImsiNotIn(List<String> values) {
            addCriterion("t_user_imsi not in", values, "tUserImsi");
            return (Criteria) this;
        }

        public Criteria andTUserImsiBetween(String value1, String value2) {
            addCriterion("t_user_imsi between", value1, value2, "tUserImsi");
            return (Criteria) this;
        }

        public Criteria andTUserImsiNotBetween(String value1, String value2) {
            addCriterion("t_user_imsi not between", value1, value2, "tUserImsi");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable{

        /**
		 * 
		 */
		private static final long serialVersionUID = -3166396011723394739L;

		protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable{
        /**
		 * 
		 */
		private static final long serialVersionUID = 8723192861742893911L;

		private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}