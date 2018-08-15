package cn.itcast.jk.mapper;

import cn.itcast.jk.pojo.UserTempB;
import cn.itcast.jk.pojo.UserTempBExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserTempBMapper {
    int countByExample(UserTempBExample example);

    int deleteByExample(UserTempBExample example);

    int deleteByPrimaryKey(String userTempId);

    int insert(UserTempB record);

    int insertSelective(UserTempB record);

    List<UserTempB> selectByExample(UserTempBExample example);

    UserTempB selectByPrimaryKey(String userTempId);

    int updateByExampleSelective(@Param("record") UserTempB record, @Param("example") UserTempBExample example);

    int updateByExample(@Param("record") UserTempB record, @Param("example") UserTempBExample example);

    int updateByPrimaryKeySelective(UserTempB record);

    int updateByPrimaryKey(UserTempB record);
}