package com.heima.springbootmybatis.mapper;

import com.heima.springbootmybatis.domain.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AccountMapper {

    @Select("select * from account")
    public List<Account> findAll();
}
