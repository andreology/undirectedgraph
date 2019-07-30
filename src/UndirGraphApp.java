//Andre Barajas
//CECS 328
//Summer 2018
//This program implements an undirected graph and 
//includes operations such as Depth First Search 

public class UndirGraphApp
{
	public static void main(String args[])
	{
		UndirGraph graph = new UndirGraph();
		graph.addVertex('A'); //0
		graph.addVertex('B');//1
		graph.addVertex('C');
		graph.addVertex('D');
		graph.addVertex('E');//4
		
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(0, 3);
		graph.addEdge(3, 4);
		
		System.out.print("Visiting Nodes: ");
		graph.dfs();
		System.out.println();
		

	}
}
