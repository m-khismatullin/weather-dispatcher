package ru.km.owm.dispatcher.dto.current;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record SysDto(
        int type,
        int id,
        String country,
        long sunrise,
        long sunset
) {
}
