package za.co.synthesis.demospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.synthesis.demospring.domain.House;

public interface HouseRepository extends JpaRepository<House,Long>{

}
