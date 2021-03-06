package com.wells.ssm.lol.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_piece_job")
public class PieceAndJob {
    @Id
    private Long fid;

    /**
     * 棋子ID
     */
    @Column(name = "fpieceid")
    private Long pieceId;

    /**
     * 职业种族ID
     */
    @Column(name = "fjobid")
    private Long JobId;
}
