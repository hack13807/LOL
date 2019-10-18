package com.wells.ssm.mapper;

import com.wells.ssm.pojo.Jobspecies;
import com.wells.ssm.pojo.JobspeciesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobspeciesMapper {
    long countByExample(JobspeciesExample example);

    int deleteByExample(JobspeciesExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(Jobspecies record);

    int insertSelective(Jobspecies record);

    List<Jobspecies> selectByExample(JobspeciesExample example);

    Jobspecies selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") Jobspecies record, @Param("example") JobspeciesExample example);

    int updateByExample(@Param("record") Jobspecies record, @Param("example") JobspeciesExample example);

    int updateByPrimaryKeySelective(Jobspecies record);

    int updateByPrimaryKey(Jobspecies record);
}