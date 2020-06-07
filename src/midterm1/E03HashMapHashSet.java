package midterm1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class E03HashMapHashSet {

    public static void main(String[] args) {
        // What type of map should we use?
        Map<String, Set<String>> friends = createFriendMap(
                "TestCases/friendList");

        for (Map.Entry<String, Set<String>> me : friends.entrySet()) {
            System.out.println(me);
        }

        // System.out.println(friends);

        // for (String name : friends.keySet()) {
        // System.out.println(name + " -> " + friends.get(name));
        // }

        Scanner userInput = new Scanner(System.in);
        while (true) {
            /*
             * Make sure to provide valid friend name
             * otherwise the code will throw and exception
             */
            System.out.println("Enter first friend's name");
            String first = userInput.next();
            System.out.println("Enter second friend's name");
            String second = userInput.next();
            if (first.equals("") || second.equals("")) {
                break;
            }

            System.out.println(first + " and " + second
                    + " have the below friends in common:");
            Set<String> mutualFriends = friends.get(first);
            mutualFriends.retainAll(friends.get(second));
            System.out.println(mutualFriends);

        }
        userInput.close();
    }


    /*
     * Creates and returns a map from a person to the set of friends for that
     * person.
     */
    private static Map<String, Set<String>> createFriendMap(String filename) {
        // Map<String, Set<String>> friendMap = new HashMap<String,
        // Set<String>>();
        Map<String, Set<String>> friendMap = new TreeMap<String, Set<String>>();
        try {
            Scanner fileScanner = new Scanner(new File(filename));
            String key = fileScanner.nextLine();

            while (fileScanner.hasNextLine()) {
                String friend = fileScanner.nextLine();
                if (friend.equals("") && fileScanner.hasNext()) {
                    key = fileScanner.nextLine();
                    continue;
                }

                if (friendMap.containsKey(key)) {
                    friendMap.get(key).add(friend);
                } else {
                    Set<String> newSet = new HashSet<String>();
                    newSet.add(friend);
                    friendMap.put(key, newSet);
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return friendMap;
    }

}
