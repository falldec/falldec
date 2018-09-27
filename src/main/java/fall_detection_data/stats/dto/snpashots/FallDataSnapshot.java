package fall_detection_data.stats.dto.snpashots;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class FallDataSnapshot {

    private Long id;

    private Long pressureValue;

    private LocalDateTime creationTime;

}