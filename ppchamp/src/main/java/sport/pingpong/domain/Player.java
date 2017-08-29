package sport.pingpong.domain;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
@Entity
//@NamedQuery(query="from Player p", name = "FindAllPlayers")

public class Player {
	
	private Integer playerId;
	private String name;
	
	
	@Id
	@Column(name="player_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getPlayerId() {
		return playerId;
	}
	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}
	
	@Column(name="player_name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	// what is the cascade source and reflection here ?????
	
	

}
