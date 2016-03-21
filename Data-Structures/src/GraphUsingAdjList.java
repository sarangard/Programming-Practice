import java.util.ArrayList;

/**
 * Graphs using Adjacency Lists
 * Operations are addEdge.
 * 
 * Deleting an Edge is a complex process when using Adjacency Lists.
 * 
 * @author Sarang
 */
public class GraphUsingAdjList 
{
	private ArrayList<Integer> vertices;
	private SingleLinkedList[] edges;
	private int vertexCount;
	
	/*
	 * 
	 */
	public GraphUsingAdjList(int vertexCount)
	{
		this.vertexCount = vertexCount;
		vertices = new ArrayList<Integer>();
		edges = new SingleLinkedList[vertexCount];
		
		for(int i=0; i<this.vertexCount; i++)
		{
			vertices.add(i);
			edges[i] = new SingleLinkedList();
		}		
	}
	
	/*
	 * 
	 */
	public void addEdge(int source, int destination)
	{
		int i = vertices.indexOf(source);
		int j = vertices.indexOf(destination);
		
		if(i!=-1 || j!= -1)
		{
			edges[i].insertBegin(destination);
			edges[j].insertBegin(source);			
		}
	}	
}
