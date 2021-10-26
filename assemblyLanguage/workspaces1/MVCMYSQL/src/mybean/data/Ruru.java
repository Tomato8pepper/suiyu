package mybean.data;
public class Ruru {
	String []columnName;
	String [][]tableRecord=null;
	int pageSize=1;
	int totalPages=1;
	int currentPage=1;
	public String[] getColumnName() {
		return columnName;
	}
	public void setColumnName(String[] columnName) {
		this.columnName = columnName;
	}
	public String[][] getTableRecord() {
		return tableRecord;
	}
	public void setTableRecord(String[][] tableRecord) {
		this.tableRecord = tableRecord;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	
}
