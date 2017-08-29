package sport.pingpong.service;

import java.util.Set;

import sport.pingpong.domain.Player;

public interface PlayerService {

	public Player getSandBox(Integer id);
	public Set<Player> getAllPlayers();
	//public Player getPlayerByName(String name);
	public Player createNewPlayer(Player newPlayer);

	
}
