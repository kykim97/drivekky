package drivekky.domain;

import drivekky.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class VideoStreamed extends AbstractEvent {

    private Long id;
    private Long fileId;
    private String url;
}
