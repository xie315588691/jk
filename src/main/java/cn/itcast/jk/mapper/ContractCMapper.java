package cn.itcast.jk.mapper;

import cn.itcast.jk.pojo.ContractC;
import cn.itcast.jk.pojo.ContractCExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContractCMapper {
    int countByExample(ContractCExample example);

    int deleteByExample(ContractCExample example);

    int deleteByPrimaryKey(String contractId);

    int insert(ContractC record);

    int insertSelective(ContractC record);

    List<ContractC> selectByExample(ContractCExample example);

    ContractC selectByPrimaryKey(String contractId);

    int updateByExampleSelective(@Param("record") ContractC record, @Param("example") ContractCExample example);

    int updateByExample(@Param("record") ContractC record, @Param("example") ContractCExample example);

    int updateByPrimaryKeySelective(ContractC record);

    int updateByPrimaryKey(ContractC record);
}