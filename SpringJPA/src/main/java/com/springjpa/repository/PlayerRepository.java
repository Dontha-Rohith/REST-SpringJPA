package com.springjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springjpa.model.PlayerModel;

@Repository
public interface PlayerRepository extends JpaRepository<PlayerModel, Integer> 
{
   PlayerModel findByPhnum(String phnum);
   
   @Query("select max(id) from rom_profile_management")
   int getId();
}
