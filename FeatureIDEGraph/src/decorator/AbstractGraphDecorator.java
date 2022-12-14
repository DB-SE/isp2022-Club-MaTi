package decorator;

import java.util.HashMap;
import java.util.List;

import edge.Edge;
import graph.IGraph;
import node.Node;

public abstract class AbstractGraphDecorator implements IGraph {
	
	protected IGraph graph;
	
	public AbstractGraphDecorator(IGraph graph) {
		this.graph = graph;
	}

	@Override
	public void addEdge(Edge edge) {
		this.graph.addEdge(edge);
	}

	@Override
	public void Traverse(Node start) {
		this.graph.Traverse(start);
	}

	@Override
	public IGraph MST() {
		return this.graph.MST();
	}
	

	@Override
	public HashMap<Node, List<Edge>> getEdgesByVertices() {
		// TODO Auto-generated method stub
		return this.graph.getEdgesByVertices();
	}

	@Override
	public List<Edge> getEdgesAsList() {
		// TODO Auto-generated method stub
		return this.graph.getEdgesAsList();
	}
	
	@Override
	public void getAdjacencyMatrix() {
		this.graph.getAdjacencyMatrix();
	}

	@Override
	public int getNumVertices() {
		// TODO Auto-generated method stub
		return this.graph.getNumVertices();
	}
}
