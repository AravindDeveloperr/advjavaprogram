package com.sathya.orm.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sathya.orm.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
