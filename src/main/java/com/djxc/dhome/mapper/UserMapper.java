package com.djxc.dhome.mapper;

import com.djxc.dhome.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface UserMapper {
    @Select("select id, name, password, email, register_date, authority from consumer where id=#{id}")
    User selectById(int id);
}
