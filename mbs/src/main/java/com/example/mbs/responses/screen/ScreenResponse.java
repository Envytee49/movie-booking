package com.example.mbs.responses.screen;

import com.example.mbs.responses.FormatResponse;
import com.example.mbs.responses.screen.specialscreen.SpecialScreenResponse;
import com.example.mbs.responses.theatre.TheatreResponse;
import com.example.mbs.models.screen.Screen;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ScreenResponse {
    private String screenName;
    private SpecialScreenResponse specialScreenResponse;
    private FormatResponse format;
    private TheatreResponse theatre;

}
