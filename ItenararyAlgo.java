import java.util.*;


public class Main {

        public static List<String> findItinerary(List<List<String>> tickets) {
            Map<String, PriorityQueue<String>> graph = new HashMap<>();

            // Build the graph
            for (List<String> ticket : tickets) {
                String from = ticket.get(0);
                String to = ticket.get(1);
                graph.putIfAbsent(from, new PriorityQueue<>());
                graph.get(from).add(to);
            }

            List<String> itinerary = new ArrayList<>();
            dfs(graph, "start", itinerary);

            Collections.reverse(itinerary); // Reversing the result to get correct order
            return itinerary;
        }

        private static void dfs(Map<String, PriorityQueue<String>> graph, String curr, List<String> itinerary) {
            if (graph.containsKey(curr)) {
                PriorityQueue<String> destinations = graph.get(curr);
                while (!destinations.isEmpty()) {
                    dfs(graph, destinations.poll(), itinerary);
                }
            }
            itinerary.add(curr);
        }

        public static void main(String[] args) {
            List<List<String>> tickets = new ArrayList<>();
            tickets.add(Arrays.asList("A", "B"));
            tickets.add(Arrays.asList("B", "C"));
            tickets.add(Arrays.asList("C", "D"));
            tickets.add(Arrays.asList("D", "E"));

            List<String> result = findItinerary(tickets);
            System.out.println(result); // Output should be [A, B, C, D, E]
        }


}
