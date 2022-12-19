public class Students implements Comparable<Students> {
    private String name;
    private int age;
    public Students(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(){
        this.age=age;
    }
    public String toString(){
        return " imie " + name + " wiek" + age;
    }

    @Override
    public int compareTo(Students o) {
        return this.name.compareTo(o.name);
    }
}
