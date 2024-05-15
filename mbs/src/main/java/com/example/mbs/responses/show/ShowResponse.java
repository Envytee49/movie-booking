package com.example.mbs.responses.show;

import com.example.mbs.responses.screen.ScreenResponse;
import com.example.mbs.models.show.Show;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
@Data
@NoArgsConstructor
public class ShowResponse {
    private Integer showId;
    private Time startTime;
    private ScreenResponse screen;
}
