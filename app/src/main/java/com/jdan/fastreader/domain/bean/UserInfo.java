package com.jdan.fastreader.domain.bean;

import java.io.Serializable;

/**
 * Created by Nan&Cxx on 2017/7/14.
 */
public class UserInfo implements Serializable{
    private String role_id;//角色id
    private String remark;
    private String user_unit;
    private String user_tel;//座机
    private String user_nickname;//昵称
    private String user_pass;
    private String user_name;
    private String user_phone;//手机
    private String user_em;
    private String user_comment;//备注
    private String user_id;
    private String user_img;
    private String user_alias;// 别名
    private String user_tags;// 消息推送标签
    private String leader_level;//
    private String user_qq;
    private String user_wx;
    private String user_point;
    private String login_cont;
    private String user_group;
    private String user_pinyin;
    private String user_state;
    private String last_login;
    private String login_name;
    private String user_initial;
    private String role_name;

    public String getUser_nickname() {
        return user_nickname;
    }

    public void setUser_nickname(String user_nickname) {
        this.user_nickname = user_nickname;
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getUser_unit() {
        return user_unit;
    }

    public void setUser_unit(String user_unit) {
        this.user_unit = user_unit;
    }

    public String getUser_tel() {
        return user_tel;
    }

    public void setUser_tel(String user_tel) {
        this.user_tel = user_tel;
    }

    public String getUser_pass() {
        return user_pass;
    }

    public void setUser_pass(String user_pass) {
        this.user_pass = user_pass;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getUser_em() {
        return user_em;
    }

    public void setUser_em(String user_em) {
        this.user_em = user_em;
    }

    public String getUser_comment() {
        return user_comment;
    }

    public void setUser_comment(String user_comment) {
        this.user_comment = user_comment;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_img() {
        return user_img;
    }

    public void setUser_img(String user_img) {
        this.user_img = user_img;
    }

    public String getUser_alias() {
        return user_alias;
    }

    public void setUser_alias(String user_alias) {
        this.user_alias = user_alias;
    }

    public String getUser_tags() {
        return user_tags;
    }

    public void setUser_tags(String user_tags) {
        this.user_tags = user_tags;
    }

    public String getLeader_level() {
        return leader_level;
    }

    public void setLeader_level(String leader_level) {
        this.leader_level = leader_level;
    }

    public String getUser_qq() {
        return user_qq;
    }

    public void setUser_qq(String user_qq) {
        this.user_qq = user_qq;
    }

    public String getUser_wx() {
        return user_wx;
    }

    public void setUser_wx(String user_wx) {
        this.user_wx = user_wx;
    }

    public String getUser_point() {
        return user_point;
    }

    public void setUser_point(String user_point) {
        this.user_point = user_point;
    }

    public String getLogin_cont() {
        return login_cont;
    }

    public void setLogin_cont(String login_cont) {
        this.login_cont = login_cont;
    }

    public String getUser_group() {
        return user_group;
    }

    public void setUser_group(String user_group) {
        this.user_group = user_group;
    }

    public String getUser_pinyin() {
        return user_pinyin;
    }

    public void setUser_pinyin(String user_pinyin) {
        this.user_pinyin = user_pinyin;
    }

    public String getUser_state() {
        return user_state;
    }

    public void setUser_state(String user_state) {
        this.user_state = user_state;
    }

    public String getLast_login() {
        return last_login;
    }

    public void setLast_login(String last_login) {
        this.last_login = last_login;
    }

    public String getLogin_name() {
        return login_name;
    }

    public void setLogin_name(String login_name) {
        this.login_name = login_name;
    }

    public String getUser_initial() {
        return user_initial;
    }

    public void setUser_initial(String user_initial) {
        this.user_initial = user_initial;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "role_id='" + role_id + '\'' +
                ", remark='" + remark + '\'' +
                ", user_unit='" + user_unit + '\'' +
                ", user_tel='" + user_tel + '\'' +
                ", user_nickname='" + user_nickname + '\'' +
                ", user_pass='" + user_pass + '\'' +
                ", user_name='" + user_name + '\'' +
                ", user_phone='" + user_phone + '\'' +
                ", user_em='" + user_em + '\'' +
                ", user_comment='" + user_comment + '\'' +
                ", user_id='" + user_id + '\'' +
                ", user_img='" + user_img + '\'' +
                ", user_alias='" + user_alias + '\'' +
                ", user_tags='" + user_tags + '\'' +
                ", leader_level='" + leader_level + '\'' +
                ", user_qq='" + user_qq + '\'' +
                ", user_wx='" + user_wx + '\'' +
                ", user_point='" + user_point + '\'' +
                ", login_cont='" + login_cont + '\'' +
                ", user_group='" + user_group + '\'' +
                ", user_pinyin='" + user_pinyin + '\'' +
                ", user_state='" + user_state + '\'' +
                ", last_login='" + last_login + '\'' +
                ", login_name='" + login_name + '\'' +
                ", user_initial='" + user_initial + '\'' +
                ", role_name='" + role_name + '\'' +
                '}';
    }
}
