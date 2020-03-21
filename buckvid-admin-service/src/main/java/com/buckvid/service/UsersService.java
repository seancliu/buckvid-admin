package com.buckvid.service;

import com.buckvid.pojo.BuckvidUsers;
import com.buckvid.utils.PagedResult;

public interface UsersService {
    public PagedResult queryUsers(BuckvidUsers user, Integer page, Integer pageSize);
}
