package me.nonnon;

import java.util.LinkedList;

public class Q4_1 {
	// Given a directed graph, design an algorithm to find out whether there is a route between two nodes.
	
	
	enum State { Unvisited, Visited, Visiting };
	
	boolean search(Graph g, Node start, Node end) {
		if (start == end) return true;		
		
		// operates as Queue
		LinkedList<Node> q = new LinkedList<Node>();
		
		// set initial flag as Unvisited for all nodes
		for (Node u : g.nodes) {
			u.state = State.Unvisited;
		}
		start.state = State.Visiting;
		q.add(start);
		Node u;
		while (!q.isEmpty()) {
			u = q.removeFirst();
			if (u != null) {
				for (Node v : u.children) {
					if (v.state == State.Unvisited) {
						if (v == end) {
							return true;
						} else {
							v.state = State.Visiting;
							q.add(v);
						}
					}
				}
				u.state = State.Visited;
			}
		}
		return false;		
	}
	
	public static void main (String[] args) {
		
		Graph testGraph = new Graph();
		testGraph.nodes = new Node[4];
		
		// Adjacency list
		// a -> b
		// b -> c,d		
		
		Node a = new Node("a", 1);
		Node b = new Node("b", 2);
		Node c = new Node("c", 0);
		Node d = new Node("d", 0);
		
		a.addChildren(b);
		b.addChildren(c);
		b.addChildren(d);
		
		testGraph.nodes[0] = a;
		testGraph.nodes[1] = b;
		testGraph.nodes[2] = c;
		testGraph.nodes[3] = d;
		
//		for (Node x : testGraph.nodes) {
//			System.out.println(x.name);
//		}
//		System.out.println(b.children[1].name);
				
		
		Q4_1 answer = new Q4_1();
		boolean result = answer.search(testGraph, c, d);
		System.out.println(result);
		
	}
	
	
}
