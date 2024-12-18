package com.muzik.todo.Util;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

// 연관성이 없는 클래스
// 클래스가 독집적인 프로그램으로 이용이된다.
@Component
public class PaginationUtil {
    /*------------------------------------------------------------------------
        함수명 : Map<Sting, Integer> Pagination(Page<?> page)
        인수 : 페이지정보
        결과 : 처음, 이전, 현재, 페이지 수, 다음, 마지막 정보
        내용 : 페이지 정보를 이용해서 HTML에 필요한 페이지정보 변수를 만즐어서 전달
    ------------------------------------------------------------------------*/
    public static Map<String, Integer> Pagination(Page<?> page) {

        // 데이터베이스 0,1,2,3.....      화면 1,2,3,4.....
        int currentPage = page.getNumber()+1;               // 현재 위치한 페이지 화면번호
        int totalPages = page.getTotalPages();              // 전체 페이지 번호
        int blockLimit = 5;                                 // HTML출력할 페이지 번호의 갯수

        Map<String, Integer> pageInfo = new HashMap<>();    // 저장할 변수

        // (1),2,3,4,5
        // (6),7,8,9,10
        int startPage = Math.max(1, currentPage-blockLimit/2);  // 시작 페이지 구하는 식

        // 1,2,3,4,(5)
        // 6,7,8,9,(10)
        int endPage = Math.min(totalPages, currentPage+blockLimit-1);  // 마지막 페이지 구하는 식

        // 이전 페이지 번호(현재페이지-1)
        int prevPage = Math.max(1, currentPage-1);

        // 다음 페이지 번호(현제페이지+1)
        int nextPage = Math.min(totalPages, currentPage+1);

        // 마지막 페이지 번호
        int lastPage = totalPages;

        // map에 변수 저장
        // .put("번수명", 값)
        pageInfo.put("startPage", startPage);
        pageInfo.put("endPage", endPage);
        pageInfo.put("prevPage", prevPage);
        pageInfo.put("nextPage", nextPage);
        pageInfo.put("lastPage", lastPage);
        pageInfo.put("currentPage", currentPage);

        return pageInfo;
    }


}
