package com.wells.ssm.mapper;

import com.wells.ssm.pojo.jobspecies;
import com.wells.ssm.pojo.jobspeciesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface jobspeciesMapper {
    long countByExample(jobspeciesExample example);

    int deleteByExample(jobspeciesExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(jobspecies record);

    int insertSelective(jobspecies record);

    List<jobspecies> selectByExample(jobspeciesExample example);

    jobspecies selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") jobspecies record, @Param("example") jobspeciesExample example);

    int updateByExample(@Param("record") jobspecies record, @Param("example") jobspeciesExample example);

    int updateByPrimaryKeySelective(jobspecies record);

    int updateByPrimaryKey(jobspecies record);
}