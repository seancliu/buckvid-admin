package com.buckvid.pojo;

import java.util.ArrayList;
import java.util.List;

public class BuckvidUsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BuckvidUsersExample() {
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

    protected abstract static class GeneratedCriteria {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("icon is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("icon is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("icon =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("icon <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("icon >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("icon >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("icon <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("icon <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("icon like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("icon not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("icon in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("icon not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("icon between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("icon not between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andFollowersCountIsNull() {
            addCriterion("followers_count is null");
            return (Criteria) this;
        }

        public Criteria andFollowersCountIsNotNull() {
            addCriterion("followers_count is not null");
            return (Criteria) this;
        }

        public Criteria andFollowersCountEqualTo(Integer value) {
            addCriterion("followers_count =", value, "followersCount");
            return (Criteria) this;
        }

        public Criteria andFollowersCountNotEqualTo(Integer value) {
            addCriterion("followers_count <>", value, "followersCount");
            return (Criteria) this;
        }

        public Criteria andFollowersCountGreaterThan(Integer value) {
            addCriterion("followers_count >", value, "followersCount");
            return (Criteria) this;
        }

        public Criteria andFollowersCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("followers_count >=", value, "followersCount");
            return (Criteria) this;
        }

        public Criteria andFollowersCountLessThan(Integer value) {
            addCriterion("followers_count <", value, "followersCount");
            return (Criteria) this;
        }

        public Criteria andFollowersCountLessThanOrEqualTo(Integer value) {
            addCriterion("followers_count <=", value, "followersCount");
            return (Criteria) this;
        }

        public Criteria andFollowersCountIn(List<Integer> values) {
            addCriterion("followers_count in", values, "followersCount");
            return (Criteria) this;
        }

        public Criteria andFollowersCountNotIn(List<Integer> values) {
            addCriterion("followers_count not in", values, "followersCount");
            return (Criteria) this;
        }

        public Criteria andFollowersCountBetween(Integer value1, Integer value2) {
            addCriterion("followers_count between", value1, value2, "followersCount");
            return (Criteria) this;
        }

        public Criteria andFollowersCountNotBetween(Integer value1, Integer value2) {
            addCriterion("followers_count not between", value1, value2, "followersCount");
            return (Criteria) this;
        }

        public Criteria andFollowingCountIsNull() {
            addCriterion("following_count is null");
            return (Criteria) this;
        }

        public Criteria andFollowingCountIsNotNull() {
            addCriterion("following_count is not null");
            return (Criteria) this;
        }

        public Criteria andFollowingCountEqualTo(Integer value) {
            addCriterion("following_count =", value, "followingCount");
            return (Criteria) this;
        }

        public Criteria andFollowingCountNotEqualTo(Integer value) {
            addCriterion("following_count <>", value, "followingCount");
            return (Criteria) this;
        }

        public Criteria andFollowingCountGreaterThan(Integer value) {
            addCriterion("following_count >", value, "followingCount");
            return (Criteria) this;
        }

        public Criteria andFollowingCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("following_count >=", value, "followingCount");
            return (Criteria) this;
        }

        public Criteria andFollowingCountLessThan(Integer value) {
            addCriterion("following_count <", value, "followingCount");
            return (Criteria) this;
        }

        public Criteria andFollowingCountLessThanOrEqualTo(Integer value) {
            addCriterion("following_count <=", value, "followingCount");
            return (Criteria) this;
        }

        public Criteria andFollowingCountIn(List<Integer> values) {
            addCriterion("following_count in", values, "followingCount");
            return (Criteria) this;
        }

        public Criteria andFollowingCountNotIn(List<Integer> values) {
            addCriterion("following_count not in", values, "followingCount");
            return (Criteria) this;
        }

        public Criteria andFollowingCountBetween(Integer value1, Integer value2) {
            addCriterion("following_count between", value1, value2, "followingCount");
            return (Criteria) this;
        }

        public Criteria andFollowingCountNotBetween(Integer value1, Integer value2) {
            addCriterion("following_count not between", value1, value2, "followingCount");
            return (Criteria) this;
        }

        public Criteria andLikeReceivedCountIsNull() {
            addCriterion("like_received_count is null");
            return (Criteria) this;
        }

        public Criteria andLikeReceivedCountIsNotNull() {
            addCriterion("like_received_count is not null");
            return (Criteria) this;
        }

        public Criteria andLikeReceivedCountEqualTo(Integer value) {
            addCriterion("like_received_count =", value, "likeReceivedCount");
            return (Criteria) this;
        }

        public Criteria andLikeReceivedCountNotEqualTo(Integer value) {
            addCriterion("like_received_count <>", value, "likeReceivedCount");
            return (Criteria) this;
        }

        public Criteria andLikeReceivedCountGreaterThan(Integer value) {
            addCriterion("like_received_count >", value, "likeReceivedCount");
            return (Criteria) this;
        }

        public Criteria andLikeReceivedCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("like_received_count >=", value, "likeReceivedCount");
            return (Criteria) this;
        }

        public Criteria andLikeReceivedCountLessThan(Integer value) {
            addCriterion("like_received_count <", value, "likeReceivedCount");
            return (Criteria) this;
        }

        public Criteria andLikeReceivedCountLessThanOrEqualTo(Integer value) {
            addCriterion("like_received_count <=", value, "likeReceivedCount");
            return (Criteria) this;
        }

        public Criteria andLikeReceivedCountIn(List<Integer> values) {
            addCriterion("like_received_count in", values, "likeReceivedCount");
            return (Criteria) this;
        }

        public Criteria andLikeReceivedCountNotIn(List<Integer> values) {
            addCriterion("like_received_count not in", values, "likeReceivedCount");
            return (Criteria) this;
        }

        public Criteria andLikeReceivedCountBetween(Integer value1, Integer value2) {
            addCriterion("like_received_count between", value1, value2, "likeReceivedCount");
            return (Criteria) this;
        }

        public Criteria andLikeReceivedCountNotBetween(Integer value1, Integer value2) {
            addCriterion("like_received_count not between", value1, value2, "likeReceivedCount");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
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