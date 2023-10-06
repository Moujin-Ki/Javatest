package ex06_interface04;

public class MySqlDao extends DataAccessObject {
	public void select() {
		System.out.println("MySql DB에서 검색");
	}
	public void insert() {
		System.out.println("MySql DB에서 삽입");
	}
	public void update() {
		System.out.println("MySql DB에서 수정");
	}
	public void delete() {
		System.out.println("MySql DB에서 삭제");
	}	
}
