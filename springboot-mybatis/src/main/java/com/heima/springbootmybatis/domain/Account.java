package com.heima.springbootmybatis.domain;

public class Account {
    private long id;
    private String websit;
    private String account;
    private String pwd;
    private String description;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getWebsit() {
        return websit;
    }

    public void setWebsit(String websit) {
        this.websit = websit;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", websit='" + websit + '\'' +
                ", account='" + account + '\'' +
                ", pwd='" + pwd + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
