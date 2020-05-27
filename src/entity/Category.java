package entity;

/**
 * 消费类别类
 * @author Administrator
 *
 */

public class Category {
	private int id;  // 主键
	private String name;  //消费类别名称
	private int recordNumber;
	
	public Category() {}
	
	public Category(String _name) {
		this.name = _name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int _id) {
		this.id = _id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String _name) {
		this.name = _name;
	}
	
	public int getRecordNumber() {
		return recordNumber;
	}
	
	public void setRecordNumber(int _recordNumber) {
		this.recordNumber = _recordNumber;
	}
}
