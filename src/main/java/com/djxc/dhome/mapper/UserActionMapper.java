package com.djxc.dhome.mapper;

import com.djxc.dhome.entity.UserAction;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserActionMapper {

    @Select("select username, action_type, action_time, bowser_type, use_time, action_result from user_actions")
    List<UserAction> selectAllActions();

    List<UserAction> selectAllActions(int page, int pageNum);
}
