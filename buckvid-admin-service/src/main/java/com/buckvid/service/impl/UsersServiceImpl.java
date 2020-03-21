package com.buckvid.service.impl;

import com.buckvid.mapper.BuckvidUsersMapper;
import com.buckvid.pojo.BuckvidUsers;
import com.buckvid.pojo.BuckvidUsersExample;
import com.buckvid.service.UsersService;
import com.buckvid.utils.PagedResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private BuckvidUsersMapper usersMapper;

    @Override
    public PagedResult queryUsers(BuckvidUsers user, Integer page, Integer pageSize) {
        String username = "";
        String nickname = "";
        if (user != null) {
            username = user.getUsername();
            nickname = user.getNickname();
        }

        PageHelper.startPage(page, pageSize);

        BuckvidUsersExample usersExample = new BuckvidUsersExample();
        BuckvidUsersExample.Criteria userCriteria = usersExample.createCriteria();
        if (StringUtils.isNotBlank(username)) {
            userCriteria.andUsernameLike("%" + username + "%");
        }
        if (StringUtils.isNotBlank(nickname)) {
            userCriteria.andNicknameLike("%" + nickname + "%");
        }

        List<BuckvidUsers> userList = usersMapper.selectByExample(usersExample);

        PageInfo<BuckvidUsers> pageList = new PageInfo<BuckvidUsers>(userList);

        PagedResult grid = new PagedResult();
        grid.setTotal(pageList.getPages());
        grid.setRows(userList);
        grid.setPage(page);
        grid.setRecords(pageList.getTotal());

        return grid;
    }
}
