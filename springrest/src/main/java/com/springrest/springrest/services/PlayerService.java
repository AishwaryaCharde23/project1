package com.springrest.springrest.services;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.springrest.springrest.entities.Player;



public interface PlayerService {
	

	public List<Player> getPlayers();

	public Player getPlayer(Long playerId);
	public Player updatePlayer(Player player);

	public ResponseEntity<HttpStatus> deletePlayer(long parseLong);

}
