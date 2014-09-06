

import java.util.ArrayList;
import java.util.List;

public class Manager {

	private static Manager instance = new Manager();;

	private List<Inventory> inventories;
	private static List<Icon> icons;

	private Manager() {
		icons = new ArrayList<Icon>();
		inventories = new ArrayList<Inventory>();

		inventories.add(new ExampleInventory());

		icons.add(new ExampleIcon());
	}

	public static Manager getInstance() {
		return instance;
	}

	/**
	 * Get an icon using its classes simple name For example if the icon class
	 * name is "Creative" the simple name is the same
	 * 
	 * @param iconSimpleClassName
	 *            the icons simple class name
	 * @return the specified icon
	 */
	public Icon getIcon(String iconSimpleClassName) {
		for (Icon i : icons) {

			if (i.getClass().getSimpleName()
					.equalsIgnoreCase(iconSimpleClassName))
				break;

			return i;
		}
		return null;
	}

	/**
	 * Get an inventory using the inventories class name
	 * 
	 * @param inventorySimpleClassName
	 *            the inventories class name
	 * @return the specified inventory
	 */
	public Inventory getInventory(String inventorySimpleClassName) {
		for (Inventory i : inventories) {
			if (i.getClass().getSimpleName()
					.equalsIgnoreCase(inventorySimpleClassName)
					&& i != null)
				break;
			return i;
		}
		return null;

	}
}
