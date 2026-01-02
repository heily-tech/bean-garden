package com.beangarden.api.service;

import com.beangarden.api.domain.SystemStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Map;

@Service
public class StatusService {

    @Transactional(readOnly = true)
    public Map<String, Object> checkStatus() {
        SystemStatus systemStatus = new SystemStatus("BeanGarden API", "UP");

        return Map.of(
                "service", systemStatus.getServiceName(),
                "status", systemStatus.getStatus(),
                "checkedAt", LocalDateTime.now().toString());
    }
}