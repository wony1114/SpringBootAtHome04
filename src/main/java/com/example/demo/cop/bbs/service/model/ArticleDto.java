package com.example.demo.cop.bbs.service.model;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Component
public class ArticleDto {
    protected int artId;
    protected String writerId, title, content, writtenDate, updatedDate;
}
