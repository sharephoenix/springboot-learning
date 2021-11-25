package cn.huntaway.projo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
//lombok
//Spice up your java: Automatic Resource Management, automatic generation of getters, setters, equals, hashCode and toString, and more!
//POJO
@Data
@NoArgsConstructor
@Accessors(chain = true) // 链式写法
public class Dept implements Serializable { // Dept 实体类，orm-mysql；类表关系映射
    private Long deptno; // 主键
    private String dname;
    // 这个数据存在那个数据库的那个字段～ 微服务，一个服务对应一个数据库；
    // 同一个信息可能存在不同的数据库中
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }
}
