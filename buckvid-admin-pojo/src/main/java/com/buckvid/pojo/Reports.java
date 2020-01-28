package com.buckvid.pojo;

import java.util.Date;

public class Reports {
    private String id;

    private String reportedUserId;

    private String reportedVideoId;

    private String title;

    private String content;

    private String reporterId;

    private Date timestamp;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getReportedUserId() {
        return reportedUserId;
    }

    public void setReportedUserId(String reportedUserId) {
        this.reportedUserId = reportedUserId == null ? null : reportedUserId.trim();
    }

    public String getReportedVideoId() {
        return reportedVideoId;
    }

    public void setReportedVideoId(String reportedVideoId) {
        this.reportedVideoId = reportedVideoId == null ? null : reportedVideoId.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getReporterId() {
        return reporterId;
    }

    public void setReporterId(String reporterId) {
        this.reporterId = reporterId == null ? null : reporterId.trim();
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}