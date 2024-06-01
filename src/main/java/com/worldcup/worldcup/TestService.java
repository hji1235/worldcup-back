package com.worldcup.worldcup;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TestService {

    public String test() {

        log.info("TestService 호출");

        return "hahahaha@@";
    }
}
