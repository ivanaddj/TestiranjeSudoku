package SudocuTest;

import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;


import nl.elridge.*;
import nl.elridge.sudoku.controller.ButtonController;
import nl.elridge.sudoku.model.Game;
import nl.elridge.sudoku.view.Sudoku;




public class TestoviSudoku {
	private static Game igra = new Game();
	private static ButtonController Buttons = new ButtonController();
	private static 
	
	@Before
	
	
	@Test
	public void prviTest() {
		igra.getSelectedNumber(x);
		assertEquals(x, selectedNumber());
	}
	
	@Test
	public void pomoc() {
		igra.isHelp(help);
		assertFalse(true);
	}
	
	@Test
	public void DugmeNovaIgra( ) {
		Buttons.actionPerformed(ActionEvent);
		assertDoesNotThrow(true,game.newGame());
	}
	
	@Test
	public void chekGameMetoda() {
		igra.checkGame();
		assertArrayEquals(true[], check[y][x] = game[y][x] == solution[y][x]);
	}
	
	@Test
	public void chekGameMetodaSelectedNumber() {
		igra.checkGame();
		if (Game.Selected)
	}
	
	

}


