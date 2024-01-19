package com.erp.base.service;

import com.erp.base.model.dto.request.procurement.ProcurementRequest;
import com.erp.base.model.dto.response.ApiResponse;
import com.erp.base.model.dto.response.PageResponse;
import com.erp.base.model.entity.ProcurementModel;
import com.erp.base.repository.ProcurementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProcurementService {
    private ProcurementRepository procurementRepository;
    @Autowired
    public void setProcurementRepository(ProcurementRepository procurementRepository){
        this.procurementRepository = procurementRepository;
    }

    public ResponseEntity<ApiResponse> findAll(ProcurementRequest request) {
        Page<ProcurementModel> pageResult = procurementRepository.findAll(request.getSpecification(), request.getPage());
        return ApiResponse.success(new PageResponse<>(pageResult, ProcurementModel.class));
    }
}
