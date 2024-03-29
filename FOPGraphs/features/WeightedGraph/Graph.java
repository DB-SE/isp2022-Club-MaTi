
class Graph {

	
	public void addEdge(Edge edge) {
		if (!(edge instanceof WeightedEdge)) {
			original(new WeightedEdge(edge.getSource(), edge.getTarget(), 1));
			System.out.println(this.edgesByVertices.get(edge.getSource()));
			return;
		}
		
		original(edge);
	}

	public Graph MST() {
		
		Graph minGraph = new Graph();
		
		List<Node> included = new ArrayList<Node>();
			
		List<Edge> allEdges = this.getEdgesAsList();
		
		while(minGraph.getNumVertices() != this.getNumVertices())
		{
			int minWeight = 0;
			WeightedEdge minEdge = null;
		
			for(Edge edge : allEdges)
			{
				WeightedEdge weighted = (WeightedEdge) edge;
				if(included.isEmpty())
				{
					minGraph.addEdge(weighted);
					included.add(edge.getSource());
					included.add(edge.getTarget());
				}
				else if(included.contains(edge.getSource()) ^ included.contains(edge.getTarget()))
				{
					if(weighted.getWeight() <= minWeight)
					{
						minEdge = weighted;
					}
				}
			}
			
			minGraph.addEdge(minEdge);
			if(!included.contains(minEdge.getSource()))
			{
				included.add(minEdge.getSource());
			}
			if(!included.contains(minEdge.getTarget()))
			{
				included.add(minEdge.getTarget());
			}
		}
		
		return minGraph;
	}
}
