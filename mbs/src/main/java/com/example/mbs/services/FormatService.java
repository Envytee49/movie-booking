package com.example.mbs.services;

import com.example.mbs.models.Format;
import com.example.mbs.models.screen.Screen;
import com.example.mbs.responses.FormatResponse;
import org.springframework.stereotype.Service;

@Service
public class FormatService {
    public FormatResponse getFormatResponse(Screen screen) {
        FormatResponse formatResponse = new FormatResponse();
        Format format = screen.getFormat();
        formatResponse.setFormatId(format.getFormatId());
        formatResponse.setFormatType(format.getFormatType());
        return formatResponse;
    }
}
