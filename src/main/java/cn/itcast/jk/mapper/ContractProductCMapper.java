package cn.itcast.jk.mapper;

import cn.itcast.jk.pojo.ContractProductC;
import cn.itcast.jk.pojo.ContractProductCExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContractProductCMapper {
    int countByExample(ContractProductCExample example);

    int deleteByExample(ContractProductCExample example);

    int deleteByPrimaryKey(String contractProductId);

    int insert(ContractProductC record);

    int insertSelective(ContractProductC record);

    List<ContractProductC> selectByExample(ContractProductCExample example);

    ContractProductC selectByPrimaryKey(String contractProductId);

    int updateByExampleSelective(@Param("record") ContractProductC record, @Param("example") ContractProductCExample example);

    int updateByExample(@Param("record") ContractProductC record, @Param("example") ContractProductCExample example);

    int updateByPrimaryKeySelective(ContractProductC record);

    int updateByPrimaryKey(ContractProductC record);
}