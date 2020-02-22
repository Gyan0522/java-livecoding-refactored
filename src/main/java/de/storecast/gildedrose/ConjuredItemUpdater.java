package de.storecast.gildedrose;

public class ConjuredItemUpdater implements Updater {

	public void update(Item item) {
		item.quality -= 2;
		if(item.quality < 0) {
			item.quality = 0;
		}
		item.sellIn--;
	}

}
