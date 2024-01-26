package com.erp.base.model.entity;

import com.erp.base.tool.DateTool;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
/**
 * 專案
 * */
@Entity
@Table(name = "project")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectModel implements IBaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "type")
    private String type;//1.開發案 2.維護案
    @Column(name = "create_time")
    private LocalDateTime createTime = DateTool.now();
    @Column(name = "create_by")
    private long createBy;
    @Column(name = "start_time")
    private LocalDateTime startTime;
    @Column(name = "end_time")
    private LocalDateTime endTime;
    @Column(name = "scheduled_start_time")
    private LocalDateTime scheduledStartTime;
    @Column(name = "scheduled_end_time")
    private LocalDateTime scheduledEndTime;
    @Column(name = "info")
    private String info;
    @ManyToOne
    @JoinColumn(name = "manager_id")
    private ClientModel Manager;
    @Column(name = "status", nullable = false)
    private String status = "1";//1.代辦 2.進行中 3.結案
}
