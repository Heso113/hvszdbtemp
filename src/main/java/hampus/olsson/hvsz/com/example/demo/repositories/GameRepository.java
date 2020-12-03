package hampus.olsson.hvsz.com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import hampus.olsson.hvsz.com.example.demo.models.tables.Game;

public interface GameRepository extends JpaRepository<Game, Integer> {
    
}
