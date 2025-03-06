package ru.km.owm.dispatcher.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.km.owm.dispatcher.dto.current.CurrentDto;

@FeignClient(name = "owm-client", url = "${owm.url}")
public interface OwmClient {
    @RequestMapping(
            method = RequestMethod.GET,
            path = "/weather?appid={key}&lat={lat}&lon={lon}&units=metric&lang=ru"
    )
    CurrentDto getCurrent(
            @PathVariable("key") String apiKey,
            @PathVariable("lat") String latitude,
            @PathVariable("lon") String longitude
    );
}