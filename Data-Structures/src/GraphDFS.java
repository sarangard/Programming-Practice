/**
 * Basic Data Structure for DFS
 * 
 * @author Sarang
 */
class Vertex
{
	public char label;
	public boolean visited;
	
	public Vertex(char label)
	{
		this.label = label;
		visited = false;
	}
}


/**
 * We construct the graph using an Adjacency Matrix
 * Operations are addEdge and dfs.
 * 
 * @author Sarang
 */
public class GraphDFS 
{
	private final int maxVertices = 20;
	private Vertex vertexList[];
	private int adjMatrix[][];
	private int vertexCount;
	private StackUsingArray stack;
	
	/*
	 * Default Constructor
	 */
	public GraphDFS()
	{
		vertexList = new Vertex[maxVertices];
		adjMatrix = new int[maxVertices][maxVertices];
		vertexCount = 0;
		
		for(int y=0; y<maxVertices; y++)
		{
			for(int x=0; x<maxVertices; x++)
			{
				adjMatrix[x][y] = 0;
			}
		}
		
		stack = new StackUsingArray(maxVertices);
	}
	
	/*
	 * Adds a Vertex to the list of Vertices
	 */
	public void addVertex(char label)
	{
		vertexList[vertexCount++] = new Vertex(label);
	}
	
	/*
	 * Adds an edge to the AdjacencyMatrix
	 */
	public void addEdge(int start, int end)
	{
		adjMatrix[start][end] = 1;
		adjMatrix[end][start] = 1;
	}
	
	/*
	 * Displays the vertex
	 */
	public void displayVertex(int v)
	{
		System.out.println(vertexList[v].label);
	}
	
	/*
	 * returns a vertex if an adjacent vertex is found, 
	 * else returns -1
	 */
	public int getAdjUnvisitedVertex(int v)
	{
		for(int j=0; j<vertexCount; j++)
		{
			if(adjMatrix[v][j] == 1 && vertexList[j].visited == false)
				return j;
		}
		
		return -1;
	}
	
	/*
	 * Depth First Search
	 */
	public void dfs()
	{
		vertexList[0].visited = true;
		displayVertex(0);
		stack.push(0);
		
		while(!stack.isEmpty())
		{
			int v = getAdjUnvisitedVertex(stack.peek());
			
			if(v == -1)
			{
				stack.pop();
			}
			else
			{
				vertexList[v].visited = true;
				displayVertex(v);
				stack.push(v);				
			}
		}
		
		for(int j=0; j<vertexCount; j++)
		{
			vertexList[j].visited = false;
		}
	}

}
