public class Test 
{
	
	public static void main(String[] args)
	{
		Node node12 = new Node( 12 );
		Node node11 = new Node( 11 );
		Node node10 = new Node( 10 );
		Node node9 = new Node( 9 );
		Node node8 = new Node( 8 );
		Node node7 = new Node( 7 );
		Node node6 = new Node( 6 );
		Node node5 = new Node( 5 );
		Node node4 = new Node( 4 );
		Node node3 = new Node( 3 );
		Node node2 = new Node( 2 );
		Node node1 = new Node( 1 );
		Node node0 = new Node( 0 );
		
		node12.addNode( node11 );
		node12.addNode( node9 );
		
		node11.addNode( node12 );
		node11.addNode( node9 );
		
		node10.addNode( node9 );
		
		node9.addNode( node10 );
		node9.addNode( node12 );
		node9.addNode( node11 );
		
		node8.addNode( node7 );
		node7.addNode( node8 );
		
		node6.addNode( node0 );
		node6.addNode( node4 );
		
		node5.addNode( node0 );
		node5.addNode( node3 );
		node5.addNode( node4 );
		
		node4.addNode( node3 );
		node4.addNode( node5 );
		node4.addNode( node6 );
		
		node3.addNode( node4 );
		node3.addNode( node5 );
		
		node2.addNode( node0 );
		
		node1.addNode( node0 );
		
		node0.addNode( node5 );
		node0.addNode( node1 );
		node0.addNode( node2 );
		node0.addNode( node6 );
		
		Graph graph = new Graph();
		graph.addNode( node0 );
		graph.addNode( node1 );
		graph.addNode( node2 );
		graph.addNode( node3 );
		graph.addNode( node4 );
		graph.addNode( node5 );
		graph.addNode( node6 );
		graph.addNode( node7 );
		graph.addNode( node8 );
		graph.addNode( node9 );
		graph.addNode( node10 );
		graph.addNode( node11 );
		graph.addNode( node12 );
		
		graph.BFS( graph );
		graph.DFSOfAGraph( graph );
	}
	
}
