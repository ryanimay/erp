package com.erp.base.model.dto.request;

import com.erp.base.model.entity.IBaseModel;
import org.springframework.data.jpa.domain.Specification;

public interface IBaseDto<C extends IBaseModel> {
    C toModel();

    Specification<C> getSpecification();
}
