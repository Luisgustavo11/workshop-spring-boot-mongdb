package com.luisgustavo.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luisgustavo.workshopmongo.domain.Post;
import com.luisgustavo.workshopmongo.domain.User;
import com.luisgustavo.workshopmongo.repository.PostRepository;
import com.luisgustavo.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;

	public Post findById(String id) {
	    Optional<Post> user = repo.findById(id);
	    return user.orElseThrow(() -> new ObjectNotFoundException("Post não encontrado"));
	}	
}
