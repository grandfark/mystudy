create table memo(
	id varchar2(20) not null, 
	email varchar2(20) not null, 
	content varchar2(100)
);

/*
Model
View
Controller

- 패키지 구조 정의
kr.or.kosa.dto
kr.or.kosa.dao
kr.or.kosa.controller
kr.or.kosa.service....
kr.or.kosa.util

1.DB -> Table 설계 >> memo

1. DTO
2. DB(연결)
3. DAO <-- controller 사용
4. 디자인파일(jsp/UI) (memo.html, memoList.jsp)


글쓰기 -> writeServlet
목록보기 -> ListServlet
etc

dbcp & pool & jndi구성
web.xml
context.xml
user code

*/