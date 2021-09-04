public class user2 implements MyObserver{
    public void update(Source o) {
        System.out.println("live resault:"+((HeadQuater)o).getdata());
    }  
}
