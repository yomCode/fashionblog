package com.aimcodes.fashionBlog.repositories;

import com.aimcodes.fashionBlog.entities.Category;
import com.aimcodes.fashionBlog.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findByCategory(Category category);

}
