import java.util.*;
class student{
    int age;
    String adress,name;

    student(){
        name="unknow";
        adress="not known ";
        age=0;
    }
    void setInfo(String stud_name,int stud_age){
        name=stud_name;
        age=stud_age;

    }
    void setInfo(String stud_name,String stud_adress,int stud_age){
        name=stud_name;
        adress=stud_adress;
        age=stud_age;

    }
    public static void main(String args[]){
        int i;
        int stud_age;
        String stud_adress,stud_name;
        Scanner sc = new Scanner(System.in);
student s[] = new student[10];
for (i = 0; i <= 9; i++) {
s[i] = new student();
System.out.println("Enter Name of Student " + i++);
stud_name = sc.nextLine();
System.out.println("Enter Age of Student " + i++);
stud_age = sc.nextInt();
System.out.println("Enter Address of Student " + i++);
stud_address = sc.nextLine()
s[i].setInfo(stud_name, stud_age, stud_address);
    }
}
}