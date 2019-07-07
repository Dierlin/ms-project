package com.rainbow.auth.entity;

/**
 * <p>
 * Description: 用户实体
 * </p>
 * <p>
 * Copyright: Copyright (c) 2017
 * </p>
 * <p>
 * Company: Shenzhen www.rainbow.com SoftWare
 * </p>
 *
 * @author lenovo
 * @version 1.0
 * @since 2017年12月14日
 */
public class User extends BaseEntity {

    private static final long serialVersionUID = -1807036171821418010L;

    /**
     * 用户ID
     */
    private String userId;
    /**
     * 用户名称
     */
    private String name;
    /**
     * 用户手机号码
     */
    private String mobile;
    /**
     * 用户密码
     */
    private String password;
    /**
     * 加密盐
     */
    private String salt;

    /**
     * 状态 正常/锁定
     */
    private String status;

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
