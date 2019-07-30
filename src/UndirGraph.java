//Andre Barajas
//CECS 328
//Summer 2018
//This program implements an undirected graph and 
//includes operations such as Depth First Search 

public class UndirGraph
{
	private final int MAX_VERTS = 20;
	private Vertex vertexList[]; //Vertices array
	private int adjMat[][]; //Adjacency Matrix
	private int nVerts; //Vertices in current graph counter
	private StackX theStack;
	//Default Constructor with no parameters
	public UndirGraph()
	{
		vertexList = new Vertex[MAX_VERTS];
		adjMat = new int[MAX_VERTS][MAX_VERTS];
		nVerts = 0;
		
		for(int j = 0;j<MAX_VERTS; j++)
			for(int k = 0; k< MAX_VERTS; k++)
				adjMat[j][k] = 0;
		theStack = new StackX();
	}//Ending UndireGraph default constructor
	
	//adding element in graph with a char argument
	public void addVertex(char lab) 
	{
		vertexList[nVerts++] = new Vertex(lab);
	}
	
	//add edge with indicated start and finish parameters
	public void addEdge(int start, int end)
	{
		adjMat[start][end] = 1; 
		adjMat[end][start] = 1;
	}
	
	//print Vertex element
	public void printVertex(int v)
	{
		System.out.print(vertexList[v].label);
	}
	public void dfs() 
	{
		vertexList[0].wasVisited = true;//marking
		printVertex(0); //printing
		theStack.push(0);
		
		while(!theStack.isEmpty() ) 
		{
			//retrieve unvisited vertex adjacent to stack top 
			int v = getAdjUnvisitedVertex( theStack.peek() );
			if(v == -1)
				theStack.pop();
			else 
			{
				vertexList[v].wasVisited = true;
				printVertex(v);
				theStack.push(v);
			}
		}//end while
		//Stack is finished yay
		for(int j = 0; j < nVerts; j++)
			vertexList[j].wasVisited = false;
	}//ending DFS function
	//finds unvisited vertex adjacent to v
	public int getAdjUnvisitedVertex(int v)
	{
		for(int j = 0; j < nVerts; j++)
		{
			if(adjMat[v][j] == 1 && vertexList[j].wasVisited == false)
				return j;
		}
		return -1;
	}//Ending getAdjUnvisitedVertex method
}//Ending Undirected Graph
