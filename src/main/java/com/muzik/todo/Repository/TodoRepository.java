package com.muzik.todo.Repository;

import com.muzik.todo.Entity.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, Integer> {



}
/*
JPA는 필드명으로 쿼리를 작성해서 데이터베이스를 이용
.save() : id가 없으면 삽입, id가 존재하면 수정

.findBy필드명 : 조회 [
    .findById() : 기본키에 해당하는 레코드를 조회
    .findBySubject() : 해당필드(subject)로 값을 조회해서 레코드를 조회
    .findBySubjectAndContent(제목, 내용) : 제목과 내용에 값이 존재하면 레코드를 조회
    .findBySubjectOrContent(제목, 내용) : 제목 또는 내용에 값이 존재하면 레코드를 조회
]

.DeleteById() : 해당 기본키의 값의 레코드를 삭제



쿼리가 복잡하면 JPA에 한계 발생, 이때 Query문법으로 작성

*JPA 쿼리 작성법(SQL + Entity)
@Query(value="SELECT * FROM 테이블명 별칭 WHERE 변수명=값", nativeQuery=true)

*DataBase 쿼리 작성법
@Query("SELECT 별칭 FROM 테이블 별칭 WHERE 별칭.Entity변수명=조건)

*페이지 처리
Page<엔티티> findBy필드명(변수, Pageable pageable)

*정렬 처리

*/