/*
 * jos joku oikeesti haluu kopioita tai nähdä minun VERY basic harjoitus koodin siitä vaan kattelee tms.
 * - Mikimoka
 * Plugin toimii 1.17.1 ainakin.
 *
 *
 */

package fi.aurinkomaa.tutorialone;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.mineacademy.fo.plugin.SimplePlugin;

public final class PluginTemplateLight extends SimplePlugin {

	//jos laittaa tänne variable ne ovat fieldejä
	//int omppu = 1;
	//plaha plka
	//psadads
	//commentti line 2 githuppi testi

	/**
	 * JAVADOCCI heeh
	 * int apple = 5;
	 */
	int apple = 5;

	public int something() {
		return -1;
	}

	@Override
	protected void onPluginStart() { //nämä koodit suoritetaan heti ekana kun plugin käynnistää
		int apple = 5; //primetyyppinen
		int omenat = 10; //primetyyppinen
		//boolean isAlive = true; //primetyyppinen
		//int result = (apple + omenat); //tulostaa 15

		int result = apple - omenat; //primetyyppinen
		String stringeri = "PLAHA PLAHA tämä voi olla monella linella tässä" +
				"kakkos line on tässä joka pitää muistaa lopettaa mutta semmonen juttu konsolissa se näkyy yksittäisen lineheeh "; // objecti

		System.out.println(result); //tulostaa -5 koska ==>> viisi miinus 10 on miinus 5 ==> 5 - 10 = -5
		System.out.println("knock knoc3k");
		System.out.println(stringeri);

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
		long longerone = 11111111;
		//String testous = "tesi";
		//String testi3 = "t4";

		int moi = 1; //intti on moi on yksi niin sitten suoritetaan oikeesti tällä ei ole mitään tekemistä itse sen kanssa räjäyttämättä entityyppi kohdassa määritellyn asian
		long result = moi + 1 + longerone;

		if (result > 1) {
			if (event.getRightClicked().getType() == EntityType.ZOMBIE) {
				event.getRightClicked().getWorld().createExplosion(event.getRightClicked().getLocation(), 5);
				event.getRightClicked().setFireTicks(multiply(20, 20));
			}
		}
	}

}
