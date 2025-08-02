package Oops.Encapsulation;

class practice1 {
    private int id;
    private String name;
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public static void main(String args[]){
        practice1 p=new practice1();
        p.setId(101);
        p.setName("Amina");
        System.out.println("Id is"+p.getId());
        System.out.println("Name is"+p.getName());
    }
}
