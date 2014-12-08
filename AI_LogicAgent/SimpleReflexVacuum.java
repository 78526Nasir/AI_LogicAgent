package com.bonus1.sqrl;


public class SimpleReflexVacuum implements Agent{
	private int count=0;
	private int isAClean=0;
	private int isBClean=0;

	@Override
	public Action execute(Percept percept) {
		count++;
		if(percept.getIsClean()==0){
			Suck suck=new Suck();
			return suck;
			
		}
		else{
			if(percept.getPosition().equals("A")){
				return new Right();
			}
			else{
				return new Left();
			}				
		}
		
	}
	
	@Override
	public boolean isAlive() {
		if(count<5){
			return true;
		}
		else
			return false;
	}
	@Override
	public void setAlive(boolean alive) {
		// TODO Auto-generated method stub
		
	}

	public int getIsAClean() {
		return isAClean;
	}

	public void setIsAClean(int isAClean) {
		this.isAClean = isAClean;
	}

	public int getIsBClean() {
		return isBClean;
	}

	public void setIsBClean(int isBClean) {
		this.isBClean = isBClean;
	}
}
