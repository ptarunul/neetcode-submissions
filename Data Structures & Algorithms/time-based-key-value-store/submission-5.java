class TimeMap {
    class Pair{
        int timestamp;
        String value;

        public Pair(int timestamp, String value){
            this.timestamp= timestamp;
            this.value= value;
        }
    }

    Map<String, List<Pair>> map;  
    
    public TimeMap() {
        map= new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key, new ArrayList<>());
        map.get(key).add(new Pair(timestamp, value));
    }

    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";
        List<Pair>list= map.get(key);
        int l=0, r= list.size()-1;
        String res= "";
        while(l<=r){
            int mid= l+(r-l)/2;
            
            if(list.get(mid).timestamp<=timestamp){
                res= list.get(mid).value;
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return res;
    }
}
// class TimeMap {
//     Map<String, String> m = new HashMap<>();

//     public TimeMap() {
        
//     }
    
//     public void set(String key, String value, int timestamp) {
//         String k= timestamp+key;
//         m.put(k, value);
//     }
    
//     public String get(String key, int timestamp) {
        
//         for(int i=timestamp; i>=0; i--){
//             String k= i+key;

//             if(m.get(k)!=null){
//                 return m.get(k);
//             }
//         }

//         return "";
        
//     }
// }