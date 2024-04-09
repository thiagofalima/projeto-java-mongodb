package com.projetomongodb.codes.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetomongodb.codes.domain.Post;
import com.projetomongodb.codes.repository.PostRepository;
import com.projetomongodb.codes.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired // Já instancia direto, mecanismo de injeção automática de dependência;
	private PostRepository repo;
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public List<Post> findByTitle(String text){
		return repo.searchTitle(text);
	}
}
