package sport.pingpong.controllers;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import sport.pingpong.domain.Player;
import sport.pingpong.service.PlayerService;


@RestController
@RequestMapping("/player")
public class PlayerCtrl {

	
	@Autowired
	PlayerService pservice ;
	
	@RequestMapping("/getplayers")
	public Set<Player> getAllPlayers(){
		return pservice.getAllPlayers();
	}
	
	@RequestMapping(value="/createPlayer",method=RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public Player createNewPlayer(@RequestBody Player newPlayer){
		return pservice.createNewPlayer(newPlayer);
	}
	
	@RequestMapping(value="/getAllPlayers", method = RequestMethod.GET)
	public String getAllPlayersOnce(){
		return " hi all";
	}
}
