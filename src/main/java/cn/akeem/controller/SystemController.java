package cn.akeem.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 姚赛
 * @Date: 2020/9/4 18:20
 * @Version: 1.0
 */
@RestController
@Slf4j

public class SystemController {

    /**
     * 获取系统运行信息
     */
    @GetMapping(value = "/getSystemInfo", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String getSystemInfo() {
        return "";
    }
}
