package edu.unimeet.business.manager;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import edu.unimeet.business.service.CommentService;
import edu.unimeet.dto.CommentCreateDTO;
import edu.unimeet.dto.CommentViewDTO;
import edu.unimeet.dto.PostViewDTO;
import edu.unimeet.dto.UniDeptViewDto;
import edu.unimeet.entities.Comment;
import edu.unimeet.entities.Post;
import edu.unimeet.entities.User;
import edu.unimeet.repository.CommentRepository;
import edu.unimeet.repository.UniDeptRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CommentManager implements CommentService {
	
	private final CommentRepository commentRepository;
	
	
	@Override
	public List<CommentViewDTO> getAll() {
		// TODO Auto-generated method stub
		return commentRepository.findAll().stream().map(CommentViewDTO::of).collect(Collectors.toList());
	}


	@Override
	public CommentCreateDTO createcomment(CommentCreateDTO createcomment) {
		final Comment comment = new Comment(createcomment.getContent(),User.ofCreate(createcomment.getUsers()),Post.ofCreate(createcomment.getPosts()));
		commentRepository.save(comment);
		
		return CommentCreateDTO.of(comment);
	}

}
