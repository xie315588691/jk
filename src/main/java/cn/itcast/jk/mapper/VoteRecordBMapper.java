package cn.itcast.jk.mapper;

import cn.itcast.jk.pojo.VoteRecordB;
import cn.itcast.jk.pojo.VoteRecordBExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VoteRecordBMapper {
    int countByExample(VoteRecordBExample example);

    int deleteByExample(VoteRecordBExample example);

    int deleteByPrimaryKey(String voteRecordId);

    int insert(VoteRecordB record);

    int insertSelective(VoteRecordB record);

    List<VoteRecordB> selectByExample(VoteRecordBExample example);

    VoteRecordB selectByPrimaryKey(String voteRecordId);

    int updateByExampleSelective(@Param("record") VoteRecordB record, @Param("example") VoteRecordBExample example);

    int updateByExample(@Param("record") VoteRecordB record, @Param("example") VoteRecordBExample example);

    int updateByPrimaryKeySelective(VoteRecordB record);

    int updateByPrimaryKey(VoteRecordB record);
}