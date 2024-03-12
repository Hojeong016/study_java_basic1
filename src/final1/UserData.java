package final1;

public class UserData {
    private final String id;
    private String name;

    public UserData(String id , String name){
    this.id = id;
    this.name =name;
    }

    public void ChangeData(String name){
        //this.ID=ID;
        this.name=name;
    }

    public void print(){
        System.out.println("name : "+ name +"id:"+id);
    }




}
