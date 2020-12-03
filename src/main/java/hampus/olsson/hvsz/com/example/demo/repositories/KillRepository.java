package hampus.olsson.hvsz.com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import hampus.olsson.hvsz.com.example.demo.models.tables.Kill;

public interface KillRepository extends JpaRepository<Kill, Integer> {
    
}
