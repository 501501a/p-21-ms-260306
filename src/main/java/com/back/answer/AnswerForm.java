package com.back.answer;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnswerForm {
    @NotEmpty(message = "내용은 필수항목입니다.")
    private String content;
}

1) 먼저 답변을 등록하기 위해 필요한 폼인 AnswerForm을 다음과 같이 작성해 보자.
        여기까지 완료!!!!!!!!!