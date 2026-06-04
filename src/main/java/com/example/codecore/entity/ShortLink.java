package com.example.codecore.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@TableName("short_link")

public class ShortLink {

    @TableId
    private String code;
    private String originalUrl;
    private LocalDateTime createTime;
    private LocalDateTime expireTime;
    private Long visitCount;
}
