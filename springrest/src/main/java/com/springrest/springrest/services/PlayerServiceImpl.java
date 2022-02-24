package com.springrest.springrest.services;

import java.util.ArrayList;


import java.util.List;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Player;


@Service
public class PlayerServiceImpl implements PlayerService {
	
	
List<Player> list;

	
	public PlayerServiceImpl() {
		list=new ArrayList<>();
		list.add(new Player(11,"Yami",21));
		list.add(new Player(22,"Asta",18));
		list.add(new Player(33,"Yuno",21));
		list.add(new Player(44,"Luck",18));
		list.add(new Player(55,"Magna",23));
		list.add(new Player(66,"Noelle",25));
		list.add(new Player(77,"Finral",26));
		list.add(new Player(88,"Vanessa",19));
		
		
	}

	@Override
	public List<Player> getPlayers() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Player getPlayer(Long playerId) {
		Player p= null;
		for(Player player:list)
		{
			if(player.getId()==playerId) 
			{
				p=player;
				break;
			}
		}
		
		return p;
	}

	@Override
	public Player updatePlayer(Player player) {
		list.forEach(e ->   {
			if(e.getId() == player.getId()) {
				e.setName(player.getName());
				e.setAge(player.getAge());
			}
		});
			
			return player;
		
	
	}

	@Override
	public ResponseEntity<HttpStatus> deletePlayer(long parseLong) {
		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		return null;
		
	}

}
