package com.wells.ssm.service;

import com.wells.ssm.mapper.PieceMapper;
import com.wells.ssm.pojo.Piece;
import com.wells.ssm.pojo.PieceExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PieceServiceImpl implements PieceService {

    @Resource
    private PieceMapper pieceMapper;

    @Override
    public List<Piece> queryPieceList() {
        PieceExample example = new PieceExample();
        PieceExample.Criteria criteria = example.createCriteria();
        List<Piece> pieces = pieceMapper.selectByExample(example);
        return pieces;
    }
}
