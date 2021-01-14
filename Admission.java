


package admission;
import java.util.Scanner;
 public class Admission{
     public static void main(String []args){
         School ob=new School();
         ob.form();
     }
 }
class School{
     String name;
     int bform;
      String fanam;
     int clas;
     int per;
     int mno;
     int dofbirth;
     
     int date;
     String gender;
     int age;
     String gmail;
     Scanner inp=new Scanner(System.in); 
     void form(){
         int[] array=new int[10];
         for(int i=0;i<array.length;i++){
              System.out.println("Welcome To Admission Ofice");
              System.out.println("For Admission Fill The Form");
         System.out.printf("Enter Name%n%n");
          name=inp.nextLine();
         System.out.println("Father Name");
         fanam=inp.nextLine();
          We cv=new We();
         cv.f();
         You is=new You();
         is.in();
          System.out.println("Enter Adress");
         String city=inp.nextLine();
         System.out.println("Enter Class");
         clas=inp.nextInt();
         System.out.println("Enter Percentage of Previes Class");
         per=inp.nextInt();
         System.out.println("Enter Your Mobile No: ");
         mno=inp.nextInt(); 
         System.out.println("Documents attested Yes or No");
         char doc=inp.next().charAt(0);
         System.out.println("Enter Admission Date day/month/year");
          date=inp.nextInt();
         int amonth=inp.nextInt();
         int ayear=inp.nextInt();
           System.out.printf("%n%n%n%n%n");
         Me ab=new Me();
         ab.show(clas, per,doc);
         Imp obj=new Imp();
         obj.card(name,clas,date,fanam,city,amonth,ayear);
         System.out.printf("%n%n%n%n%n%n");
         }}}
     class Me extends School{
         void show(int clas,int per,char doc){
             if(doc=='y'){
         if((clas>1)&&(clas<=10)){
         if(per>=60)
         System.out.println("You Are Selected");
         else
        System.out.print("Your percentage Less Then Requirments"); }  
         
         else if(clas==1)
             System.out.print("You are Selected");
         
         else
             System.out.print("Clases Alowed 1 To 10");
             }

}
}
class Imp extends School{
    void card(String name,int clas,int date,String fanam,String city,int amonth,int ayear){
        System.out.println("School Card");
        System.out.println("Govet High School XYZ");
                System.out.println("Name:"+name);
                System.out.println("Father Name:"+fanam);
                int rno=0;
                rno=rno+1;
                 System.out.println("Rool No:"+rno);
                System.out.println("Class:"+clas);
                System.out.printf("Card Issu Date :%2d/%02d/%04d%n",date,amonth,ayear);
                System.out.println("Adress :"+city);
               
    }
}
class You extends School{
    void in(){
         System.out.println("Enter Form no/Id No");
         bform=inp.nextInt();
         System.out.println("Enter Your Date Of Birth day/month/year");
         dofbirth=inp.nextInt();
         int maont=inp.nextInt();
         int year=inp.nextInt();
         System.out.println("enter age");
         age=inp.nextInt();
         System.out.println("Enter Father ID No");
         bform=inp.nextInt(); 
  
    }
}
class We extends School{
    void f(){
         System.out.println("Enter gender");
         gender=inp.nextLine(); 
          System.out.println("input your Email");
          gmail=inp.nextLine();
    }
}
                                                     
