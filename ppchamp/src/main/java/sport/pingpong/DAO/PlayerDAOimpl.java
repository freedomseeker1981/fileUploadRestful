package sport.pingpong.DAO;

import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NamedQuery;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import sport.pingpong.domain.Player;

@Repository
public class PlayerDAOimpl implements PlayerDAO {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public Set<Player> getAllPlayers() {
		Query query = em.createNamedQuery("FindAllPlayers");
		return (Set<Player>) query.getResultList();// check the type cast list to set ????
	}

	@Override
	public Player createNewPlayer(Player newPlayer) {
		try{
			/*if(em.contains(newPlayer))
				throw new NotNewObjectException(newPlayer);*/
			em.persist(newPlayer);
			em.flush();
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return newPlayer;
	}

}
