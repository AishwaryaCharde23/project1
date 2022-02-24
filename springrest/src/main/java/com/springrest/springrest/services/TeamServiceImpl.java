package com.springrest.springrest.services;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Team;

@Service
public class TeamServiceImpl implements TeamService {
	
List<Team> list;
	
	public TeamServiceImpl() {
		list=new ArrayList<>();
		list.add(new Team(145,"Blackhawks","Pune"));
		list.add(new Team(1455,"Blackclover","Nagpur"));
		
	}

	@Override
	public List<Team> getTeams() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Team getTeam(Long teamId) {
		
		Team t= null;
		for(Team team:list)
		{
			if(team.getId()==teamId) 
			{
				t=team;
				break;
			}
		}
		
		return t;
	}

	@Override
	public Team updateTeam(Team team) {
	list.forEach(e ->   {
		if(e.getId() == team.getId()) {
			e.setName(team.getName());
			e.setLocation(team.getLocation());
		}
	});
		
		return team;
	}

	@Override
	public ResponseEntity<HttpStatus> deleteTeam(long parseLong) {
		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		return null;
	
	}


}
