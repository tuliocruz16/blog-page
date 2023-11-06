package com.blog.blogpage.repositories;

import com.blog.blogpage.entities.Category;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    @Transactional
    @Modifying
    @Query(value = "DELETE FROM tb_category WHERE id = :categoryId", nativeQuery = true)
    void deleteCategoryById(Long categoryId);
}