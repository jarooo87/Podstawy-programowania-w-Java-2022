public class Employee {
    private int id;
    private String name;
    private String company;

    int getId(){
        return  id;
    }
    void setId(int id){
        this.id=id;
    }
    String getName(){
        return name;
    }
    void setName(String name){
        this.name = name;
    }
    String getCompany(){
        return company;
    }
    void setCompany(String company){
        this.company=company;
    }
    public String toString(){
        return "Employee: id= " + getId() + ", name= " + getName() + ", company= " + getCompany();
    }
}
