class Solution {
    public String frequencySort(String s) {

        HashMap<Character,Integer> map=new HashMap<>();
 
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        maxHeap.addAll(map.keySet());

        StringBuilder ans = new StringBuilder();

        while(!maxHeap.isEmpty()){
            char ch=maxHeap.remove();
            int count=map.get(ch);
            while(count!=0){
                ans.append(ch);
                count--;
            }
        }
        return ans.toString();
    }
}