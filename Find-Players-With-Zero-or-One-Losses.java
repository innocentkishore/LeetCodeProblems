class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        HashMap<Integer,Integer> win=new HashMap<>();
          HashMap<Integer,Integer> los=new HashMap<>();
          for(int i=0;i<matches.length;i++){
            win.put(matches[i][0],win.getOrDefault(matches[i][0],0)+1);
          }

          for(int i=0;i<matches.length;i++){
            los.put(matches[i][1],los.getOrDefault(matches[i][1],0)+1);
          }
        for(int i:win.keySet()){
            if(!los.containsKey(i)) list.add(i);
        }
        // System.out.println(list);
        Collections.sort(list);
        res.add(new ArrayList<>(list));
        list.clear();
        for(int i:los.keySet()){
            if(los.get(i)==1) list.add(i);
        }
        Collections.sort(list);
        res.add(new ArrayList<>(list));
        return res;
    }
}