package com.buckvid.service;

import com.buckvid.pojo.Bgm;
import com.buckvid.utils.PagedResult;

public interface VideoService {
    public void addBgm(Bgm bgm);

    public PagedResult queryBgmList(Integer page, Integer pageSize);

    public void deleteBgm(String id);

    public PagedResult queryReportList(Integer page, Integer pageSize);

    public void updateVideoStatus(String videoId, Integer status);
}
