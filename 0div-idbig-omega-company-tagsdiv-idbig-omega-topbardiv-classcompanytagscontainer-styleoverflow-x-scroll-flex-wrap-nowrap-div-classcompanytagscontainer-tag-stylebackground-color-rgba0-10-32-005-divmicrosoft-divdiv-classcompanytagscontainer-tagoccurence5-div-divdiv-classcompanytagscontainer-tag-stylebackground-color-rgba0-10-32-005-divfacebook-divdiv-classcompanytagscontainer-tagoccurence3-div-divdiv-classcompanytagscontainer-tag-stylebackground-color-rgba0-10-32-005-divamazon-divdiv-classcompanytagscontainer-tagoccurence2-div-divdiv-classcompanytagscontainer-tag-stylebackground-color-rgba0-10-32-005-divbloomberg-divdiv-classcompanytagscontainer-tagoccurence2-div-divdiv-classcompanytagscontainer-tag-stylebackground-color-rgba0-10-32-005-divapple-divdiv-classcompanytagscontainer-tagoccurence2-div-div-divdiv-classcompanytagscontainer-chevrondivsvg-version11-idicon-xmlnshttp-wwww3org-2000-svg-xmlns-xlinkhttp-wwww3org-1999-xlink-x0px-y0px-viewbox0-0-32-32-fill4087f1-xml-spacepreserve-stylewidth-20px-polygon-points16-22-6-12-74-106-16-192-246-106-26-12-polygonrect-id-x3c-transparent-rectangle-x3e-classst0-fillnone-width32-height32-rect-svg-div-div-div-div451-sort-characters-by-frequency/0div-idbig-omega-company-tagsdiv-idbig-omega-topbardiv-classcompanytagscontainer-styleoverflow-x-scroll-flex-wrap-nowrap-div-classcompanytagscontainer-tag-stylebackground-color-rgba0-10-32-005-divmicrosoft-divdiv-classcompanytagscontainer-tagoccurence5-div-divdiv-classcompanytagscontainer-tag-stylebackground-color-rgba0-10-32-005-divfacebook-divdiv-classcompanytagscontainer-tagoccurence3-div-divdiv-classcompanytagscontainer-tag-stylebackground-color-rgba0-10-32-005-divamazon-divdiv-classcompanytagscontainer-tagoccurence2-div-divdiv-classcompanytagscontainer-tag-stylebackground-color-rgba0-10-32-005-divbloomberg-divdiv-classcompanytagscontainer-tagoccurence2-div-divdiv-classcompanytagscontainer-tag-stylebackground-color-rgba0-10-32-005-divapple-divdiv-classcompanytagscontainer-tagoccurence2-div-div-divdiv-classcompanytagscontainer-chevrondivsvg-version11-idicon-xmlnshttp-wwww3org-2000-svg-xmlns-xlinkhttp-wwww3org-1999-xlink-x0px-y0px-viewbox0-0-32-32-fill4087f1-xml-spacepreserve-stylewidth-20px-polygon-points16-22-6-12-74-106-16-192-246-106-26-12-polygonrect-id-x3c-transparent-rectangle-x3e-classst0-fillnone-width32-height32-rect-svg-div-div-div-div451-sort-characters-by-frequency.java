 

class Solution {
    class Pair {
        int freq;
        char ch;

        Pair(int f, char c) {
            freq = f;
            ch = c;
        }
    }

    public String frequencySort(String s) {
        HashMap<Character, Integer> hmap = new HashMap();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            hmap.put(s.charAt(i), hmap.getOrDefault(s.charAt(i), 0) + 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((p1, p2) -> (p2.freq - p1.freq));

        for (Map.Entry<Character, Integer> e : hmap.entrySet()) {
            pq.offer(new Pair(e.getValue(), e.getKey()));
        }

        StringBuilder str = new StringBuilder();
        while (!pq.isEmpty()) {
            Pair p = pq.poll();
            int freq = p.freq;
            while (freq > 0) {
                str.append(p.ch);
                freq--;
            }
        }
        return str.toString();
    }
}
