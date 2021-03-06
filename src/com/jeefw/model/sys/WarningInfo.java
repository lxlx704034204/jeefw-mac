package com.jeefw.model.sys;

import core.support.ExtJSBaseParameter;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * WarningInfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "warning_info", catalog = "jeefw")
@Cache(region = "all", usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@JsonIgnoreProperties(value = {"maxResults", "firstResult", "topCount", "sortColumns", "cmd", "queryDynamicConditions", "sortedConditions", "dynamicProperties", "success", "message", "sortColumnsString", "flag"})
public class WarningInfo extends ExtJSBaseParameter {

    // Fields

    private Integer id;
    private Date timeStamp;
    private String warningType;
    private Integer roomUseId;
    private String warningContent;
    private Integer mark;

    // Constructors

    /**
     * default constructor
     */
    public WarningInfo() {
    }

    /**
     * full constructor
     */
    public WarningInfo(Date timeStamp, String warningType, Integer roomUseId,
                       String warningContent, Integer mark) {
        this.timeStamp = timeStamp;
        this.warningType = warningType;
        this.roomUseId = roomUseId;
        this.warningContent = warningContent;
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

    @Column(name = "warning_type", length = 30)
    public String getWarningType() {
        return this.warningType;
    }

    public void setWarningType(String warningType) {
        this.warningType = warningType;
    }

    @Column(name = "room_use_id")
    public Integer getRoomUseId() {
        return this.roomUseId;
    }

    public void setRoomUseId(Integer roomUseId) {
        this.roomUseId = roomUseId;
    }

    @Column(name = "warning_content")
    public String getWarningContent() {
        return this.warningContent;
    }

    public void setWarningContent(String warningContent) {
        this.warningContent = warningContent;
    }

    @Column(name = "mark")
    public Integer getMark() {
        return this.mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

}