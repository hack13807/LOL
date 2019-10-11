package com.wells.lol.pojo;

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
     * ����ID
     */
    @Column(name = "fpieceid")
    private Long pieceId;

    /**
     * ְҵ����ID
     */
    @Column(name = "fjobid")
    private Long JobId;
}