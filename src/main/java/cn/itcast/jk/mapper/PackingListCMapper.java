package cn.itcast.jk.mapper;

import cn.itcast.jk.pojo.PackingListC;
import cn.itcast.jk.pojo.PackingListCExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PackingListCMapper {
    int countByExample(PackingListCExample example);

    int deleteByExample(PackingListCExample example);

    int deleteByPrimaryKey(String packingListId);

    int insert(PackingListC record);

    int insertSelective(PackingListC record);

    List<PackingListC> selectByExample(PackingListCExample example);

    PackingListC selectByPrimaryKey(String packingListId);

    int updateByExampleSelective(@Param("record") PackingListC record, @Param("example") PackingListCExample example);

    int updateByExample(@Param("record") PackingListC record, @Param("example") PackingListCExample example);

    int updateByPrimaryKeySelective(PackingListC record);

    int updateByPrimaryKey(PackingListC record);
}