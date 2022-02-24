package com.springrest.springrest.services;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.springrest.springrest.entities.Team;

public interface TeamService {
	
		public List<Team> getTeams();

		public Team getTeam(Long teamId);

		public Team updateTeam(Team team);

		public ResponseEntity<HttpStatus> deleteTeam(long parseLong);

}

