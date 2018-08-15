package cn.itcast.jk.mapper;

import cn.itcast.jk.pojo.ExportProductC;
import cn.itcast.jk.pojo.ExportProductCExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExportProductCMapper {
    int countByExample(ExportProductCExample example);

    int deleteByExample(ExportProductCExample example);

    int deleteByPrimaryKey(String exportProductId);

    int insert(ExportProductC record);

    int insertSelective(ExportProductC record);

    List<ExportProductC> selectByExample(ExportProductCExample example);

    ExportProductC selectByPrimaryKey(String exportProductId);

    int updateByExampleSelective(@Param("record") ExportProductC record, @Param("example") ExportProductCExample example);

    int updateByExample(@Param("record") ExportProductC record, @Param("example") ExportProductCExample example);

    int updateByPrimaryKeySelective(ExportProductC record);

    int updateByPrimaryKey(ExportProductC record);
}