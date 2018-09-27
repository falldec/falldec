package fall_detection_data.stats;

import fall_detection_data.stats.dto.snpashots.FallDataSnapshot;
import lombok.Getter;

import javax.annotation.PostConstruct;
import javax.inject.Named;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Named
@Getter
public class FallDataView {

    private List<FallDataSnapshot> fallDataSnapshots;

    @PostConstruct
    private void init() {
        fallDataSnapshots = dummyFallData();
    }

    private List<FallDataSnapshot> dummyFallData() {
        List<FallDataSnapshot> fallData = new ArrayList<>();
        fallData.add(new FallDataSnapshot(1L, 1013L, LocalDateTime.now()));
        fallData.add(new FallDataSnapshot(2L, 323L, LocalDateTime.now()));
        fallData.add(new FallDataSnapshot(3L, 432L, LocalDateTime.now()));
        fallData.add(new FallDataSnapshot(4L, 137L, LocalDateTime.now()));
        fallData.add(new FallDataSnapshot(5L, 813L, LocalDateTime.now()));
        fallData.add(new FallDataSnapshot(6L, 23L, LocalDateTime.now()));
        fallData.add(new FallDataSnapshot(7L, 968L, LocalDateTime.now()));
        fallData.add(new FallDataSnapshot(8L, 753L, LocalDateTime.now()));
        fallData.add(new FallDataSnapshot(9L, 65L, LocalDateTime.now()));
        fallData.add(new FallDataSnapshot(10L, 1022L, LocalDateTime.now()));
        return fallData;
    }
}