package example.api.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import example.api.dto.requests.CreateScoreRowRequest;
import example.api.entities.Score;

@Service
@Transactional
public class ScoreRepositoryService implements ScoreService {

    private final ScoreRepository scoreRepository;

    public ScoreRepositoryService(ScoreRepository scoreRepository) {
        this.scoreRepository = scoreRepository;
    }

    public Long addNewScoreResult(CreateScoreRowRequest request) {
        Score newScore = new Score(request.getDistance(), request.getActivityType());

        Score savedScore = scoreRepository.save(newScore);

        // USUŃ
        List<Score> scores = scoreRepository.findAll();
        for (Score score : scores) {
            System.out.println("score:" + score.getId());
        }

        ///

        return savedScore.getId();
    }
}