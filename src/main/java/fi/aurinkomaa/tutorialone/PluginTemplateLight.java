/*
 * jos joku oikeesti haluu kopioita tai nähdä minun VERY basic harjoitus koodin siitä vaan kattelee tms.
 * - Mikimoka
 * Plugin toimii paperspigot 1.17.1 ainakin.
 * note self: osa asioista onkin aika samaa mitää oli silloin kun opiskelin vielä c++ eli toisin sanoen tämä on todella basicia
 * note self2: c++ aikoina asiat tosin tehtiin vain tyhmään konsoliin eli ei varsinaista itse ohjelmaa jolloinka siinä ei tullut sitten opittua esim. käyttöliittymän tekoa.
 * note self3: tai mitään OIKEAA OHJELMAAN eli ne oli sitten pitänyt opiskella sitten vielä itse, aika tyhmään. Kyllä koulutus pitäisi mennä niin sitten harjoitusohjelma esim laskin, peli tms.
 * note self4: c++ kokemus oli siis koulunpenkiltä noin 20vuotta sitten. Kukaan ei tule lukemaan näitäkään joten ihan sama. Jatketaan itse harjoitus ohjelmaa.
 */

package fi.aurinkomaa.tutorialone;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.mineacademy.fo.plugin.SimplePlugin;
import org.mineacademy.fo.remain.Remain;

public final class PluginTemplateLight extends SimplePlugin {

	//jos laittaa tänne variable ne ovat fieldejä
	//int omppu = 1;
	//plaha plka
	//psadads
	//commentti line 2 githuppi testi

	/**
	 * JAVADOCCI heeh
	 * päätit sitten hakea apple java doccin tällä ei nyt varsinaisesti ole mitään merkitystä koska kyseessä on vain testi java doc kommentoinnista.
	 */
	int apple = 5;

	public int something() {
		return -1;
	}

	/*
	 * nämä koodit suoritetaan heti ekana kun plugin käynnistää eli näkyvät konsolissa
	 */
	@Override
	protected void onPluginStart() {
		//asetataan numero variable 1
		int numero = 1;
		int numer = 1;

		//while looppi eli suoritetaan tätä niin pitkään kun numero on pienempi kuin 1
		while (numero < 20) {
			//tulostetaan number is 1, joka kerta lisätään samaan lukuun yksi
			System.out.println("number is " + numero++);

			//tulostetaan number is 2 jo ensimmäisellä kerralla, joka kerta lisätään samaan lukuunvariableen yksi
			//toisin sanoen tuloksena number is 2 ja sen jälkeen tulee number is 2 toisen kerran yksinkertainen syy ++ ennen variable numer nimeä
			System.out.println("number is " + ++numer);
		}

		for (int number = 1; number < 10; number++)
			System.out.println("testi");

	}

	/* ------------------------------------------------------------------------------- */
	/* Events */
	/* ------------------------------------------------------------------------------- */

	int multiply(int ekaNumero, int tokaNumeroa) {
		int resultti = ekaNumero * tokaNumeroa;
		return resultti;
	}

	@EventHandler
	public void onRightClick(PlayerInteractEntityEvent event) {
		//byte testou = 1;
		long longerone = 1;
		//String testous = "tesi";
		//String testi3 = "t4";

		int moi = 1; //int moi on yksi niin sitten suoritetaan oikeesti tällä ei ole mitään tekemistä itse sen kanssa että räjäyttämänne entityyppi kohdassa määritellyn asian
		long result = moi + 1 + longerone;

		if (result > 1) {
			// jos klikattu kohde on zombi
			if (event.getRightClicked().getType() == EntityType.ZOMBIE) {
				//luodaan räjäytys voima asteikolla 5
				event.getRightClicked().getWorld().createExplosion(event.getRightClicked().getLocation(), 5);
				//asetaan kohte vielä tuleen joskin kohte kerkee kyllä kuolee siihen räjähtyksen jo muudenkin
				//lisäksi kokeilemalla multiply funktionata 20x20 =400 tickiä
				event.getRightClicked().setFireTicks(multiply(20, 20));
				result++;
			}
		}
		//ainakun joku klikkaa käytään läpi kaikki pelaajat ja annetaan moi variable määritelty määrä exp leveleitä
		for (Player player : Remain.getOnlinePlayers()) {
			//anto prosessi
			player.giveExpLevels(moi);
			//sitten sanotaan vielä moi
			//bugi jos pelaaja on creativessä klikaat tulee kahteen kertaan moi.
			//jos klikaat zombiet
			//result++  johtuu
			//joka nyt on vain if lauseen testaus...
			//koodauksen tässä vaiheessa asialla ei ole mitään merkitystä
			//jos klikkaat MITÄ TAHANSA muuta elävää olentoa esim laamaan tulee moi ja exp leveli eli working as intented.
			player.sendMessage("moi");
		}

	}

}
