package com.example.demo.repository;

import com.example.demo.dao.ForeignLanguageEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ForeignLanguageCourseRepository extends MongoRepository<ForeignLanguageEntity, String> {
}
