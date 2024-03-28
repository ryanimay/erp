package com.erp.base.model.dto.security;

import com.erp.base.model.dto.response.DepartmentResponse;
import com.erp.base.model.entity.ClientModel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

//只用來做身分校驗的DTO，不放需要懶加載的相關屬性，如果需要都另外查詢
@Getter
@Setter
@NoArgsConstructor
public class ClientIdentityDto implements Serializable {
    @Serial
    private static final long serialVersionUID = -7L;
    private long id;
    private String username;
    private String password;
    private boolean isActive;
    private boolean isLock;
    private String email;
    private LocalDateTime lastLoginTime;
    private LocalDateTime createTime;
    private long createBy;
    private boolean mustUpdatePassword;
    private int attendStatus;
    private DepartmentResponse department = new DepartmentResponse();
//    private Set<RoleModel> roles;
//    private Set<NotificationModel> notifications;
//    private DepartmentModel department;


    public ClientIdentityDto(ClientModel model) {
        this.id = model.getId();
        this.username = model.getUsername();
        this.password = model.getPassword();
        this.isActive = model.isActive();
        this.isLock = model.isLock();
        this.email = model.getEmail();
        this.lastLoginTime = model.getLastLoginTime();
        this.createTime = model.getCreateTime();
        this.createBy = model.getCreateBy();
        this.mustUpdatePassword = model.isMustUpdatePassword();
        this.attendStatus = model.getAttendStatus();
        if(model.getDepartment() != null){
            this.department.setId(model.getDepartment().getId());
            this.department.setName(model.getDepartment().getName());
        }
    }
}
