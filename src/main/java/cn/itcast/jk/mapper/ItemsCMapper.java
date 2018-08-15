package cn.itcast.jk.mapper;

import cn.itcast.jk.pojo.ItemsC;
import cn.itcast.jk.pojo.ItemsCExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemsCMapper {
    int countByExample(ItemsCExample example);

    int deleteByExample(ItemsCExample example);

    int deleteByPrimaryKey(String itemsId);

    int insert(ItemsC record);

    int insertSelective(ItemsC record);

    List<ItemsC> selectByExample(ItemsCExample example);

    ItemsC selectByPrimaryKey(String itemsId);

    int updateByExampleSelective(@Param("record") ItemsC record, @Param("example") ItemsCExample example);

    int updateByExample(@Param("record") ItemsC record, @Param("example") ItemsCExample example);

    int updateByPrimaryKeySelective(ItemsC record);

    int updateByPrimaryKey(ItemsC record);
}