import java.util.ArrayList;
import java.util.List;

public class Node 
{
	private int value = -1;
	private List<Node> connectedTo = new ArrayList<Node>();
	
	public Node ( int value )
	{
		this.value = value;
	}
	
	public Node ( int value, List<Node> connectedTo )
	{
		this.value = value;
	}
	
	public int getValue ()
	{
		return value;
	}
	
	public List<Node> getConnectedTo ()
	{
		return connectedTo;
	}
	
	public void setConnectedTo (List<Node> nodes)
	{
		connectedTo = new ArrayList<Node>(nodes);
	}
	
	public void addNode ( Node node )
	{
		connectedTo.add(node);
	}
}
