package cn.itcast.jk.mapper;

import cn.itcast.jk.pojo.FeedbackC;
import cn.itcast.jk.pojo.FeedbackCExample;
import cn.itcast.jk.pojo.FeedbackCWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FeedbackCMapper {
    int countByExample(FeedbackCExample example);

    int deleteByExample(FeedbackCExample example);

    int deleteByPrimaryKey(String feedbackId);

    int insert(FeedbackCWithBLOBs record);

    int insertSelective(FeedbackCWithBLOBs record);

    List<FeedbackCWithBLOBs> selectByExampleWithBLOBs(FeedbackCExample example);

    List<FeedbackC> selectByExample(FeedbackCExample example);

    FeedbackCWithBLOBs selectByPrimaryKey(String feedbackId);

    int updateByExampleSelective(@Param("record") FeedbackCWithBLOBs record, @Param("example") FeedbackCExample example);

    int updateByExampleWithBLOBs(@Param("record") FeedbackCWithBLOBs record, @Param("example") FeedbackCExample example);

    int updateByExample(@Param("record") FeedbackC record, @Param("example") FeedbackCExample example);

    int updateByPrimaryKeySelective(FeedbackCWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(FeedbackCWithBLOBs record);

    int updateByPrimaryKey(FeedbackC record);
}