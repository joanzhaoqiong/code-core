package com.example.codecore.service;

import com.example.codecore.mapper.ShortLinkMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface  ShortLinkService {

    // 生成短链：传入原始URL和过期天数（null表示永不过期），返回短码
    String generateShortLink(String originalUrl, Integer expireDays);

    // 根据短码获取原始URL（用于重定向）
    String getOriginalUrl(String code);

}
