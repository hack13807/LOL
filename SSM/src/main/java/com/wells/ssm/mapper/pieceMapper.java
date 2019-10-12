package com.wells.ssm.mapper;

import com.wells.ssm.pojo.piece;
import com.wells.ssm.pojo.pieceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface pieceMapper {
    long countByExample(pieceExample example);

    int deleteByExample(pieceExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(piece record);

    int insertSelective(piece record);

    List<piece> selectByExample(pieceExample example);

    piece selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") piece record, @Param("example") pieceExample example);

    int updateByExample(@Param("record") piece record, @Param("example") pieceExample example);

    int updateByPrimaryKeySelective(piece record);

    int updateByPrimaryKey(piece record);
}