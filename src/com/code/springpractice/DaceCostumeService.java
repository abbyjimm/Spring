package com.code.springpractice;

import java.util.Random;

public class DaceCostumeService implements CostumeService {
	private final String[] COSTUMES = {"Salsa", "Hip-Hop", "Jazz", "Regae"};
	@Override
	public String getCostume() {
		int idx = new Random().nextInt(COSTUMES.length);
		String random = (COSTUMES[idx]);
		return random + " costume";
	}

}
