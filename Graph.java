import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graph {
	private List<Node> nodes = new ArrayList<Node>();
	private int[] visited = new int[nodes.size()];
	private int currentComponent = 0;
	
	public Graph ( )
	{
	}
	
	public Graph ( List<Node> nodes )
	{
		this.nodes = nodes;
	}
	
	public List<Node> getNodes ()
	{
		return nodes;
	}
	
	public void addNode ( Node node )
	{
		nodes.add( node );
	}
	
	public void BFS ( Graph graph )
	{
		List<Node> nodes = graph.getNodes();
		visited = new int[nodes.size()];
		int[] components = new int[nodes.size()];
		currentComponent = 0;
		
		for (int i = 0; i < nodes.size(); i++)
		{
			if ( visited[i] == 0 )
			{
				Queue<Node> queue = new LinkedList<Node>();
				queue.add( nodes.get(i) );
				visited[ nodes.get(i).getValue() ] = 1;
				
				while ( !queue.isEmpty() )
				{
					Node node = (Node) queue.poll();
					visited[ node.getValue() ] = 2;
					components[ node.getValue() ] = currentComponent;
					
					System.out.println("Node: " + node.getValue() + ", Component: " + currentComponent);
					
					for ( Node child : node.getConnectedTo() )
					{
						if ( visited[ child.getValue() ] == 0 )
						{
							queue.add( child );
							visited[ child.getValue() ] = 1;
						}
					}
				}
				
				currentComponent++;
				System.out.println("------------------------------");
			}
		}
	}
	
	public void DFSOfAGraph ( Graph graph )
	{
		List<Node> nodes = graph.getNodes();
		visited = new int[nodes.size()];
		int[] components = new int[nodes.size()];
		int currentComponent = 0;
		
		for (int i = 0; i < nodes.size(); i++)
		{
			Node node = nodes.get(i);
			
			if (visited[node.getValue()] == 0)
			{
				DFS ( node, visited, components, currentComponent );
				currentComponent++;
				System.out.println("------------------------------");
			}
		}
	}
	
	public void DFS ( Node node, int[] visited, int[] components, int currentComponent )
	{
		if ( visited[node.getValue()] != 0 )
			return;
		
		visited[node.getValue()] = 1;
		components[node.getValue()] = currentComponent;
		
		System.out.println("Node: " + node.getValue() + ", Component: " + currentComponent);
		
		for (Node child : node.getConnectedTo())
		{
			if ( visited[child.getValue()] == 0)
				DFS ( child, visited, components, currentComponent );
		}
	}
	
	public int getComponent()
	{
		return currentComponent;
	}
}
