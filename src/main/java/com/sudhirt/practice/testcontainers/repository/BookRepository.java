package com.sudhirt.practice.testcontainers.repository;

import com.sudhirt.practice.testcontainers.entity.Book;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends PagingAndSortingRepository<Book, String> {
}