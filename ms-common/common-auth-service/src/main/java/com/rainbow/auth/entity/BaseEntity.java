
package com.rainbow.auth.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * BaseEntity 基础类
 *
 * @author jinling.jiang
 */
public class BaseEntity implements Serializable, Cloneable {

    /**
     * 作用描述.[请修改]
     */
    private static final long serialVersionUID = 7518721690457823933L;

    /**
     * 获取数据库序列名.
     *
     * @return 序列名
     */
    public String getSequenceName() {
        return null;
    }

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 插入时间
     */
    protected Date insertTime;

    /**
     * 插入人
     */
    protected String insertBy;

    /**
     * 插入人
     */
    protected Date updateTime;

    /**
     * 更新人
     */
    protected String updateBy;

    /**
     * 删除状态 Y：已删除 N：未删除
     */
    protected String deleteStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getInsertTime() {
        return insertTime == null ? null : (Date) insertTime.clone();
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime == null ? null : (Date) insertTime.clone();
    }

    public String getInsertBy() {
        return insertBy;
    }

    public void setInsertBy(String insertBy) {
        this.insertBy = insertBy;
    }

    public Date getUpdateTime() {
        return updateTime == null ? null : (Date) updateTime.clone();
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime == null ? null : (Date) updateTime.clone();
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(String deleteStatus) {
        this.deleteStatus = deleteStatus;
    }


}
