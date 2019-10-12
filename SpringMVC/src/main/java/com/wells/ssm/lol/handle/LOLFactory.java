package com.wells.ssm.lol.handle;

import org.apache.ibatis.reflection.factory.DefaultObjectFactory;

public class LOLFactory extends DefaultObjectFactory {
    @Override
    public <T> T create(Class<T> type) {
//        if (type == Piece.class) {
//            Piece piece = (Piece) super.create(type);
//            piece.setAa("×ª»¯ÁË");
//            return (T) piece;
//        }
        return super.create(type);
    }
}
