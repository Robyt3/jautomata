package net.jhoogland.jautomata.semirings;

public class BestPathWeights
{
	public PathWeight[] pathWeights;
	
	public BestPathWeights(PathWeight[] pathWeights) 
	{
		this.pathWeights = pathWeights;
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		if (obj instanceof BestPathWeights)
		{
			BestPathWeights other = (BestPathWeights) obj;
			for (int i = 0; i < this.pathWeights.length; i++) if (! this.pathWeights[i].equals(other.pathWeights[i])) return false;
			return true;
		}
		else return false;
	}
}


