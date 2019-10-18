package com.wells.ssm.mapper;

import com.wells.ssm.pojo.Piece;
import com.wells.ssm.pojo.PieceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PieceMapper {
    long countByExample(PieceExample example);

    int deleteByExample(PieceExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(Piece record);

    int insertSelective(Piece record);

    List<Piece> selectByExample(PieceExample example);

    Piece selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") Piece record, @Param("example") PieceExample example);

    int updateByExample(@Param("record") Piece record, @Param("example") PieceExample example);

    int updateByPrimaryKeySelective(Piece record);

    int updateByPrimaryKey(Piece record);
}