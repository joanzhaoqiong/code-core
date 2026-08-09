package com.example.codecore.service.impl;

import com.example.codecore.mapper.ShortLinkMapper;
import com.example.codecore.service.ShortLinkService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

public class shortLinkServiceImpl implements ShortLinkService {

    @Override
    public String generateShortLink(String originalUrl, Integer expireDays) {

        if(originalUrl==null ||originalUrl.length()==0){
            return"请输入正确的长链接";
        }
        String code=getGernalCode(originalUrl);
        return code;
    }

    @Override
    public String getOriginalUrl(String code) {
        return "";
    }
//todo可以使用雪花算法,后期需要修改升级
    public String getGernalCode(String originalUrl){
        String code= UUID.randomUUID().toString().replace("-","");
        return code;
    }




}
