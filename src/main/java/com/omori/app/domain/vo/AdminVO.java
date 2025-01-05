package com.omori.app.domain.vo;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class AdminVO {
    private Long questionId;
    private Long userId;
    private String questionTitle;
    private String questionContent;
    private String questionRegisterDatetime;
    private Boolean questionIsPublic;
    private Integer questionLikeCount;
    private String doctorDepartmentType;
    private Integer readCount;
}

