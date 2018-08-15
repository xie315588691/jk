package cn.itcast.jk.mapper;

import cn.itcast.jk.pojo.InvoiceC;
import cn.itcast.jk.pojo.InvoiceCExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InvoiceCMapper {
    int countByExample(InvoiceCExample example);

    int deleteByExample(InvoiceCExample example);

    int deleteByPrimaryKey(String invoiceId);

    int insert(InvoiceC record);

    int insertSelective(InvoiceC record);

    List<InvoiceC> selectByExample(InvoiceCExample example);

    InvoiceC selectByPrimaryKey(String invoiceId);

    int updateByExampleSelective(@Param("record") InvoiceC record, @Param("example") InvoiceCExample example);

    int updateByExample(@Param("record") InvoiceC record, @Param("example") InvoiceCExample example);

    int updateByPrimaryKeySelective(InvoiceC record);

    int updateByPrimaryKey(InvoiceC record);
}