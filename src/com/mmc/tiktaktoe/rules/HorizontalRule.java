package com.mmc.tiktaktoe.rules;

import com.mmc.tiktaktoe.abstraction.Cell;

public class HorizontalRule implements Rule {

	@Override
	public Cell qualify(Cell[][] tickArray) {
		
		for (Cell[] array : tickArray) {
			if( array[0].equals( array[1] )  &&  array[1].equals( array[2] ) ) {
				System.out.println("Horisontal");
				array[0].setTakePartOfWon(true);
				array[1].setTakePartOfWon(true);
				array[2].setTakePartOfWon(true);
				return array[0];
			}
		}
		
		return null;
	}

}
