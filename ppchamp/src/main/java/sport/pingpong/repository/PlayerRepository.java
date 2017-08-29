package sport.pingpong.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import sport.pingpong.domain.Player;

@Transactional
@Repository
public interface PlayerRepository extends CrudRepository<Player, Integer>{

	public List<Player> findAll();
}
