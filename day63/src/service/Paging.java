package service;

public class Paging {
	private int reqPage;				// ����ڰ� ��û�� ������
	private int totalBoard;				// �� �Խñ� ��
	private int boardCount = 10;		// �� �������� ����� �Խñ� ��
	private int totalPage;				// ��ü ������ ��
	private int offset;					// SQL���� �Խñ��� ������ ������
	private int pageCount = 10;			// �� �������� ����� ������ ��ȣ ��
	private int section;				// ������ ��ȣ ������ ������ index ����
	private int begin;					// �ش� section���� ù ������ ��ȣ
	private int end;					// �ش� section���� �� ������ ��ȣ
	private boolean prev, next;			// ����/���� section ���� ����
	
	public Paging(int reqPage, int totalBoard) {
		// 1. �ܺη� ���� ���� �޾ƾ� �ϴ� ������(��û ������, ��ü �� ��)
		this.reqPage = reqPage;
		this.totalBoard = totalBoard;
		
		// 2. ��ü ������ ���� ���Ѵ�
		totalPage = totalBoard / boardCount;
		totalPage += (totalBoard % boardCount == 0) ? 0 : 1;
		
		// 3. �Խñ��� ���ҿ� �ʿ��� offset�� ���Ѵ�
		offset = (reqPage - 1) * boardCount;
		
		// 4. ������ ���� ���� ������
		section = (reqPage - 1) / pageCount;
		begin = section * pageCount + 1;
		end = (section + 1) * pageCount;
		
		end = (end < totalPage) ? end : totalPage;
		
		// 5. ����/���� section�� �ִ��� �Ǻ�
		prev = section != 0;
		next = totalPage != end;
	}

	public int getReqPage() {
		return reqPage;
	}
	public void setReqPage(int reqPage) {
		this.reqPage = reqPage;
	}
	public int getTotalBoard() {
		return totalBoard;
	}
	public void setTotalBoard(int totalBoard) {
		this.totalBoard = totalBoard;
	}
	public int getBoardCount() {
		return boardCount;
	}
	public void setBoardCount(int boardCount) {
		this.boardCount = boardCount;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getSection() {
		return section;
	}

	public void setSection(int section) {
		this.section = section;
	}

	public int getBegin() {
		return begin;
	}

	public void setBegin(int begin) {
		this.begin = begin;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public boolean getPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	public boolean getNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}
	
}
