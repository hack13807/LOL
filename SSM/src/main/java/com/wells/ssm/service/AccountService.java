package com.wells.ssm.service;

import org.springframework.stereotype.Service;

public interface AccountService {

    public void transMoney(String fromName, String toName, double money);

    public double queryMoney(String name);
}
