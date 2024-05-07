select * from reply order by idx;

create view reply_view as
    select  R.idx, R.b_idx, R.contents, R.w_date, 
            A.idx as a_idx, A.userid, A.nick 
        from reply R
        inner join account A
        on R.u_idx = A.idx
        order by R.idx;
    
-- 지정 게시글의 댓글 수
select count(*) from reply_view where b_idx = 11801;

-- 지정 게시글의 댓글
select * from reply_view where b_idx = 11801;