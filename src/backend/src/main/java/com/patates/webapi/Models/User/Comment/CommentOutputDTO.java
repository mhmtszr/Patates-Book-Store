package com.patates.webapi.Models.User.Comment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentOutputDTO {
    private String commentId;
    private String name;
    private String commentHeader;
    private String comment;
    private double star;
}
