package com.jeefw.model.sys;

import core.support.ExtJSBaseParameter;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * NoticeInfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "notice_info", catalog = "jeefw")
@Cache(region = "all", usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@JsonIgnoreProperties(value = {"maxResults", "firstResult", "topCount", "sortColumns", "cmd", "queryDynamicConditions", "sortedConditions", "dynamicProperties", "success", "message", "sortColumnsString", "flag"})
public class NoticeInfo extends ExtJSBaseParameter {

    // Fields

    private Integer id;
    private Date timeStamp;
    private String noticeType;
    private Integer roomUseId;
    private String noticeContent;
    private Integer mark;

    // Constructors

    /**
     * default constructor
     */
    public NoticeInfo() {
    }

    /**
     * full constructor
     */
    public NoticeInfo(Date timeStamp, String noticeType, Integer roomId,
                      String noticeContent, Integer mark) {
        this.timeStamp = timeStamp;
        this.noticeType = noticeType;
        this.roomUseId = roomId;
        this.noticeContent = noticeContent;
        this.mark = mark;
    }

    // Property accessors
    @GenericGenerator(name = "generator", strategy = "increment")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "time_stamp", length = 19)
    public Date getTimeStamp() {
        return this.timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Column(name = "notice_type", length = 20)
    public String getNoticeType() {
        return this.noticeType;
    }

    public void setNoticeType(String noticeType) {
        this.noticeType = noticeType;
    }

    @Column(name = "room_use_id")
    public Integer getRoomUseId() {
        return this.roomUseId;
    }

    public void setRoomUseId(Integer roomUseId) {
        this.roomUseId = roomUseId;
    }

    @Column(name = "notice_content")
    public String getNoticeContent() {
        return this.noticeContent;
    }

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }

    @Column(name = "mark")
    public Integer getMark() {
        return this.mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

}