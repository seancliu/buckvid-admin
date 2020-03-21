package com.buckvid.pojo.vo;

import java.util.Date;

public class Reports {
    private String id;
    private String title;
    private String content;
    private Date timestamp;

    private String reportedUsername;

    private String reportedVideoId;
    private String videoDesc;
    private String videoPath;
    private Integer status;

    private String reporterUsername;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date createDate) {
        this.timestamp = createDate;
    }

    public String getReportedUsername() {
        return reportedUsername;
    }

    public void setReportedUsername(String dealUsername) {
        this.reportedUsername = dealUsername;
    }

    public String getReportedVideoId() {
        return reportedVideoId;
    }

    public void setReportedVideoId(String dealVideoId) {
        this.reportedVideoId = dealVideoId;
    }

    public String getVideoDesc() {
        return videoDesc;
    }

    public void setVideoDesc(String videoDesc) {
        this.videoDesc = videoDesc;
    }

    public String getVideoPath() {
        return videoPath;
    }

    public void setVideoPath(String videoPath) {
        this.videoPath = videoPath;
    }

    public String getReporterUsername() {
        return reporterUsername;
    }

    public void setReporterUsername(String submitUsername) {
        this.reporterUsername = submitUsername;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
