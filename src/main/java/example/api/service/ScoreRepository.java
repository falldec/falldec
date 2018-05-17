package example.api.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import example.api.entities.Score;

@Repository
public interface ScoreRepository extends JpaRepository<Score, Long> {

}
