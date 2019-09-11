package com.sudhirt.practice.testcontainers.repository;

import com.sudhirt.practice.testcontainers.entity.Author;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends PagingAndSortingRepository<Author, String> {
}