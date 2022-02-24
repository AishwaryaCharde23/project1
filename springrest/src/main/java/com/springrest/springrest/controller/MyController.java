package com.springrest.springrest.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Player;
import com.springrest.springrest.entities.Team;
import com.springrest.springrest.services.PlayerService;
import com.springrest.springrest.services.TeamService;

@RestController
public class MyController {
	
	     @Autowired
		private TeamService teamSerivice;
	     
	     
	     @Autowired
			private PlayerService playerSerivice;

	@GetMapping("/home")
	public String home() {
		
		return"Welcome to this page";
		
	}
	     //Team
		@GetMapping("/teams")
		
		public List<Team> getTeams()
		{
			return this.teamSerivice.getTeams();
			
		}
		
		@GetMapping("/teams/{teamId}")
		public Team getTeam(@PathVariable String teamId) {
			
			return this.teamSerivice.getTeam(Long.parseLong(teamId));
			
		}
		
		//update Team using PUT request
		@PutMapping("/teams/{teamId}")
		public Team updateTeam(@RequestBody Team team,@PathVariable ("teamId") Long teamId) {
			return this.teamSerivice.updateTeam(team);
			
		}
//		
		//delete the Team
		@DeleteMapping("/teams/{teamId}")
		public ResponseEntity<HttpStatus> deleteTeam(@PathVariable String teamId){
			return this.teamSerivice.deleteTeam(Long.parseLong(teamId));
	
		}
		
		
		
		
		
		
		//player
				@GetMapping("/players")
				
				public List<Player> getPlayers()
				{
					
					return this.playerSerivice.getPlayers();
				}
				
				@GetMapping("/players/{playerId}")
				public Player getPlayer(@PathVariable String playerId) {
					
					return this.playerSerivice.getPlayer(Long.parseLong(playerId));
					
				}
				//update Player using PUT request
				@PutMapping("/players/{playerId}")
				public Player updatePlayer(@RequestBody Player player,@PathVariable ("playerId") Long playerId) {
					return this.playerSerivice.updatePlayer(player);
					
				}
				
				//delete the player
				@DeleteMapping("/players/{playerId}")
				public ResponseEntity<HttpStatus> deletePlayer(@PathVariable String playerId){
					return this.playerSerivice.deletePlayer(Long.parseLong(playerId));
					
				}
				
				
		

}
