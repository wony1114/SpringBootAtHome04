package com.example.demo.sts.service.model;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component @Getter @Setter
public class GradeDto{
    protected String kor, eng, math;
    protected int memberId;
}
