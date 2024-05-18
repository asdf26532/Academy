package com.itbank.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Paging {
	private int offset, reqPage;
	private int totalBoard, perCount = 10;
	private int totalPage, perPage = 10;
	private int section, begin, end;
	private boolean prev, next;

	public Paging(int reqPage, int totalBoard) {
		this.reqPage = reqPage;
		this.totalBoard = totalBoard;
		
		offset = (reqPage - 1) * perCount;
		
		totalPage = totalBoard / perPage;
		totalPage += (totalBoard % perPage == 0) ? 0 : 1;
		
		section = (reqPage - 1) / perPage;
		begin = section * perPage + 1;
		end = (section + 1) * perPage;

		end = (end < totalPage) ? end : totalPage;
		
		prev = (section != 0);
		next = (end != totalPage); 
	}
}
