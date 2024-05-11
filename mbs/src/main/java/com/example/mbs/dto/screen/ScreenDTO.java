package com.example.mbs.dto.screen;

import com.example.mbs.dto.format.FormatDTO;
import com.example.mbs.dto.screen.specialscreen.SpecialScreenDTO;
import com.example.mbs.dto.theatre.TheatreDTO;
import com.example.mbs.models.format.Format;
import com.example.mbs.models.screen.Screen;
import com.example.mbs.models.screen.specialscreen.SpecialScreen;
import com.example.mbs.models.theatre.Theatre;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ScreenDTO {
    private String screenName;
    private SpecialScreenDTO specialScreen;
    private FormatDTO format;
    private TheatreDTO theatre;
    public ScreenDTO(Screen screen) {
        this.screenName = screen.getScreenName();
        this.specialScreen = screen.getSpecialScreen() != null ? new SpecialScreenDTO(screen.getSpecialScreen()) : null;
        this.format = new FormatDTO(screen.getFormat());
        this.theatre = new TheatreDTO(screen.getTheatre());
    }
}
