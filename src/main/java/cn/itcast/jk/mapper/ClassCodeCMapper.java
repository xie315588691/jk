package cn.itcast.jk.mapper;

import cn.itcast.jk.pojo.ClassCodeC;
import cn.itcast.jk.pojo.ClassCodeCExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassCodeCMapper {
    int countByExample(ClassCodeCExample example);

    int deleteByExample(ClassCodeCExample example);

    int deleteByPrimaryKey(String classCodeId);

    int insert(ClassCodeC record);

    int insertSelective(ClassCodeC record);

    List<ClassCodeC> selectByExample(ClassCodeCExample example);

    ClassCodeC selectByPrimaryKey(String classCodeId);

    int updateByExampleSelective(@Param("record") ClassCodeC record, @Param("example") ClassCodeCExample example);

    int updateByExample(@Param("record") ClassCodeC record, @Param("example") ClassCodeCExample example);

    int updateByPrimaryKeySelective(ClassCodeC record);

    int updateByPrimaryKey(ClassCodeC record);
}