create table memo(
	id varchar2(20) not null, 
	email varchar2(20) not null, 
	content varchar2(100)
);

/*
Model
View
Controller

- ��Ű�� ���� ����
kr.or.kosa.dto
kr.or.kosa.dao
kr.or.kosa.controller
kr.or.kosa.service....
kr.or.kosa.util

1.DB -> Table ���� >> memo

1. DTO
2. DB(����)
3. DAO <-- controller ���
4. ����������(jsp/UI) (memo.html, memoList.jsp)


�۾��� -> writeServlet
��Ϻ��� -> ListServlet
etc

dbcp & pool & jndi����
web.xml
context.xml
user code

*/