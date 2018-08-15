package cn.itcast.jk.mapper;

import cn.itcast.jk.pojo.SysCodeB;
import cn.itcast.jk.pojo.SysCodeBExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysCodeBMapper {
    int countByExample(SysCodeBExample example);

    int deleteByExample(SysCodeBExample example);

    int deleteByPrimaryKey(String sysCodeId);

    int insert(SysCodeB record);

    int insertSelective(SysCodeB record);

    List<SysCodeB> selectByExample(SysCodeBExample example);

    SysCodeB selectByPrimaryKey(String sysCodeId);

    int updateByExampleSelective(@Param("record") SysCodeB record, @Param("example") SysCodeBExample example);

    int updateByExample(@Param("record") SysCodeB record, @Param("example") SysCodeBExample example);

    int updateByPrimaryKeySelective(SysCodeB record);

    int updateByPrimaryKey(SysCodeB record);
}