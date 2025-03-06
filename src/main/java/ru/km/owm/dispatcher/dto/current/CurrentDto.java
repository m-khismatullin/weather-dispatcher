package ru.km.owm.dispatcher.dto.current;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record CurrentDto(
    CoordDto coord,
    List<WeatherDto> weather,
    String base,
    MainDto main,
    int visibility,
    WindDto wind,
    RainSnowDto rain,
    RainSnowDto snow,
    long dt,
    SysDto sys,
    int timezone,
    long id,
    String name,
    String cod
) {
}
