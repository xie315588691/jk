package cn.itcast.jk.mapper;

import cn.itcast.jk.pojo.ExportC;
import cn.itcast.jk.pojo.ExportCExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExportCMapper {
    int countByExample(ExportCExample example);

    int deleteByExample(ExportCExample example);

    int deleteByPrimaryKey(String exportId);

    int insert(ExportC record);

    int insertSelective(ExportC record);

    List<ExportC> selectByExample(ExportCExample example);

    ExportC selectByPrimaryKey(String exportId);

    int updateByExampleSelective(@Param("record") ExportC record, @Param("example") ExportCExample example);

    int updateByExample(@Param("record") ExportC record, @Param("example") ExportCExample example);

    int updateByPrimaryKeySelective(ExportC record);

    int updateByPrimaryKey(ExportC record);
}