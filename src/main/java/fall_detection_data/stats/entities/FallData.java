package fall_detection_data.stats.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class FallData {

    private Long id;

    private Long pressureValue;

    private LocalDateTime creationTime;

    // Foreign Key
    private Long userFileStatId;
}