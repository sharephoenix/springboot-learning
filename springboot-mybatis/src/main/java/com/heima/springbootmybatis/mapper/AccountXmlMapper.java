package com.heima.springbootmybatis.mapper;

import com.heima.springbootmybatis.domain.Account;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AccountXmlMapper {

    public List<Account> findAll();
}
