package com.example.mbs.services;

import com.example.mbs.models.screen.Screen;
import com.example.mbs.models.screen.specialscreen.SpecialScreen;
import com.example.mbs.responses.screen.specialscreen.SpecialScreenResponse;
import org.springframework.stereotype.Service;

@Service
public class SpecialScreenService {
    public SpecialScreenResponse getSpecialScreenResponse(Screen screen) {
        SpecialScreen specialScreen = screen.getSpecialScreen();
        if (specialScreen != null) {
            SpecialScreenResponse specialScreenResponse = new SpecialScreenResponse();
            specialScreenResponse.setSscreenName(specialScreen.getSscreenName());
            return specialScreenResponse;
        }
        return null;
    }
}
