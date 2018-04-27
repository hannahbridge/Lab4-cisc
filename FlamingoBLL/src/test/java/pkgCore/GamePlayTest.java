package pkgCore;
import pkgEnum.eGameType;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

import org.junit.Test;

public class GamePlayTest {

	private HashMap<UUID, Player> hash = new HashMap<UUID, Player>();
	@Test
	public void test() {
				
		Player player1 = new Player("Hannah", 1);
		Player player2 = new Player("Des", 2);
		
		Table table1 = new Table();
		
		table1.AddPlayerToTable(player1);
		table1.AddPlayerToTable(player2);
		
		table1.CreateDeck(eGameType.BLACKJACK);
		
		ArrayList<Player> pArray = new ArrayList<>();
		pArray.add(player1);
		pArray.add(player2);
		
		GamePlayBlackJack gamePlayBlackJack = new GamePlayBlackJack(table1);
		
		gamePlayBlackJack.AddPlayersToGame(pArray);
		
		assertEquals(gamePlayBlackJack.GetPlayerInGame(player2), player2); 
		
		gamePlayBlackJack.RemovePlayerFromGame(player2);
		assertEquals(gamePlayBlackJack.GetPlayerInGame(player2), null);
	}

}