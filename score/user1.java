public class user1 implements MyObserver{
    public void update(Source o) {
        System.out.println("live resault:"+((HeadQuater)o).getdata());
    }  
}
