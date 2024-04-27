import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class lpu{
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("myNmae","Ashish");
        map.put("actor","pankaj ");
        map.put("class","K22BW");
        Set<String> keys=map.keySet();
        for(int i=0;i<keys.size();i++){
        System.out.println(map.get(keys));
        }
    }
}