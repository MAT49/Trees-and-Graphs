package me.nonnon;

import java.util.LinkedList;

public class Q4_1 {
	// Given a directed graph, design an algorithm to find out whether there is a route between two nodes.
	enum State { Unsisited, Visited, Visiting; }
	
	boolean search(Graph g, Node start, Node end) {
		if (start == end) return true;		
		
	}
	
	// operates as Queue
	LinkedList<Node> q = new LinkedList<Node>();
	
}
