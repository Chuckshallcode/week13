package pet.store.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
@Entity
@Data
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long employee_id;
	private String employee_first_name;
	private String employee_last_name;
	private String employee_phone;
	private String employee_job_title;

@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "pet_store_id")
private PetStore petStore;
}