AI_LogicAgent
=============
1.	Summary of Design 
1.1	Environment
We have set 2 rooms: Room A, Room B, and an agent. Each of the room can be dirty (targeted as 0) or clean (targeted as 1), and the agent can be either of the room. So, we have 8 (2*2*2) states. 
1.2	Sensor 
The agent can sense the room is dirty or clean.
1.3	Actuators
If the room is clean, the agent will do No-op action
If the room is dirty, the agent will suck
After each time step, the agent will turn to another room( Left or Right) 
1.4	Simple reflex agent
Function SIMPLE_REFLEX_AGENT (percept) returns an action
  Persistent: rules (a set of condition-action rules)

state←INTERPRET-INPUT(percept)
rule←RULE-MATCH(state, rules)
action←rule.ACTION
return action
1.5	Performance score
The total agent life cycle is 1000 time steps
The performance measure awards one point for each clean square at each time step
2.	Brief Interface
2.1	Environment 
void addAgent(Agent agent) 
           Add an agent to the Environment. 
 void addEnvironmentObject(EnvironmentObject eo) 
           Add an EnvironmentObject to the Environment. 
 void addEnvironmentView(EnvironmentView ev) 
           Add a view on the Environment. 
 java.util.List<Agent> getAgents() 
           Returns the Agents belonging to this Environment. 
 java.util.List<EnvironmentObject> getEnvironmentObjects() 
           Returns the EnvironmentObjects that exist in this Environment. 
 double getPerformanceMeasure(Agent forAgent) 
           Retrieve the performance measure associated with an Agent. 
 boolean isDone() 
           Returns true if the Environment is finished with its current task(s). 
 void notifyViews(java.lang.String msg) 
           Notify all registered EnvironmentViews of a message. 
 void removeAgent(Agent agent) 
           Remove an agent from the environment. 
 void removeEnvironmentObject(EnvironmentObject eo) 
           Remove an EnvironmentObject from the Environment. 
 void removeEnvironmentView(EnvironmentView ev) 
           Remove a view on the Environment. 
 void step() 
           Move the Environment one time step forward. 
 void step(int n) 
           Move the Environment n time steps forward. 
 void stepUntilDone() 
           Step through time steps until the Environment has no more tasks.
2.2	Sensor
int getIsAclean() 
 int getIsBClean() 
 java.lang.String getPosition() 
 void setIsAclean(int isAclean) 
 void setIsBClean(int isBClean) 
     void setPosition(java.lang.String position)  
2.3	Actuators
Left:    public boolean isNoOp() {return false; }
Right: public boolean isNoOp() {return false; }
Suck:  public Suck(){	System.out.println("Sucking...");} 
public boolean isNoOp() {return false; }
2.4	Simple reflex agent
Time step: 1000 life cycle
Action execute(Percept percept) :Call the Agent's program, which maps any given percept sequences to an action. 
 boolean isAlive() : Life-cycle indicator as to the liveness of an Agent. 
 void setAlive(boolean alive) : Set the current liveness of the Agent.

AI_vacuum-cleaner
