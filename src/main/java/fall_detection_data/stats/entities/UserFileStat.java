package fall_detection_data.stats.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserFileStat {

    private Long id;

    private String username;

    private LocalDateTime creationDate;

    private Integer numOfRecords;
}