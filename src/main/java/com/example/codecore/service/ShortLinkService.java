package com.example.codecore.service;

import com.example.codecore.mapper.ShortLinkMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface  ShortLinkService {

    String generateShortLink(String originalUrl, Integer expireDays);


    String getOriginalUrl(String code);

}
