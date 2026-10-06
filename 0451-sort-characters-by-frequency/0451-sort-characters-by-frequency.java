class Solution {
	public String frequencySort(String s) {
		HashMap<Character,Integer> map = new HashMap<>();
		List<Character> l = new ArrayList<>();
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			l.add(c);
			map.put(c,map.getOrDefault(c,0)+1);
		}
		Collections.sort(l,(a,b)-> {
			if(map.get(b).equals(map.get(a))){
				return b-a;
			}
			return  map.get(b)-map.get(a);
		});

	   StringBuilder str = new StringBuilder();

        for (int i=0;i<l.size();i++) {
            str.append(l.get(i));
        }
        return str.toString();

	}
}