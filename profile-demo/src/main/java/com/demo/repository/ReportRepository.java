package com.demo.repository;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("file")
public interface ReportRepository {
    Report save(Report report);
}
