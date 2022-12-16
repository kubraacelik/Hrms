package kodlamaio.hrms.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="positions")
@Data
public class Position {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String positionName;
	
	public Position() {
		
	}
	
	public Position(int id, String positionName) {
		super();
		this.id = id;
		this.positionName = positionName;
	}
	
}
