package ru.km.owm.dispatcher.dto.current;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record WeatherDto(int id, String main, String description, String icon) {
}
