package com.example.mbs.services;

import com.example.mbs.models.screen.Screen;
import com.example.mbs.models.show.Show;
import com.example.mbs.responses.screen.ScreenResponse;
import org.springframework.stereotype.Service;

@Service
public class ScreenService {
    private final SpecialScreenService specialScreenService;
    private final TheatreService theatreService;
    private final FormatService formatService;
    public ScreenService(SpecialScreenService specialScreenService, TheatreService theatreService, FormatService formatService) {
        this.specialScreenService = specialScreenService;
        this.theatreService = theatreService;
        this.formatService = formatService;
    }

    public ScreenResponse getScreenResponse(Show show) {
        Screen screen = show.getScreen();
        ScreenResponse screenResponse = new ScreenResponse();
        screenResponse.setScreenName(screen.getScreenName());
        screenResponse.setSpecialScreenResponse(specialScreenService.getSpecialScreenResponse(screen));
        screenResponse.setTheatre(theatreService.getTheatreResponse(screen));
        screenResponse.setFormat(formatService.getFormatResponse(screen));
        return screenResponse;
    }

    public Boolean isScreenAtTheatre(Show show, int theatreId) {
        Screen screen = show.getScreen();
        return screen.getTheatre().getTheatreId() == theatreId;
    }
}
