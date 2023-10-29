package com.projecthive.backend.services;

import com.projecthive.backend.payloads.CommentDto;

public interface CommentService {
	CommentDto createComment(CommentDto commentDto, Integer postId);

	void deleteComment(Integer commentId);
}
