import java.util.HashMap;
public class DataStore {
//    basically using hashmap for database (storing)
    private   HashMap<String,String> store = new HashMap<String ,String>();

    public DataStore() {
        store.put("Sachin", "A great batsman");
        store.put("Taran" , "A great developer");
        store.put("GFG", " A great learning platform") ;

    }
    public String getDataFromDb(String word)
    {
        return store.get(word);
    }
}
