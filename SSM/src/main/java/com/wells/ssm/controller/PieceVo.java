package com.wells.ssm.controller;

import com.wells.ssm.pojo.Jobspecies;
import com.wells.ssm.pojo.Piece;

import java.util.List;

public class PieceVo {
    private Piece piece;
    private List<Jobspecies> jobspeciesList;

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Piece getPiece() {
        return piece;
    }

    public List<Jobspecies> getJobspeciesList() {
        return jobspeciesList;
    }

    public void setJobspeciesList(List<Jobspecies> jobspeciesList) {
        this.jobspeciesList = jobspeciesList;
    }
}
