package sport.pingpong.DAO;

import java.util.Set;

import sport.pingpong.domain.Player;

public interface PlayerDAO {
	
	public Set<Player> getAllPlayers();

	public Player createNewPlayer(Player newPlayer);

	
}
