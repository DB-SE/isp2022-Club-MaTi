public  class  LabeledNode  extends Node {
	
	private String label;

	

	public LabeledNode(String label) {
		this.label = label;
	}

	

	public String getLabel() {
		return this.label;
	}

	

	public void setLabel(String label) {
		this.label = label;
	}

	

	public String toString() {
		return this.label;
	}


}
