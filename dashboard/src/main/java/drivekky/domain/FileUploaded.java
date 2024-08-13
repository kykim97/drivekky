package drivekky.domain;

import drivekky.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String name;
    private Long size;
    private String type;
    private Date createdTime;
    private String userId;
}
