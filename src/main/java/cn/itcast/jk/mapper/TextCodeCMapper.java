package cn.itcast.jk.mapper;

import cn.itcast.jk.pojo.TextCodeC;
import cn.itcast.jk.pojo.TextCodeCExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TextCodeCMapper {
    int countByExample(TextCodeCExample example);

    int deleteByExample(TextCodeCExample example);

    int deleteByPrimaryKey(String textCodeId);

    int insert(TextCodeC record);

    int insertSelective(TextCodeC record);

    List<TextCodeC> selectByExample(TextCodeCExample example);

    TextCodeC selectByPrimaryKey(String textCodeId);

    int updateByExampleSelective(@Param("record") TextCodeC record, @Param("example") TextCodeCExample example);

    int updateByExample(@Param("record") TextCodeC record, @Param("example") TextCodeCExample example);

    int updateByPrimaryKeySelective(TextCodeC record);

    int updateByPrimaryKey(TextCodeC record);
}