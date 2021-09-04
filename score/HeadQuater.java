import java.util.ArrayList;

public class HeadQuater implements Source{
    private final ArrayList<MyObserver> List;
    private String someData;    
    public HeadQuater () {
        this.List = new ArrayList<MyObserver>();
    }
    public void setSomeData (String data){
        someData = data;
        notifyObsever();
    }
    public String getdata(){
        return someData;
    }

    public void register (MyObserver observer){
        List.add(observer);
    }
    public void notifyObsever() {
        for(int i = 0 ; i < List.size() ; i++ ){
            List.get(i).update(this);
        }
    }
}
