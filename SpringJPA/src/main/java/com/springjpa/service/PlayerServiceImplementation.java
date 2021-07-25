package com.springjpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springjpa.model.PlayerModel;
import com.springjpa.repository.PlayerRepository;

@Service
public class PlayerServiceImplementation implements PlayerService {

	@Autowired
	PlayerRepository playerrepo;

	@Override
	public List<PlayerModel> findAll() {

		return playerrepo.findAll();
	}

	@Override
	public PlayerModel save(PlayerModel model) {

		return playerrepo.save(model);
	}

	@Override
	public Optional<PlayerModel> findById(int id) {
		return playerrepo.findById(id);
	}

	@Override
	public void delete(int id) {

		playerrepo.deleteById(id);

	}

	@Override
	public PlayerModel getPhnum(String num) {
		return playerrepo.findByPhnum(num);
	}

	

}
