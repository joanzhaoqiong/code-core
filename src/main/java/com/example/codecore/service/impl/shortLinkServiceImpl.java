package com.example.codecore.service.impl;

import com.example.codecore.mapper.ShortLinkMapper;
import com.example.codecore.service.ShortLinkService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

public class shortLinkServiceImpl implements ShortLinkService {

    @Override
    public String generateShortLink(String originalUrl, Integer expireDays) {


      //这个方法是根据长码生成不同额短码，并且将这条数据保存起来
        if(originalUrl==null ||originalUrl.length()==0){
            return "请输入正确的长链接";
        }
        String code=getGeneralCode(originalUrl);
        return code;
    }

    @Override
    public String getOriginalUrl(String code) {
        return "";
    }

   //实现获取短短码的方法
    public String getGeneralCode(String originalUrl){
        ShortLinkMapper shortLinkMapper = null;
        String code = "";
        for(int i=0;i<3;i++){
            code = UUID.randomUUID().toString().replace("-", "").substring(0, 8);
            if(shortLinkMapper.selectById(code)==null){break;}
        }
        return code;
    }


}
