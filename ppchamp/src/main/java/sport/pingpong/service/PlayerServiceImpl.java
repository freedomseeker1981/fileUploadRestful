package sport.pingpong.service;

import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sport.pingpong.DAO.PlayerDAO;
import sport.pingpong.domain.Player;

@Service
public class PlayerServiceImpl implements PlayerService{

	@Autowired
	PlayerDAO pDAO;
	
	@Transactional
	@Override


	public Player getSandBox(Integer id) {
		pDAO.getAllPlayers();
		return null;
		
	}
	@Transactional

	@Override
	public Set<Player> getAllPlayers() {
		return pDAO.getAllPlayers();
	}
	
	@Transactional

	@Override
	public Player createNewPlayer(Player newPlayer) {
		return pDAO.createNewPlayer(newPlayer);
	}

}
