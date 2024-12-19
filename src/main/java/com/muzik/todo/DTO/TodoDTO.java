package com.muzik.todo.DTO;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.regex.Pattern;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
// 일반적으로 Builder는 변수들을 DTO 만드는 작업에 많이 사용
// 일반적으로 ToString은 DTO 변수로 출력하는데 많이 사용
public class TodoDTO {

    private Integer id;             // 일련번호

    private String a;               // 제목

    private String b;               // 해야할 일

    //@DataTimeFormat(Pattern = "yyyy-MM-dd'")
    private LocalDate c;        // 날짜

    private String d;               // 중요도

    private String e;               // 상태

    private LocalDateTime regdate;  // 생성일자

    private LocalDateTime modDate;  // 수정일자

}