package cn.itcast.jk.mapper;

import cn.itcast.jk.pojo.AccessLogP;
import cn.itcast.jk.pojo.AccessLogPExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccessLogPMapper {
    int countByExample(AccessLogPExample example);

    int deleteByExample(AccessLogPExample example);

    int deleteByPrimaryKey(String accessLogId);

    int insert(AccessLogP record);

    int insertSelective(AccessLogP record);

    List<AccessLogP> selectByExample(AccessLogPExample example);

    AccessLogP selectByPrimaryKey(String accessLogId);

    int updateByExampleSelective(@Param("record") AccessLogP record, @Param("example") AccessLogPExample example);

    int updateByExample(@Param("record") AccessLogP record, @Param("example") AccessLogPExample example);

    int updateByPrimaryKeySelective(AccessLogP record);

    int updateByPrimaryKey(AccessLogP record);
}