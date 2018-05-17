package example.api;

import static java.lang.String.format;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import example.api.dto.requests.CreateScoreRowRequest;
import example.api.service.ScoreService;

@RestController(value = "/appexample")
public class ScoreboardController {

    private static final Logger LOG = Logger.getLogger(ScoreboardController.class.getName());

    private final ScoreService scoreService;

    public ScoreboardController(ScoreService scoreService) {
        this.scoreService = scoreService;
    }

    @PostMapping("/addNewResult")
    public Long addNewResult(CreateScoreRowRequest request) {
        LOG.info(format("Received request to add new result {request: %s}", request));

        return scoreService.addNewScoreResult(request);
    }
    
}
