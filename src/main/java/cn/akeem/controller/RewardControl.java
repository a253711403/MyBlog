package cn.akeem.controller;

import cn.akeem.constant.CodeType;
import cn.akeem.service.RewardService;
import cn.akeem.utils.DataMap;
import cn.akeem.utils.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zhangocean
 * @Date: 2019/7/14 15:42
 * Describe:
 */
@RestController
@Slf4j
public class RewardControl {

    @Autowired
    private RewardService rewardService;

    @PostMapping(value = "/getRewardInfo", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String getRewardInfo(){
        try {
            DataMap data = rewardService.getRewardInfo();
            return JsonResult.build(data).toJSON();
        } catch (Exception e){
            log.error("Get reward info exception", e);
        }
        return JsonResult.fail(CodeType.SERVER_EXCEPTION).toJSON();
    }

}
