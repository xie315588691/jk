package cn.itcast.jk.mapper;

import cn.itcast.jk.pojo.ExtEproductC;
import cn.itcast.jk.pojo.ExtEproductCExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExtEproductCMapper {
    int countByExample(ExtEproductCExample example);

    int deleteByExample(ExtEproductCExample example);

    int deleteByPrimaryKey(String extEproductId);

    int insert(ExtEproductC record);

    int insertSelective(ExtEproductC record);

    List<ExtEproductC> selectByExample(ExtEproductCExample example);

    ExtEproductC selectByPrimaryKey(String extEproductId);

    int updateByExampleSelective(@Param("record") ExtEproductC record, @Param("example") ExtEproductCExample example);

    int updateByExample(@Param("record") ExtEproductC record, @Param("example") ExtEproductCExample example);

    int updateByPrimaryKeySelective(ExtEproductC record);

    int updateByPrimaryKey(ExtEproductC record);
}