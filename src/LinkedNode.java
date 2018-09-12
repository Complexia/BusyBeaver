
public class LinkedNode {
	
	
	
	
	int symbol;
	LinkedNode parentNode;
	LinkedNode childNode;
	public LinkedNode(int symbol,LinkedNode parentNode, LinkedNode childNode){
		this.symbol = symbol;
		this.parentNode = parentNode;		
		this.childNode = childNode;
	}
	
	
	public void setSymbol(int symbol) {
		this.symbol = symbol;
	}
	public int getSymbol() {
		return symbol;
	}
	
	public LinkedNode getParentNode() {
		return parentNode;
	}
	
	
	public void setChildNode(LinkedNode childNode) {
		this.childNode = childNode;
	}
	public LinkedNode getChildNode() {
		return childNode;
	}
	public void setParentNode(LinkedNode parentNode) {
		this.parentNode = parentNode;
	}
	
	

}
