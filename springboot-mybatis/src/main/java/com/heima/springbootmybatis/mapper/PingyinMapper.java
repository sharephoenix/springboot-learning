package com.heima.springbootmybatis.mapper;

import com.heima.springbootmybatis.domain.Pingyin;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PingyinMapper {

    @Select("select * from pingyin")
    public List<Pingyin> getAllList();

    @Select("select * from pingyin.pingyin where hanzi=#{hanzi}")
    public List<Pingyin> getHanzi(String hanzi);

    @Insert("insert into pingyin(pingyin, hanzi) values (#{pingyin}, #{hanzi})")
    public int addHanzi(String hanzi, String pingyin);
}
