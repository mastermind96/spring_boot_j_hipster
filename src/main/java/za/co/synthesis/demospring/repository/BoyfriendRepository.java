package za.co.synthesis.demospring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import za.co.synthesis.demospring.domain.Boyfriend;

@Repository
public interface BoyfriendRepository extends CrudRepository<Boyfriend, Long> {
}
