package edu.unimeet.business.manager;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import edu.unimeet.business.service.LikeService;
import edu.unimeet.dto.CommentCreateDTO;
import edu.unimeet.dto.CommentViewDTO;
import edu.unimeet.dto.LikeCreateDTO;
import edu.unimeet.dto.LikeViewDTO;
import edu.unimeet.entities.Comment;
import edu.unimeet.entities.Like;
import edu.unimeet.entities.Post;
import edu.unimeet.entities.User;
import edu.unimeet.repository.CommentRepository;
import edu.unimeet.repository.LikeRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LikeManager implements LikeService {
	private final LikeRepository likeRepository;
	
	@Override
	public List<LikeViewDTO> getAll() {
		// TODO Auto-generated method stub
		 return likeRepository.findAll().stream().map(LikeViewDTO::of).collect(Collectors.toList());
	}

	@Override
	public LikeCreateDTO createLike(LikeCreateDTO likeCreateDTO) {
		// TODO Auto-generated method stub
		
		final Like like = new Like(User.ofCreate(likeCreateDTO.getUsers()),Post.ofCreate(likeCreateDTO.getPosts()));
		likeRepository.save(like);
		
		return LikeCreateDTO.of(like);
	}

}
