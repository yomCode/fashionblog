package com.aimcodes.fashionBlog.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "likes")
public class Like extends BaseEntity{
    @ManyToOne
    @JoinColumn(name = "comment_id", nullable = false)
    private Comment comment;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
