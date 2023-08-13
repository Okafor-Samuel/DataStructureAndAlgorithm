     /*   Rogue Agent's Treasure Hunt
        Our rogue agent has left behind a series of clues, each pointing to
        the next clue's location. Your task is to follow these clues and
        determine the order in which the agent hid them. The clues are
        represented as a map, where each clue points to the next clue's
        location. The agent's treasure is the final clue in this chain.

      */
import java.util.*;
    public class Main {
        public static List<String> findTreasureRoute(Map<String, String> clues) {
            List<String> route = new ArrayList<>();
            String currentClue = null;

            for (String clue : clues.keySet()) {
                if (!clues.containsValue(clue)) {
                    currentClue = clue;
                    break;
                }
            }

            if (currentClue != null) {
                buildRoute(clues, currentClue, route);
            }

            return route;
        }

        private static void buildRoute(Map<String, String> clues, String clue, List<String> route) {
            route.add(clue);
            String nextClue = clues.get(clue);
            if (nextClue != null) {
                buildRoute(clues, nextClue, route);
            }
        }
        public static void main(String[] args) {
            Map<String, String> clues = new HashMap<>();
            clues.put("Clue 1", "Clue 2");
            clues.put("Clue 2", "Clue 3");
            clues.put("Clue 3", "Clue 4");
            clues.put("Clue 4", "Treasure");

            List<String> treasureRoute = findTreasureRoute(clues);
            System.out.println(treasureRoute);
        }

    }

