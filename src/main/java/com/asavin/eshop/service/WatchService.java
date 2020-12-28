package com.asavin.eshop.service;

import com.asavin.eshop.Entity.Watch;

public interface WatchService {
    boolean isValid(Watch watch);
    Watch save(Watch watch);
}
