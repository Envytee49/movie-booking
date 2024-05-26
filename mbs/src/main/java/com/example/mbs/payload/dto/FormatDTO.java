package com.example.mbs.payload.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FormatDTO {
    private Integer formatId;
    private String formatType;
}
