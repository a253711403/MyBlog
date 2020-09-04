package cn.akeem.controller;

import cn.akeem.constant.CodeType;
import cn.akeem.service.FriendLinkService;
import cn.akeem.utils.DataMap;
import cn.akeem.utils.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zhangocean
 * @Date: 2019/5/19 17:04
 * Describe: 友链页面
 */
@RestController
@Slf4j
public class FriendlyLinkControl {

    @Autowired
    FriendLinkService friendLinkService;

    /**
     * 获得所有友链信息
     */
    @PostMapping(value = "/getFriendLinkInfo", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String getFriendLink(){
        try {
            DataMap data = friendLinkService.getFriendLink();
            return JsonResult.build(data).toJSON();
        } catch (Exception e){
            log.error("Get friend links exception", e);
        }
        return JsonResult.fail(CodeType.SERVER_EXCEPTION).toJSON();
    }

}
