package com.ex.erp.dto.request;

import com.ex.erp.model.IBaseModel;

public interface IBaseDto<C extends IBaseModel > {
    C toModel();
}