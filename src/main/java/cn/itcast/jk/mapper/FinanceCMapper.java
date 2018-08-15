package cn.itcast.jk.mapper;

import cn.itcast.jk.pojo.FinanceC;
import cn.itcast.jk.pojo.FinanceCExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinanceCMapper {
    int countByExample(FinanceCExample example);

    int deleteByExample(FinanceCExample example);

    int deleteByPrimaryKey(String financeId);

    int insert(FinanceC record);

    int insertSelective(FinanceC record);

    List<FinanceC> selectByExample(FinanceCExample example);

    FinanceC selectByPrimaryKey(String financeId);

    int updateByExampleSelective(@Param("record") FinanceC record, @Param("example") FinanceCExample example);

    int updateByExample(@Param("record") FinanceC record, @Param("example") FinanceCExample example);

    int updateByPrimaryKeySelective(FinanceC record);

    int updateByPrimaryKey(FinanceC record);
}