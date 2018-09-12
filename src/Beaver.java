
public class Beaver {
	
	static String currentState = "a";
	static LinkedNode currentPosition = new LinkedNode(0,null,null);
	public static void main(String[]args) {
		
		int steps = 0;
		int ones = 0;
		while(!currentState.equalsIgnoreCase("h")) {
			
			instruction4State(currentPosition,currentState);
			steps++;
		}
		
		
		System.out.println(steps);
		
		while(currentPosition.getParentNode() != null) {
			currentPosition = currentPosition.getParentNode();
		}
		while(currentPosition != null) {
			
			if(currentPosition.getSymbol() == 1) {
				ones++;
			}
			currentPosition = currentPosition.getChildNode();
		}
		System.out.println(ones);
		
		
		
	}
	
	public static void instruction2State(LinkedNode position, String state) {
		
		if(state.equalsIgnoreCase("a")) {
			if(position.getSymbol() == 0) {
				
				Beaver.currentState = "b";
				Beaver.currentPosition.setSymbol(1);
				if(position.getChildNode() == null) {
					
					Beaver.currentPosition.setChildNode(new LinkedNode(0,Beaver.currentPosition,null));
					Beaver.currentPosition = Beaver.currentPosition.getChildNode();
				}
				else {
					Beaver.currentPosition = Beaver.currentPosition.getChildNode();
				}
			}
			else if(position.getSymbol() == 1) {
				Beaver.currentState ="b";
				Beaver.currentPosition.setSymbol(1);
				if(position.getParentNode() == null) {
					Beaver.currentPosition.setParentNode(new LinkedNode(0,null,Beaver.currentPosition));
					Beaver.currentPosition = Beaver.currentPosition.getParentNode();
				}
				else {
					Beaver.currentPosition = Beaver.currentPosition.getParentNode();
				}
			}
		}
		else if(state.equalsIgnoreCase("b")) {
			
			if(position.getSymbol() == 0) {
				Beaver.currentState = "a";
				Beaver.currentPosition.setSymbol(1);
				if(position.getParentNode() == null) {
					Beaver.currentPosition.setParentNode(new LinkedNode(0, null,Beaver.currentPosition));
					Beaver.currentPosition = Beaver.currentPosition.getParentNode();
				}
				else {
					Beaver.currentPosition = Beaver.currentPosition.getParentNode();
				}
			}
			else if(position.getSymbol() == 1) {
				Beaver.currentState ="h";
				Beaver.currentPosition.setSymbol(1);
				if(position.getChildNode() == null) {
					Beaver.currentPosition.setParentNode(new LinkedNode(0,Beaver.currentPosition, null));
					Beaver.currentPosition = Beaver.currentPosition.getChildNode();
				}
				else {
					Beaver.currentPosition = Beaver.currentPosition.getChildNode();
				}
			}
			
		}
		
	}
	
public static void instruction3State(LinkedNode position, String state) {
		
		if(state.equalsIgnoreCase("a")) {
			if(position.getSymbol() == 0) {
				
				Beaver.currentState = "b";
				Beaver.currentPosition.setSymbol(1);
				if(position.getChildNode() == null) {
					
					Beaver.currentPosition.setChildNode(new LinkedNode(0,Beaver.currentPosition,null));
					Beaver.currentPosition = Beaver.currentPosition.getChildNode();
				}
				else {
					Beaver.currentPosition = Beaver.currentPosition.getChildNode();
				}
			}
			else if(position.getSymbol() == 1) {
				Beaver.currentState ="h";
				Beaver.currentPosition.setSymbol(1);
				if(position.getChildNode() == null) {
					Beaver.currentPosition.setChildNode(new LinkedNode(0,Beaver.currentPosition,null));
					Beaver.currentPosition = Beaver.currentPosition.getChildNode();
				}
				else {
					Beaver.currentPosition = Beaver.currentPosition.getChildNode();
				}
			}
		}
		else if(state.equalsIgnoreCase("b")) {
			
			if(position.getSymbol() == 0) {
				Beaver.currentState = "c";
				Beaver.currentPosition.setSymbol(0);
				if(position.getChildNode() == null) {
					Beaver.currentPosition.setChildNode(new LinkedNode(0,Beaver.currentPosition,null));
					Beaver.currentPosition = Beaver.currentPosition.getChildNode();
				}
				else {
					Beaver.currentPosition = Beaver.currentPosition.getChildNode();
				}
			}
			else if(position.getSymbol() == 1) {
				Beaver.currentState ="b";
				Beaver.currentPosition.setSymbol(1);
				if(position.getChildNode() == null) {
					Beaver.currentPosition.setChildNode(new LinkedNode(0,Beaver.currentPosition, null));
					Beaver.currentPosition = Beaver.currentPosition.getChildNode();
				}
				else {
					Beaver.currentPosition = Beaver.currentPosition.getChildNode();
				}
			}
			
		}
		else if(state.equalsIgnoreCase("c")) {
			
			if(position.getSymbol() == 0) {
				Beaver.currentState = "c";
				Beaver.currentPosition.setSymbol(1);
				if(position.getParentNode() == null) {
					Beaver.currentPosition.setParentNode(new LinkedNode(0,null,Beaver.currentPosition));
					Beaver.currentPosition = Beaver.currentPosition.getParentNode();
				}
				else {
					Beaver.currentPosition = Beaver.currentPosition.getParentNode();
				}
			}
			else if(position.getSymbol() == 1) {
				Beaver.currentState ="a";
				Beaver.currentPosition.setSymbol(1);
				if(position.getParentNode() == null) {
					Beaver.currentPosition.setParentNode(new LinkedNode(0,null, Beaver.currentPosition));
					Beaver.currentPosition = Beaver.currentPosition.getParentNode();
				}
				else {
					Beaver.currentPosition = Beaver.currentPosition.getParentNode();
				}
			}
			
		}
		
		
	}

public static void instruction4State(LinkedNode position, String state) {
	
	if(state.equalsIgnoreCase("a")) {
		if(position.getSymbol() == 0) {
			
			Beaver.currentState = "b";
			Beaver.currentPosition.setSymbol(1);
			if(position.getChildNode() == null) {
				
				Beaver.currentPosition.setChildNode(new LinkedNode(0,Beaver.currentPosition,null));
				Beaver.currentPosition = Beaver.currentPosition.getChildNode();
			}
			else {
				Beaver.currentPosition = Beaver.currentPosition.getChildNode();
			}
		}
		else if(position.getSymbol() == 1) {
			Beaver.currentState ="b";
			Beaver.currentPosition.setSymbol(1);
			if(position.getParentNode() == null) {
				Beaver.currentPosition.setParentNode(new LinkedNode(0, null,Beaver.currentPosition));
				Beaver.currentPosition = Beaver.currentPosition.getParentNode();
			}
			else {
				Beaver.currentPosition = Beaver.currentPosition.getParentNode();
			}
		}
	}
	else if(state.equalsIgnoreCase("b")) {
		
		if(position.getSymbol() == 0) {
			Beaver.currentState = "a";
			Beaver.currentPosition.setSymbol(1);
			if(position.getParentNode() == null) {
				Beaver.currentPosition.setParentNode(new LinkedNode(0,null, Beaver.currentPosition));
				Beaver.currentPosition = Beaver.currentPosition.getParentNode();
			}
			else {
				Beaver.currentPosition = Beaver.currentPosition.getParentNode();
			}
		}
		else if(position.getSymbol() == 1) {
			Beaver.currentState ="c";
			Beaver.currentPosition.setSymbol(0);
			if(position.getParentNode() == null) {
				Beaver.currentPosition.setParentNode(new LinkedNode(0,null,Beaver.currentPosition));
				Beaver.currentPosition = Beaver.currentPosition.getParentNode();
			}
			else {
				Beaver.currentPosition = Beaver.currentPosition.getParentNode();
			}
		}
		
	}
	else if(state.equalsIgnoreCase("c")) {
		
		if(position.getSymbol() == 0) {
			Beaver.currentState = "h";
			Beaver.currentPosition.setSymbol(1);
			if(position.getParentNode() == null) {
				Beaver.currentPosition.setParentNode(new LinkedNode(0,null,Beaver.currentPosition));
				Beaver.currentPosition = Beaver.currentPosition.getParentNode();
			}
			else {
				Beaver.currentPosition = Beaver.currentPosition.getParentNode();
			}
		}
		else if(position.getSymbol() == 1) {
			Beaver.currentState ="d";
			Beaver.currentPosition.setSymbol(1);
			if(position.getParentNode() == null) {
				Beaver.currentPosition.setParentNode(new LinkedNode(0,null, Beaver.currentPosition));
				Beaver.currentPosition = Beaver.currentPosition.getParentNode();
			}
			else {
				Beaver.currentPosition = Beaver.currentPosition.getParentNode();
			}
		}
		
	}
	
	else if(state.equalsIgnoreCase("d")) {
		
		if(position.getSymbol() == 0) {
			Beaver.currentState = "d";
			Beaver.currentPosition.setSymbol(1);
			if(position.getChildNode() == null) {
				Beaver.currentPosition.setChildNode(new LinkedNode(0,Beaver.currentPosition,null));
				Beaver.currentPosition = Beaver.currentPosition.getChildNode();
			}
			else {
				Beaver.currentPosition = Beaver.currentPosition.getChildNode();
			}
		}
		else if(position.getSymbol() == 1) {
			Beaver.currentState ="a";
			Beaver.currentPosition.setSymbol(0);
			if(position.getChildNode() == null) {
				Beaver.currentPosition.setChildNode(new LinkedNode(0,Beaver.currentPosition,null));
				Beaver.currentPosition = Beaver.currentPosition.getChildNode();
			}
			else {
				Beaver.currentPosition = Beaver.currentPosition.getChildNode();
			}
		}
		
	}
	
	
}

}
