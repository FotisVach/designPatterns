package fotis.designPatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * {@link Catalog} acts as a factory and cache for Item flyweight objects.
 */
class Catalog {

	/** The cache of Items **/
	private Map<ItemType, Item> items;

	/**
	 * Creates a new Catalog object.
	 */
	Catalog() {
		items = new HashMap<>();
	}

	/**
	 * Search for an Item, if it does not exist it adds it. <br>
	 * It is like searching something in cache and if you dont find it you load
	 * it from DB.
	 * 
	 * @param type
	 * @return Item
	 */
	Item lookup(ItemType type) {
		Item item = items.get(type);
		if (item == null) {
			switch (type) {
			case LAPTOP:
				item = new Laptop(items.size());
				items.put(ItemType.LAPTOP, item);
				break;
			case SMARTPHONE:
				item = new Smartphone(items.size());
				items.put(ItemType.SMARTPHONE, item);
				break;
			case TV:
				item = new TV(items.size());
				items.put(ItemType.TV, item);
				break;
			default:
				throw new RuntimeException("Not supported type"); //$NON-NLS-1$
			}
		}
		return item;
	}
	
	/**
	 * Returns catalogs size
	 * 
	 * @return size
	 */
	int getCatalogSize() {
		return items.size();
	}

}
