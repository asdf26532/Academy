select idx, userid, nick 
    from account order by idx desc;
    
select * from reply order by idx desc;

insert into 
    reply(b_idx, u_idx, contents)
    values(11801, 1003, '댓글 구현 중...');
    
insert into 
    reply(b_idx, u_idx, contents)
    values(11801, 1001, '테스트~~');
    
insert into 
    reply(b_idx, u_idx, contents)
    values(11800, 1001, '관리자 테스트 중');

commit;
