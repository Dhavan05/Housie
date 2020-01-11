import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import org.json.JSONObject;

public class Housie {

	public static void main(String args[]) {
		HashMap<Integer, String> input = new HashMap<>();

		input.put(0, "3 idiots");
		input.put(1, "Chhello divas");
		input.put(2, "Dhamaal");
		input.put(3, "Dream girl");
		input.put(4, "Khichdi");
		input.put(5, "Dhadkan");
		input.put(6, "Yeh jawani hai deewani");
		input.put(7, "Mr. India");
		input.put(8, "Masoom");
		input.put(9, "Housefull 4");
		input.put(10, "Arth");
		input.put(11, "War");
		input.put(12, "Bahubali");
		input.put(13, "Andaz apna apna");
		input.put(14, "Hellaro");
		input.put(15, "Simba");
		input.put(16, "Maun vrat");
		input.put(17, "Sahan shakti");
		input.put(18, "Thermometer");
		input.put(19, "Galti se");
		input.put(20, "Khoon bhari maang");
		input.put(21, "Gujjubhai the great");
		input.put(22, "Kabhi kabhi");
		input.put(23, "206 Haddiyan");
		input.put(24, "Welcome");
		input.put(25, "Singham returns");
		input.put(26, "Golmaal");
		input.put(27, "Awara pagal deewana");
		input.put(28, "Ishq");
		input.put(29, "Saas Bahu");
		input.put(30, "Hare Ram Hare Krishna");
		input.put(31, "Sonbai ni chundadi");
		input.put(32, "Gully boy");
		input.put(33, "O baba phone dilade");
		input.put(34, "Happy birthday");
		input.put(35, "Sarabhai vs Sarabhai");
		input.put(36, "Miya biwi");
		input.put(37, "Love ni bhavai");
		input.put(38, "Patni pidit");
		input.put(39, "Jaanwar");
		input.put(40, "Option B");
		input.put(41, "Jane tu ya jane na");

		JSONObject finalJson = new JSONObject();
		ArrayList<ArrayList<Integer>> allTickets = new ArrayList<>();

		int randomInt = 0;
		while (allTickets.size() != 150) {
			ArrayList<Integer> ticket = new ArrayList<>();
			Random random = new Random();
			while (ticket.size() != 15) {
					randomInt = random.nextInt(input.size());
					if (!ticket.contains(randomInt))
						ticket.add(randomInt);
			}
			input.put(-1, "Chal jeevi laiye");
			String ticketValue = "";
			for (Integer integer : ticket) {
				ticketValue += "," + input.get(integer);
			}
			ticketValue = ticketValue.substring(1);
			finalJson.append("Ticket " + (allTickets.size() + 1), ticketValue.toString());
			allTickets.add(ticket);
		}

		System.out.println(finalJson.toString());
	}
}
