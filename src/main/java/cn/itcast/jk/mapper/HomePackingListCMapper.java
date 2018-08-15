package cn.itcast.jk.mapper;

import cn.itcast.jk.pojo.HomePackingListC;
import cn.itcast.jk.pojo.HomePackingListCExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HomePackingListCMapper {
    int countByExample(HomePackingListCExample example);

    int deleteByExample(HomePackingListCExample example);

    int deleteByPrimaryKey(String homePackingListId);

    int insert(HomePackingListC record);

    int insertSelective(HomePackingListC record);

    List<HomePackingListC> selectByExample(HomePackingListCExample example);

    HomePackingListC selectByPrimaryKey(String homePackingListId);

    int updateByExampleSelective(@Param("record") HomePackingListC record, @Param("example") HomePackingListCExample example);

    int updateByExample(@Param("record") HomePackingListC record, @Param("example") HomePackingListCExample example);

    int updateByPrimaryKeySelective(HomePackingListC record);

    int updateByPrimaryKey(HomePackingListC record);
}