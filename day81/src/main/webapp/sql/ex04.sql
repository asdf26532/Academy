select * from board_view order by idx;

create view board_reply as
    select  B.*, R.idx as r_idx, R.contents as r_contents, 
            R.w_date as r_date, R.a_idx, R.userid, R.nick as r_nick
        from board_view B
        left outer join reply_view R
        on B.idx = R.b_idx
        order by B.idx;

drop view board_reply;    
    
-- 댓글이 없는 게시글도    
select idx, title, nick, r_contents, r_nick
    from board_reply order by idx desc;
    
-- 댓글이 있는 게시글만
select idx, title, nick, r_contents, r_nick
    from board_reply 
    where r_idx is not null
    order by idx desc;
    
-- 댓글 수
select count(idx) from board_reply where idx = 11801;
    
    