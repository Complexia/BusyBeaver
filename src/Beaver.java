import java.util.ArrayList;

public class Beaver {
	
	static String currentState = "a";
	static ArrayList<String> patternA = new ArrayList();
	static ArrayList<String> patternB = new ArrayList();
	static ArrayList<String> patternC = new ArrayList();
	static ArrayList<String> patternA1 = new ArrayList();
	static ArrayList<String> patternB1 = new ArrayList();
	static ArrayList<String> patternC1 = new ArrayList();
	static ArrayList<String> patternD0 = new ArrayList();
	static ArrayList<String> patternD1 = new ArrayList();
	static ArrayList<String> patternE0 = new ArrayList();
	static ArrayList<String> patternE1 = new ArrayList();
	static ArrayList<String> currentPattern = new ArrayList();
	static ArrayList<String> currentPatternA1 = new ArrayList();
	static ArrayList<String> currentPatternB0 = new ArrayList();
	static ArrayList<String> currentPatternB1 = new ArrayList();
	static ArrayList<String> currentPatternC0 = new ArrayList();
	static ArrayList<String> currentPatternC1 = new ArrayList();
	static ArrayList<String> currentPatternD0 = new ArrayList();
	static ArrayList<String> currentPatternD1 = new ArrayList();
	static ArrayList<String> currentPatternE0 = new ArrayList();
	static ArrayList<String> currentPatternE1 = new ArrayList();
	static LinkedNode currentPosition = new LinkedNode(0,null,null);
	public static void main(String[]args) {
		
		
		int steps = 0;
		int ones = 0;
		while(!currentState.equalsIgnoreCase("h")) {
			
			instruction3State(currentPosition,currentState);
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
				
				
				
				if(!currentPattern.isEmpty()) {					
					if(patternA.equals(currentPattern)) {
						System.out.println("looping");						
					}					
				}
				patternA = currentPattern;
				currentPattern = new ArrayList();				
				currentPattern.add("a0");
				currentPatternA1.add("a0");
				currentPatternB0.add("a0");
				currentPatternB1.add("a0");
				
				
				
				
				
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
				
				if(!currentPatternA1.isEmpty()) {					
					if(patternA1.equals(currentPatternA1)) {
						System.out.println("looping");						
					}					
				}
				patternA1 = currentPattern;
				currentPatternA1 = new ArrayList();				
				currentPattern.add("a1");
				currentPatternA1.add("a1");
				currentPatternB0.add("a1");
				currentPatternB1.add("a1");
				
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
				
				if(!currentPatternB0.isEmpty()) {					
					if(patternB.equals(currentPatternB0)) {
						System.out.println("looping");						
					}					
				}
				patternB = currentPatternB0;
				currentPatternB0 = new ArrayList();				
				currentPattern.add("b0");
				currentPatternA1.add("b0");
				currentPatternB0.add("b0");
				currentPatternB1.add("b0");
				
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
				String direction = "l";
				
				if(!currentPatternB1.isEmpty()) {					
					if(patternB1.equals(currentPatternB1)) {
						System.out.println("looping");						
					}					
				}
				patternB1 = currentPatternB1;
				currentPatternB1 = new ArrayList();				
				currentPattern.add("b1");
				currentPatternA1.add("b1");
				currentPatternB0.add("b1");
				currentPatternB1.add("b1");
				
				Beaver.currentState ="h"; //halt
				Beaver.currentPosition.setSymbol(1);
				if(direction.equalsIgnoreCase("r")) {
					if(position.getChildNode() == null) {				
						Beaver.currentPosition.setChildNode(new LinkedNode(0,Beaver.currentPosition,null));
						Beaver.currentPosition = Beaver.currentPosition.getChildNode();
					}
					else {
						Beaver.currentPosition = Beaver.currentPosition.getChildNode();
					}
				}
				else {
					if(position.getParentNode() == null) {
						Beaver.currentPosition.setParentNode(new LinkedNode(0, null,Beaver.currentPosition));
						Beaver.currentPosition = Beaver.currentPosition.getParentNode();
					}
					else {
						Beaver.currentPosition = Beaver.currentPosition.getParentNode();
					}
				}
			}
			
		}
		
	}
	
public static void instruction3State(LinkedNode position, String state) {
		
		if(state.equalsIgnoreCase("a")) {
			if(position.getSymbol() == 0) {
				
				
				if(!currentPattern.isEmpty()) {					
					if(patternA.equals(currentPattern)) {
						System.out.println("looping");						
					}					
				}
				patternA = currentPattern;
				currentPattern = new ArrayList();				
				currentPattern.add("a0");
				if(!currentPatternA1.isEmpty()) {
					currentPatternA1.add("a0");
				}
				
				if(!currentPatternB0.isEmpty()) {
					currentPatternB0.add("a0");
				}
				if(!currentPatternB1.isEmpty()) {
					currentPatternB1.add("a0");
				}
				if(!currentPatternC0.isEmpty()) {
					currentPatternC0.add("a0");
				}
				if(!currentPatternC1.isEmpty()) {
					currentPatternC1.add("a0");
				}
				
				
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
				
				if(!currentPatternA1.isEmpty()) {					
					if(patternA1.equals(currentPatternA1) && patternA1.size() >1) {
						System.out.println("looping");						
					}					
				}
				patternA1 = currentPatternA1;
				currentPatternA1 = new ArrayList();
				currentPatternA1.add("a1");
				
				if(!currentPattern.isEmpty()) {
					currentPattern.add("a1");
				}
				
				if(!currentPatternB0.isEmpty()) {
					currentPatternB0.add("a1");
				}
				if(!currentPatternB1.isEmpty()) {
					currentPatternB1.add("a1");
				}
				if(!currentPatternC0.isEmpty()) {
					currentPatternC0.add("a1");
				}
				if(!currentPatternC1.isEmpty()) {
					currentPatternC1.add("a1");
				}
				
				
				Beaver.currentState ="h"; //halt
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
				
				
				if(!currentPatternB0.isEmpty()) {					
					if(patternB.equals(currentPatternB0)) {
						System.out.println("looping");						
					}					
				}
				patternB = currentPatternB0;
				currentPatternB0 = new ArrayList();	
				currentPatternB0.add("b0");
				
				if(!currentPattern.isEmpty()) {
					currentPattern.add("b0");
				}
				
				if(!currentPatternA1.isEmpty()) {
					currentPatternA1.add("b0");
				}
				if(!currentPatternC0.isEmpty()) {
					currentPatternC0.add("b0");
				}
				if(!currentPatternC1.isEmpty()) {
					currentPatternC1.add("b0");
				}
				if(!currentPatternC1.isEmpty()) {
					currentPatternC1.add("a0");
				}
				
				
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
				
				if(!currentPatternB1.isEmpty()) {					
					if(patternB1.equals(currentPatternB1) && patternB1.size() > 1) {
						System.out.println("looping");						
					}					
				}
				patternB1 = currentPatternB1;
				currentPatternB1 = new ArrayList();	
				currentPatternB1.add("b1");
				
				if(!currentPattern.isEmpty()) {
					currentPattern.add("b1");
				}
				
				if(!currentPatternA1.isEmpty()) {
					currentPatternA1.add("b1");
				}
				if(!currentPatternB0.isEmpty()) {
					currentPatternB0.add("b1");
				}
				if(!currentPatternC0.isEmpty()) {
					currentPatternC0.add("b1");
				}
				if(!currentPatternC1.isEmpty()) {
					currentPatternC1.add("b1");
				}
				
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
				
				if(!currentPatternC0.isEmpty()) {					
					if(patternC.equals(currentPatternC0)) {
						System.out.println("looping");						
					}					
				}
				patternC = currentPatternC0;
				currentPatternC0 = new ArrayList();				
				currentPatternC0.add("c0");
				
				if(!currentPattern.isEmpty()) {
					currentPattern.add("c0");
				}
				
				if(!currentPatternA1.isEmpty()) {
					currentPatternA1.add("c0");
				}
				if(!currentPatternB0.isEmpty()) {
					currentPatternB0.add("c0");
				}
				if(!currentPatternB1.isEmpty()) {
					currentPatternB1.add("c0");
				}
				if(!currentPatternC1.isEmpty()) {
					currentPatternC1.add("c0");
				}
				
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
				
				if(!currentPatternC1.isEmpty()) {					
					if(patternC1.equals(currentPatternC1) && patternC1.size() > 1) {
						System.out.println("looping");						
					}					
				}
				patternC1 = currentPatternC1;
				currentPatternC1 = new ArrayList();
				currentPatternC1.add("c1");
				
				if(!currentPattern.isEmpty()) {
					currentPattern.add("c1");
				}
				
				if(!currentPatternA1.isEmpty()) {
					currentPatternA1.add("c1");
				}
				if(!currentPatternB0.isEmpty()) {
					currentPatternB0.add("c1");
				}
				if(!currentPatternB1.isEmpty()) {
					currentPatternB1.add("c1");
				}
				if(!currentPatternC0.isEmpty()) {
					currentPatternC0.add("c1");
				}
				
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
			String direction = "r";
			Beaver.currentState = "b";
			Beaver.currentPosition.setSymbol(1);
			if(direction.equalsIgnoreCase("r")) {
				if(position.getChildNode() == null) {				
					Beaver.currentPosition.setChildNode(new LinkedNode(0,Beaver.currentPosition,null));
					Beaver.currentPosition = Beaver.currentPosition.getChildNode();
				}
				else {
					Beaver.currentPosition = Beaver.currentPosition.getChildNode();
				}
			}
			else if(direction.equalsIgnoreCase("l")) {
				if(position.getParentNode() == null) {
					Beaver.currentPosition.setParentNode(new LinkedNode(0, null,Beaver.currentPosition));
					Beaver.currentPosition = Beaver.currentPosition.getParentNode();
				}
				else {
					Beaver.currentPosition = Beaver.currentPosition.getParentNode();
				}
			}
			
		}
		else if(position.getSymbol() == 1) {
			String direction = "l";
			Beaver.currentState ="b";
			Beaver.currentPosition.setSymbol(1);
			if(direction.equalsIgnoreCase("r")) {
				if(position.getChildNode() == null) {				
					Beaver.currentPosition.setChildNode(new LinkedNode(0,Beaver.currentPosition,null));
					Beaver.currentPosition = Beaver.currentPosition.getChildNode();
				}
				else {
					Beaver.currentPosition = Beaver.currentPosition.getChildNode();
				}
			}
			else if(direction.equalsIgnoreCase("l")) {
				if(position.getParentNode() == null) {
					Beaver.currentPosition.setParentNode(new LinkedNode(0, null,Beaver.currentPosition));
					Beaver.currentPosition = Beaver.currentPosition.getParentNode();
				}
				else {
					Beaver.currentPosition = Beaver.currentPosition.getParentNode();
				}
			}
		}
	}
	else if(state.equalsIgnoreCase("b")) {
		
		if(position.getSymbol() == 0) {
			String direction = "l";
			Beaver.currentState = "a";
			Beaver.currentPosition.setSymbol(1);
			if(direction.equalsIgnoreCase("r")) {
				if(position.getChildNode() == null) {				
					Beaver.currentPosition.setChildNode(new LinkedNode(0,Beaver.currentPosition,null));
					Beaver.currentPosition = Beaver.currentPosition.getChildNode();
				}
				else {
					Beaver.currentPosition = Beaver.currentPosition.getChildNode();
				}
			}
			else if(direction.equalsIgnoreCase("l")) {
				if(position.getParentNode() == null) {
					Beaver.currentPosition.setParentNode(new LinkedNode(0, null,Beaver.currentPosition));
					Beaver.currentPosition = Beaver.currentPosition.getParentNode();
				}
				else {
					Beaver.currentPosition = Beaver.currentPosition.getParentNode();
				}
			}
		}
		else if(position.getSymbol() == 1) {
			String direction = "l";
			Beaver.currentState ="c";
			Beaver.currentPosition.setSymbol(0);
			if(direction.equalsIgnoreCase("r")) {
				if(position.getChildNode() == null) {				
					Beaver.currentPosition.setChildNode(new LinkedNode(0,Beaver.currentPosition,null));
					Beaver.currentPosition = Beaver.currentPosition.getChildNode();
				}
				else {
					Beaver.currentPosition = Beaver.currentPosition.getChildNode();
				}
			}
			else if(direction.equalsIgnoreCase("l")) {
				if(position.getParentNode() == null) {
					Beaver.currentPosition.setParentNode(new LinkedNode(0, null,Beaver.currentPosition));
					Beaver.currentPosition = Beaver.currentPosition.getParentNode();
				}
				else {
					Beaver.currentPosition = Beaver.currentPosition.getParentNode();
				}
			}
		}
		
	}
	else if(state.equalsIgnoreCase("c")) {
		
		if(position.getSymbol() == 0) {
			String direction = "l";
			Beaver.currentState = "h";
			Beaver.currentPosition.setSymbol(1);
			if(direction.equalsIgnoreCase("r")) {
				if(position.getChildNode() == null) {				
					Beaver.currentPosition.setChildNode(new LinkedNode(0,Beaver.currentPosition,null));
					Beaver.currentPosition = Beaver.currentPosition.getChildNode();
				}
				else {
					Beaver.currentPosition = Beaver.currentPosition.getChildNode();
				}
			}
			else if(direction.equalsIgnoreCase("l")) {
				if(position.getParentNode() == null) {
					Beaver.currentPosition.setParentNode(new LinkedNode(0, null,Beaver.currentPosition));
					Beaver.currentPosition = Beaver.currentPosition.getParentNode();
				}
				else {
					Beaver.currentPosition = Beaver.currentPosition.getParentNode();
				}
			}
		}
		else if(position.getSymbol() == 1) {
			String direction = "l";
			Beaver.currentState ="d";
			Beaver.currentPosition.setSymbol(1);
			if(direction.equalsIgnoreCase("r")) {
				if(position.getChildNode() == null) {				
					Beaver.currentPosition.setChildNode(new LinkedNode(0,Beaver.currentPosition,null));
					Beaver.currentPosition = Beaver.currentPosition.getChildNode();
				}
				else {
					Beaver.currentPosition = Beaver.currentPosition.getChildNode();
				}
			}
			else if(direction.equalsIgnoreCase("l")) {
				if(position.getParentNode() == null) {
					Beaver.currentPosition.setParentNode(new LinkedNode(0, null,Beaver.currentPosition));
					Beaver.currentPosition = Beaver.currentPosition.getParentNode();
				}
				else {
					Beaver.currentPosition = Beaver.currentPosition.getParentNode();
				}
			}
		}
		
	}
	
	else if(state.equalsIgnoreCase("d")) {
		
		if(position.getSymbol() == 0) {
			String direction = "r";
			Beaver.currentState = "d";
			Beaver.currentPosition.setSymbol(1);
			if(direction.equalsIgnoreCase("r")) {
				if(position.getChildNode() == null) {				
					Beaver.currentPosition.setChildNode(new LinkedNode(0,Beaver.currentPosition,null));
					Beaver.currentPosition = Beaver.currentPosition.getChildNode();
				}
				else {
					Beaver.currentPosition = Beaver.currentPosition.getChildNode();
				}
			}
			else if(direction.equalsIgnoreCase("l")) {
				if(position.getParentNode() == null) {
					Beaver.currentPosition.setParentNode(new LinkedNode(0, null,Beaver.currentPosition));
					Beaver.currentPosition = Beaver.currentPosition.getParentNode();
				}
				else {
					Beaver.currentPosition = Beaver.currentPosition.getParentNode();
				}
			}
		}
		else if(position.getSymbol() == 1) {
			String direction = "r";
			Beaver.currentState ="a";
			Beaver.currentPosition.setSymbol(0);
			if(direction.equalsIgnoreCase("r")) {
				if(position.getChildNode() == null) {				
					Beaver.currentPosition.setChildNode(new LinkedNode(0,Beaver.currentPosition,null));
					Beaver.currentPosition = Beaver.currentPosition.getChildNode();
				}
				else {
					Beaver.currentPosition = Beaver.currentPosition.getChildNode();
				}
			}
			else if(direction.equalsIgnoreCase("l")) {
				if(position.getParentNode() == null) {
					Beaver.currentPosition.setParentNode(new LinkedNode(0, null,Beaver.currentPosition));
					Beaver.currentPosition = Beaver.currentPosition.getParentNode();
				}
				else {
					Beaver.currentPosition = Beaver.currentPosition.getParentNode();
				}
			}
		}
		
	}
	
	
}

public static void instruction5State(LinkedNode position, String state) {
	
	if(state.equalsIgnoreCase("a")) {
		if(position.getSymbol() == 0) {
			
			
			if(!currentPattern.isEmpty()) {					
				if(patternA.equals(currentPattern)) {
					System.out.println("looping");						
				}					
			}
			patternA = currentPattern;
			currentPattern = new ArrayList();				
			currentPattern.add("a0");
			if(!currentPatternA1.isEmpty()) {
				currentPatternA1.add("a0");
			}
			
			if(!currentPatternB0.isEmpty()) {
				currentPatternB0.add("a0");
			}
			if(!currentPatternB1.isEmpty()) {
				currentPatternB1.add("a0");
			}
			if(!currentPatternC0.isEmpty()) {
				currentPatternC0.add("a0");
			}
			if(!currentPatternC1.isEmpty()) {
				currentPatternC1.add("a0");
			}
			
			
			String direction = "l";
			Beaver.currentState = "b";
			Beaver.currentPosition.setSymbol(1);
			if(direction.equalsIgnoreCase("r")) {
				if(position.getChildNode() == null) {				
					Beaver.currentPosition.setChildNode(new LinkedNode(0,Beaver.currentPosition,null));
					Beaver.currentPosition = Beaver.currentPosition.getChildNode();
				}
				else {
					Beaver.currentPosition = Beaver.currentPosition.getChildNode();
				}
			}
			else if(direction.equalsIgnoreCase("l")) {
				if(position.getParentNode() == null) {
					Beaver.currentPosition.setParentNode(new LinkedNode(0, null,Beaver.currentPosition));
					Beaver.currentPosition = Beaver.currentPosition.getParentNode();
				}
				else {
					Beaver.currentPosition = Beaver.currentPosition.getParentNode();
				}
			}
			
		}
		else if(position.getSymbol() == 1) {
			currentPattern.add("a1");
			String direction = "l";
			Beaver.currentState ="a";
			Beaver.currentPosition.setSymbol(1);
			if(direction.equalsIgnoreCase("r")) {
				if(position.getChildNode() == null) {				
					Beaver.currentPosition.setChildNode(new LinkedNode(0,Beaver.currentPosition,null));
					Beaver.currentPosition = Beaver.currentPosition.getChildNode();
				}
				else {
					Beaver.currentPosition = Beaver.currentPosition.getChildNode();
				}
			}
			else if(direction.equalsIgnoreCase("l")) {
				if(position.getParentNode() == null) {
					Beaver.currentPosition.setParentNode(new LinkedNode(0, null,Beaver.currentPosition));
					Beaver.currentPosition = Beaver.currentPosition.getParentNode();
				}
				else {
					Beaver.currentPosition = Beaver.currentPosition.getParentNode();
				}
			}
		}
	}
	else if(state.equalsIgnoreCase("b")) {
		
		if(position.getSymbol() == 0) {
			currentPattern.add("b0");
			String direction = "r";
			Beaver.currentState = "c";
			Beaver.currentPosition.setSymbol(1);
			if(direction.equalsIgnoreCase("r")) {
				if(position.getChildNode() == null) {				
					Beaver.currentPosition.setChildNode(new LinkedNode(0,Beaver.currentPosition,null));
					Beaver.currentPosition = Beaver.currentPosition.getChildNode();
				}
				else {
					Beaver.currentPosition = Beaver.currentPosition.getChildNode();
				}
			}
			else if(direction.equalsIgnoreCase("l")) {
				if(position.getParentNode() == null) {
					Beaver.currentPosition.setParentNode(new LinkedNode(0, null,Beaver.currentPosition));
					Beaver.currentPosition = Beaver.currentPosition.getParentNode();
				}
				else {
					Beaver.currentPosition = Beaver.currentPosition.getParentNode();
				}
			}
		}
		else if(position.getSymbol() == 1) {
			currentPattern.add("b1");
			String direction = "r";
			Beaver.currentState ="b";
			Beaver.currentPosition.setSymbol(1);
			if(direction.equalsIgnoreCase("r")) {
				if(position.getChildNode() == null) {				
					Beaver.currentPosition.setChildNode(new LinkedNode(0,Beaver.currentPosition,null));
					Beaver.currentPosition = Beaver.currentPosition.getChildNode();
				}
				else {
					Beaver.currentPosition = Beaver.currentPosition.getChildNode();
				}
			}
			else if(direction.equalsIgnoreCase("l")) {
				if(position.getParentNode() == null) {
					Beaver.currentPosition.setParentNode(new LinkedNode(0, null,Beaver.currentPosition));
					Beaver.currentPosition = Beaver.currentPosition.getParentNode();
				}
				else {
					Beaver.currentPosition = Beaver.currentPosition.getParentNode();
				}
			}
		}
		
	}
	else if(state.equalsIgnoreCase("c")) {
		
		if(position.getSymbol() == 0) {
			currentPattern.add("c0");
			String direction = "l";
			Beaver.currentState = "a";
			Beaver.currentPosition.setSymbol(1);
			if(direction.equalsIgnoreCase("r")) {
				if(position.getChildNode() == null) {				
					Beaver.currentPosition.setChildNode(new LinkedNode(0,Beaver.currentPosition,null));
					Beaver.currentPosition = Beaver.currentPosition.getChildNode();
				}
				else {
					Beaver.currentPosition = Beaver.currentPosition.getChildNode();
				}
			}
			else if(direction.equalsIgnoreCase("l")) {
				if(position.getParentNode() == null) {
					Beaver.currentPosition.setParentNode(new LinkedNode(0, null,Beaver.currentPosition));
					Beaver.currentPosition = Beaver.currentPosition.getParentNode();
				}
				else {
					Beaver.currentPosition = Beaver.currentPosition.getParentNode();
				}
			}
		}
		else if(position.getSymbol() == 1) {
			currentPattern.add("c1");
			String direction = "r";
			Beaver.currentState ="d";
			Beaver.currentPosition.setSymbol(1);
			if(direction.equalsIgnoreCase("r")) {
				if(position.getChildNode() == null) {				
					Beaver.currentPosition.setChildNode(new LinkedNode(0,Beaver.currentPosition,null));
					Beaver.currentPosition = Beaver.currentPosition.getChildNode();
				}
				else {
					Beaver.currentPosition = Beaver.currentPosition.getChildNode();
				}
			}
			else if(direction.equalsIgnoreCase("l")) {
				if(position.getParentNode() == null) {
					Beaver.currentPosition.setParentNode(new LinkedNode(0, null,Beaver.currentPosition));
					Beaver.currentPosition = Beaver.currentPosition.getParentNode();
				}
				else {
					Beaver.currentPosition = Beaver.currentPosition.getParentNode();
				}
			}
		}
		
	}
	
	else if(state.equalsIgnoreCase("d")) {
		
		if(position.getSymbol() == 0) {
			currentPattern.add("d0");
			String direction = "l";
			Beaver.currentState = "a";
			Beaver.currentPosition.setSymbol(1);
			if(direction.equalsIgnoreCase("r")) {
				if(position.getChildNode() == null) {				
					Beaver.currentPosition.setChildNode(new LinkedNode(0,Beaver.currentPosition,null));
					Beaver.currentPosition = Beaver.currentPosition.getChildNode();
				}
				else {
					Beaver.currentPosition = Beaver.currentPosition.getChildNode();
				}
			}
			else if(direction.equalsIgnoreCase("l")) {
				if(position.getParentNode() == null) {
					Beaver.currentPosition.setParentNode(new LinkedNode(0, null,Beaver.currentPosition));
					Beaver.currentPosition = Beaver.currentPosition.getParentNode();
				}
				else {
					Beaver.currentPosition = Beaver.currentPosition.getParentNode();
				}
			}
		}
		else if(position.getSymbol() == 1) {
			currentPattern.add("d1");
			String direction = "r";
			Beaver.currentState ="e";
			Beaver.currentPosition.setSymbol(1);
			if(direction.equalsIgnoreCase("r")) {
				if(position.getChildNode() == null) {				
					Beaver.currentPosition.setChildNode(new LinkedNode(0,Beaver.currentPosition,null));
					Beaver.currentPosition = Beaver.currentPosition.getChildNode();
				}
				else {
					Beaver.currentPosition = Beaver.currentPosition.getChildNode();
				}
			}
			else if(direction.equalsIgnoreCase("l")) {
				if(position.getParentNode() == null) {
					Beaver.currentPosition.setParentNode(new LinkedNode(0, null,Beaver.currentPosition));
					Beaver.currentPosition = Beaver.currentPosition.getParentNode();
				}
				else {
					Beaver.currentPosition = Beaver.currentPosition.getParentNode();
				}
			}
		}
		
	}
	if(state.equalsIgnoreCase("e")) {
		if(position.getSymbol() == 0) {
			currentPattern.add("e0");
			String direction = "r";
			Beaver.currentState = "h"; //halt
			Beaver.currentPosition.setSymbol(1);
			if(direction.equalsIgnoreCase("r")) {
				if(position.getChildNode() == null) {				
					Beaver.currentPosition.setChildNode(new LinkedNode(0,Beaver.currentPosition,null));
					Beaver.currentPosition = Beaver.currentPosition.getChildNode();
				}
				else {
					Beaver.currentPosition = Beaver.currentPosition.getChildNode();
				}
			}
			else if(direction.equalsIgnoreCase("l")) {
				if(position.getParentNode() == null) {
					Beaver.currentPosition.setParentNode(new LinkedNode(0, null,Beaver.currentPosition));
					Beaver.currentPosition = Beaver.currentPosition.getParentNode();
				}
				else {
					Beaver.currentPosition = Beaver.currentPosition.getParentNode();
				}
			}
			
		}
		else if(position.getSymbol() == 1) {
			currentPattern.add("e1");
			String direction = "r";
			Beaver.currentState ="c";
			Beaver.currentPosition.setSymbol(0);
			if(direction.equalsIgnoreCase("r")) {
				if(position.getChildNode() == null) {				
					Beaver.currentPosition.setChildNode(new LinkedNode(0,Beaver.currentPosition,null));
					Beaver.currentPosition = Beaver.currentPosition.getChildNode();
				}
				else {
					Beaver.currentPosition = Beaver.currentPosition.getChildNode();
				}
			}
			else if(direction.equalsIgnoreCase("l")) {
				if(position.getParentNode() == null) {
					Beaver.currentPosition.setParentNode(new LinkedNode(0, null,Beaver.currentPosition));
					Beaver.currentPosition = Beaver.currentPosition.getParentNode();
				}
				else {
					Beaver.currentPosition = Beaver.currentPosition.getParentNode();
				}
			}
		}
	}
	
	
}

}
