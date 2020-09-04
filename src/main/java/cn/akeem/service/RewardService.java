package cn.akeem.service;

import cn.akeem.model.Reward;
import cn.akeem.utils.DataMap;

/**
 * @author: zhangocean
 * @Date: 2019/7/14 15:44
 * Describe:
 */
public interface RewardService {

    DataMap save(Reward reward);
    /**
     * 获得所有的募捐记录
     * @return
     */
    DataMap getRewardInfo();

    /**
     * 通过id删除募捐记录
     */
    DataMap deleteReward(int id);
}
