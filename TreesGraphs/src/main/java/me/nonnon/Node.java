package me.nonnon;

class Node {

	String name;
	Enum state;
	Node[] children;
	
	public Node(String n, int childrenSize) {
		name = n;	
		children = new Node[childrenSize];
	}
	
	public void addChildren(Node n) {
		for (int i = 0; i < children.length; i++) {			
			if (children[i] == null) {
				children[i] = n;
				break;
			}
			
		}
			
	}
}
