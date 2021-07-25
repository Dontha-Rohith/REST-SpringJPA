package com.springjpa.service;

import java.util.List;
import java.util.Optional;

import com.springjpa.model.PlayerModel;

public interface PlayerService {
	List<PlayerModel> findAll();

	PlayerModel save(PlayerModel model);

	Optional<PlayerModel> findById(int id);

	void delete(int id);
	
	PlayerModel getPhnum(String num);
	
	
}
