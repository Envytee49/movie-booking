package com.example.mbs.responses.screen;

import com.example.mbs.responses.FormatResponse;
import com.example.mbs.responses.screen.specialscreen.SpecialScreenResponse;
import com.example.mbs.responses.TheatreResponse;
import com.example.mbs.models.screen.Screen;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ScreenResponse {
    private String screenName;
    private SpecialScreenResponse specialScreen;
    private FormatResponse format;
    private TheatreResponse theatre;
    public ScreenResponse(Screen screen) {
        this.screenName = screen.getScreenName();
        this.specialScreen = screen.getSpecialScreen() != null ? new SpecialScreenResponse(screen.getSpecialScreen()) : null;
        this.format = new FormatResponse(screen.getFormat());
        this.theatre = new TheatreResponse(screen.getTheatre());
    }
}
