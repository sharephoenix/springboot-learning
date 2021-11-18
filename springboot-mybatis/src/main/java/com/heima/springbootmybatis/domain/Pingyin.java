package com.heima.springbootmybatis.domain;

public class Pingyin {
    private long id;
    private String pingyin;
    private String hanzi;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPingyin() {
        return pingyin;
    }

    public void setPingyin(String pingyin) {
        this.pingyin = pingyin;
    }

    public String getHanzi() {
        return hanzi;
    }

    public void setHanzi(String hanzi) {
        this.hanzi = hanzi;
    }

    @Override
    public String toString() {
        return "Pingyin{" +
                "id=" + id +
                ", pingyin='" + pingyin + '\'' +
                ", hanzi='" + hanzi + '\'' +
                '}';
    }
}
