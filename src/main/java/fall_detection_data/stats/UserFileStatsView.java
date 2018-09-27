package fall_detection_data.stats;

import fall_detection_data.stats.entities.UserFileStat;
import lombok.Getter;

import javax.annotation.PostConstruct;
import javax.inject.Named;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Named
@Getter
public class UserFileStatsView {

    private List<UserFileStat> userFileStats;

    @PostConstruct
    private void init() {
        userFileStats = dummyStats();
    }

    private List<UserFileStat> dummyStats() {
        List<UserFileStat> exampleStats = new ArrayList<>();
        exampleStats.add(new UserFileStat(1L, "Paweł", LocalDateTime.now(), 123));
        exampleStats.add(new UserFileStat(2L, "Paweł", LocalDateTime.now(), 22));
        exampleStats.add(new UserFileStat(3L, "Paweł", LocalDateTime.now(), 1));
        exampleStats.add(new UserFileStat(4L, "PZ", LocalDateTime.now(), 8139));
        exampleStats.add(new UserFileStat(5L, "KOT", LocalDateTime.now(), 9696));
        exampleStats.add(new UserFileStat(6L, "Prezes", LocalDateTime.now(), 123456789));
        return exampleStats;
    }
}