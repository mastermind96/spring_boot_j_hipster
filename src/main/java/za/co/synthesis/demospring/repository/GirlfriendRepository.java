package za.co.synthesis.demospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.synthesis.demospring.domain.Girlfriend;

@Repository
public interface GirlfriendRepository extends JpaRepository<Girlfriend, Long> {
}
