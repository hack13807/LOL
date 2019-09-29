package com.wells.mapper;

import org.apache.ibatis.annotations.Param;

public interface AccountMapper {

    public double queryMoney(String name);

    public void update(@Param("name") String name, @Param("money")double money);
}
