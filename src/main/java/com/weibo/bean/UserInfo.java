package com.weibo.bean;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Anonycurse
 * Date-Time: 2017-12-05-15:33-
 */

@Entity
@Table( name = "weibo_userinfo")

public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    ID
    private Integer id;
//    昵称
    private String name;
//    真实姓名
    private String truename;
//    性别
    private String sex;
//    所在地
    private String location;
//    星座
    private String constellation;
//    一句话介绍自己
    private String intro;
//    50*50 头像
    private String face50;
//    80*80头像
    private String face80;
//    180*180头像
    private String face180;
//    个性模板
    private String style;
//    关注数
    private String follow;
//    粉丝数
    private Integer fans;
//    微博数
    private Integer weibo;
//    所属用户ID
    private Integer uid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getFace50() {
        return face50;
    }

    public void setFace50(String face50) {
        this.face50 = face50;
    }

    public String getFace80() {
        return face80;
    }

    public void setFace80(String face80) {
        this.face80 = face80;
    }

    public String getFace180() {
        return face180;
    }

    public void setFace180(String face180) {
        this.face180 = face180;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getFollow() {
        return follow;
    }

    public void setFollow(String follow) {
        this.follow = follow;
    }

    public Integer getFans() {
        return fans;
    }

    public void setFans(Integer fans) {
        this.fans = fans;
    }

    public Integer getWeibo() {
        return weibo;
    }

    public void setWeibo(Integer weibo) {
        this.weibo = weibo;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}
