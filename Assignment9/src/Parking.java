public class Parking {

	static int slotIndex = 1;// To create unique parking slots

	KeyValue kvstore[];// array of KeyValue objects

	/* Parameterized constructor with no of floors and slots */
	public Parking(int floors, int slot) {
		kvstore = new KeyValue[floors];// Initializing array with floors

		for (int i = 0; i < kvstore.length; i++) {
			kvstore[i] = new KeyValue(slot);// Defines no of slots for each
											// floor

		}
	}

	/* prints available place */
	/*
	 * For every floor it checks whether slots are empty by using isEmpty() of
	 * keyValue if its empty it prints the floor.Ifempty else it will call
	 * showSpaceAvailable() of KeyValue which gives us the space available.
	 */
	public void AvailableParking() {

		for (int i = 0; i < kvstore.length; i++) { // loops through floors
			int count = 0;
			if (kvstore[i].isEmpty()) {
				System.out.println("all the slots are available in Floor "
						+ (i + 1));

			} else {

				count = kvstore[i].showSpaceAvailable();
				System.out.println(count + " slots are  available in "
						+ (i + 1) + " floor");
			}
		}
	}

	/*
	 * This method checks if space is available in each floor. If its available
	 * its added to the kvstore object untill an entire floor gets full.If so it
	 * passes on to the next floor
	 */
	public void parkACar(String CarNumber) {
		String parkingSlot = "slot" + slotIndex++;
		boolean flag = false;
		for (int i = 0; i < kvstore.length; i++) {

			while (kvstore[i].keys.size() < kvstore[i].arraysize) {
				kvstore[i].put(CarNumber, parkingSlot);
				flag = true;
				break;
			}

			if (flag) {
				break;
			}

		}

	}

	/* method to print slot number of a Car */
	/*
	 * The swap is through each and every floor and it finds a match .
	 */
	public void getACar(String CarNumber) {

		for (int i = 0; i < kvstore.length; i++) {
			String value = kvstore[i].get(CarNumber);
			if (value != null) {
				System.out.println("Car " + CarNumber + " is placed at "
						+ (i + 1) + " Floor in slot number:"
						+ kvstore[i].get(CarNumber));
				break;
			} else {
				continue;
			}
		}

	}

	public static void main(String arg[]) {

		Parking parking = new Parking(3, 4);

		parking.AvailableParking();

		parking.parkACar("Mercedes");
		parking.parkACar("toyota");
		parking.parkACar("maruti");
		parking.parkACar("opel");
		parking.parkACar("audi");

		parking.getACar("Mercedes");
		parking.getACar("maruti");
		parking.getACar("opel");
		parking.getACar("audi");

		parking.AvailableParking();

	}

}