package cn.itcast.jk.mapper;

import cn.itcast.jk.pojo.FactoryC;
import cn.itcast.jk.pojo.FactoryCExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FactoryCMapper {
    int countByExample(FactoryCExample example);

    int deleteByExample(FactoryCExample example);

    int deleteByPrimaryKey(String factoryId);

    int insert(FactoryC record);

    int insertSelective(FactoryC record);

    List<FactoryC> selectByExampleWithBLOBs(FactoryCExample example);

    List<FactoryC> selectByExample(FactoryCExample example);

    FactoryC selectByPrimaryKey(String factoryId);

    int updateByExampleSelective(@Param("record") FactoryC record, @Param("example") FactoryCExample example);

    int updateByExampleWithBLOBs(@Param("record") FactoryC record, @Param("example") FactoryCExample example);

    int updateByExample(@Param("record") FactoryC record, @Param("example") FactoryCExample example);

    int updateByPrimaryKeySelective(FactoryC record);

    int updateByPrimaryKeyWithBLOBs(FactoryC record);

    int updateByPrimaryKey(FactoryC record);
}