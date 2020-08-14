/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		
		result obj=new result ();
		obj.stud();
		obj.totave();
		obj.display();		

		
		result obj1=new result ();
		obj1.stud();
		obj1.totave();
		obj1.display();
		
		result obj2=new counter1();
		obj2.stud();
		obj2.totave();
		obj2.display();
		
		result  obj3=new counter1();
		obj3.stud();
		obj3.totave();
		obj3.display();
		
		result obj4=new result();
		obj4.stud();
		obj4.totave();
		obj4.dispaly();
		
    }
}
class result 
{
    int m1,m2,m3,m4,m5;
    int total,id;
    float average ;
    string name;
    
    void stud()
    {
        System.out.println("Enter details :");
        Scanner obj=new Scanner(System .in);
        name=obj.next();
        id=obj.nextInt();
        age=obj.nextInt();
        weight=obj.nextInt();
        height=obj.nextInt();
        m1=obj.nextInt();
        m2=obj.nextInt();
        m3=obj.nextInt();
        m4=obj.nextInt();
        m5=obj.nextInt();

    }
    
    void totave()
    {
        total =m1+m2+m3+m4+m5;
        average =total /5;
    }
    
    void display ()
    {
        System .out.println("Student details :");
        System .out.println ("*******");
        System.out.println("Name:"+name);
        System.out.println("Roll no:"+id);
        System .out.println("Age:"+age);
        System .out.println("Weight:"+weight);
        System .out.println("Height:"+height);
        System.out.println ("Tamil:"+m1+\n+"English :"+m2+\nMaths:"+m3+"\nPhysics:"+m4+"?")
""\nchemistry:"+m5+ " \nTotal:"+total+ "\nAverage:"×average );
}
