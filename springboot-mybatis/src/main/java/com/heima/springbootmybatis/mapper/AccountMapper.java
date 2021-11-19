package com.heima.springbootmybatis.mapper;

import com.heima.springbootmybatis.domain.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AccountMapper {

    @Select("select u.account, p.desc from Account_DB.account as u left join pingyin.pingyin as p on u.id=p.id where p.id=1")
    public List<Account> findAll();
}
