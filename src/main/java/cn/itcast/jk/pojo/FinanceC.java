package cn.itcast.jk.pojo;

import java.util.Date;

public class FinanceC {
    private String financeId;

    private Date inputDate;

    private String inputBy;

    private String createBy;

    private String createDept;

    private Date createTime;

    public String getFinanceId() {
        return financeId;
    }

    public void setFinanceId(String financeId) {
        this.financeId = financeId == null ? null : financeId.trim();
    }

    public Date getInputDate() {
        return inputDate;
    }

    public void setInputDate(Date inputDate) {
        this.inputDate = inputDate;
    }

    public String getInputBy() {
        return inputBy;
    }

    public void setInputBy(String inputBy) {
        this.inputBy = inputBy == null ? null : inputBy.trim();
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public String getCreateDept() {
        return createDept;
    }

    public void setCreateDept(String createDept) {
        this.createDept = createDept == null ? null : createDept.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}