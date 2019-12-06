package fr.efrei.TestJPA;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public class Repositery {

public interface Repository extends CrudRepository<Vehicule, Long> {
	
	List<Vehicule> findByPlateNumber(String PlateNumber);

}

}

