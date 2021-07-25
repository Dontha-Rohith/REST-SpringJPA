package com.springjpa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springjpa.model.PlayerModel;
import com.springjpa.service.PlayerServiceImplementation;

@RestController
public class PlayerController {
	@Autowired
	PlayerServiceImplementation service;

	@RequestMapping("/")
	public String welcome() {
		return "Welcome";
	}

	@RequestMapping("/details")
	public List<PlayerModel> details() {
		List<PlayerModel> obj = service.findAll();
		System.out.println(obj);
		return obj;
	}

	@RequestMapping(value = "/saveplayer", produces = MediaType.APPLICATION_JSON_VALUE)
	public String savePlayer(@RequestBody PlayerModel player) {
		PlayerModel obj = new PlayerModel();
		if (player.getId() != 0) {
			obj.setId(player.getId());
		}
		obj.setProfileCd(player.getProfileCd());
		obj.setName(player.getName());
		obj.setDOB(player.getDOB());
		obj.setGender(player.getGender());
		obj.setTechnology(player.getTechnology());
		obj.setPrimarySkills(player.getPrimarySkills());
		obj.setSecondarySkills(player.getTechnology());
		obj.setExpMonths(player.getExpMonths());
		obj.setLocation(player.getLocation());
		obj.setPhnum(player.getPhnum());
		try {
			service.save(obj);
		} catch (Exception e) {
			return "Error while saving the data";
		}
		System.out.println(obj);
		return "Data saved successfully";
	}

	@RequestMapping(value = "/getplayer", produces = MediaType.TEXT_PLAIN_VALUE)
	public String getPlayer(@RequestBody String id) {

		Optional<PlayerModel> obj = service.findById(Integer.parseInt(id));
		System.out.println(obj);
		if (obj != null) {
			return "Data retrieved successfully";
		} else {
			return "Error while retrieving data";
		}
	}

	@RequestMapping(value = "/deleteplayer")
	public String deletePlayer(@RequestBody String id) {
		int num = Integer.parseInt(id);
		try {
			service.delete(num);
		} catch (Exception e) {
			return "Id does not exists";
		}
		return "Data deleted successfully";
	}

	@RequestMapping(value = "/findplayer")
	public PlayerModel findPlayer(@RequestBody String phNum) {

		PlayerModel obj = service.getPhnum(phNum);
		return obj;
	}
}
