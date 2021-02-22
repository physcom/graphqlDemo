package de.sandstorm.springboot.graphqldemo.repository;

import de.sandstorm.springboot.graphqldemo.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> { }
