package cn.itcast.jk.mapper;

import cn.itcast.jk.pojo.ExtCproductC;
import cn.itcast.jk.pojo.ExtCproductCExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExtCproductCMapper {
    int countByExample(ExtCproductCExample example);

    int deleteByExample(ExtCproductCExample example);

    int deleteByPrimaryKey(String extCproductId);

    int insert(ExtCproductC record);

    int insertSelective(ExtCproductC record);

    List<ExtCproductC> selectByExample(ExtCproductCExample example);

    ExtCproductC selectByPrimaryKey(String extCproductId);

    int updateByExampleSelective(@Param("record") ExtCproductC record, @Param("example") ExtCproductCExample example);

    int updateByExample(@Param("record") ExtCproductC record, @Param("example") ExtCproductCExample example);

    int updateByPrimaryKeySelective(ExtCproductC record);

    int updateByPrimaryKey(ExtCproductC record);
}