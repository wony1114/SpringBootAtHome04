package com.example.demo.cop.bbs.service;

import java.util.List;

import com.example.demo.cop.bbs.service.model.ArticleDto;
import com.example.demo.cop.bbs.service.model.ReplyDto;

import org.springframework.stereotype.Component;
@Component
public interface ArticleService {
    public void writeArticle(ArticleDto article);
    public void modifyArticle(ArticleDto article);
    public void removeArticle(ArticleDto article);
    public void writeReply(ReplyDto reply);
    public void removeReply(ReplyDto reply);
    public ArticleDto readArticle(int artId);
    public List<ReplyDto> readReply(int artId);
}
