package ru.km.owm.dispatcher.dto.current;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record CoordDto(double lon, double lat) {
}
