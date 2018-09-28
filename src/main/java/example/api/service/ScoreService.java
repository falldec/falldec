package example.api.service;

import example.api.dto.requests.CreateScoreRowRequest;

public interface ScoreService {

    Long addNewScoreResult(CreateScoreRowRequest request);

}