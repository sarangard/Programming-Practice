/**
 * We construct the graph using an Adjacency Matrix
 * Operations are addEdge and bfs.
 * 
 * @author Sarang
 */
public class GraphBFS 
{
	private final int maxVertices = 20;
	private Vertex vertexList[];
	private int adjMatrix[][];
	private int vertexCount;
	private QueueUsingArray queue;
	
	/*
	 * Default Constructor
	 */
	public GraphBFS()
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
		
		queue = new QueueUsingArray(maxVertices);
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
	 * Breadth First Search
	 */
	public void bfs()
	{
		vertexList[0].visited = true;
		displayVertex(0);
		queue.EnQueue(0);
		int v2;
		
		while(!queue.isEmpty())
		{
			int v1 = queue.DeQueue();
			
			while( (v2=getAdjUnvisitedVertex(v1)) != -1)
			{
				vertexList[v2].visited = true;
				displayVertex(v2);
				queue.EnQueue(v2);
			}			
		}
		
		for(int j=0; j<vertexCount; j++)
		{
			vertexList[j].visited = false;
		}
	}

}
