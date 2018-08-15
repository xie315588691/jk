package cn.itcast.jk.mapper;

import cn.itcast.jk.pojo.ShippingOrderC;
import cn.itcast.jk.pojo.ShippingOrderCExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShippingOrderCMapper {
    int countByExample(ShippingOrderCExample example);

    int deleteByExample(ShippingOrderCExample example);

    int deleteByPrimaryKey(String shippingOrderId);

    int insert(ShippingOrderC record);

    int insertSelective(ShippingOrderC record);

    List<ShippingOrderC> selectByExample(ShippingOrderCExample example);

    ShippingOrderC selectByPrimaryKey(String shippingOrderId);

    int updateByExampleSelective(@Param("record") ShippingOrderC record, @Param("example") ShippingOrderCExample example);

    int updateByExample(@Param("record") ShippingOrderC record, @Param("example") ShippingOrderCExample example);

    int updateByPrimaryKeySelective(ShippingOrderC record);

    int updateByPrimaryKey(ShippingOrderC record);
}