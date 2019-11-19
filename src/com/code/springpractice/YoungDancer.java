package com.code.springpractice;

public class YoungDancer implements Dancer{
	
	/*Define a private field for dependency*/
	private CostumeService costumeService;
	
	/*Define a constructor for dependency injection*/
	public YoungDancer(CostumeService theCostumeService) {
		costumeService = theCostumeService;
	}
	
	@Override
	public String getTrainingSchedule() {
		return "Training from 5p.m. to 9p.m.";
	}

	@Override
	public String getCostumeDance() {
		//Use my fortuneService to get a fortune
		return costumeService.getCostume();
	}

}
