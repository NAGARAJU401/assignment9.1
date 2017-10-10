package AbstructDemo;
//Package is a grouping of related types providing access protection and name 
///here I have created a package as AbstructDemo
public class Abstructdemo {
	//public : members which can access as public,public members are visible to all other classes.
			//class : is a context of java that are used to create objects and to define object data types and methods.
			//classes are the basics of opps(object oriented programming)
		//created class as Abstructdemo
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Public is a keyword that is used as an access modifier for methods and variables.
				//static used to prepare a field,method or inner classes as a class field.
				//void: it is void if the method does not return a value.
				//main:it is a function name When a program starts running, it has to start execution from somewhere.
				//String[] args: it is  defining a String array to pass arguments at command line. args is the variable name of the String array.
		Mobile obj = new AndroidMobile();
		//here we cannot  instantiate the object class
		//so we create object of AndroidMobile which is not an abstract class

		obj.call();
//calling the object
		obj.camera();

		obj.flashlight();

		obj.music();

	}

}

    abstract class Mobile{            //a class is declared as abstract is known as abstract class

    	// here i have created a parent class .if we define abstract methods so that class must be an abstract class

    	public void call(){       //if i have created a method and i have declared it 
    		//Public is a keyword that is used as an access modifier for methods and variables.
    		//void: it is void if the method does not return a value.
			
    		   System.out.println(" mobile features :calling.........");
    		 //system : system is a class in java language.lang package
         		//out : out is the static member of system class.It's type PrintStream
         		//println: which is used to print the output.
               //Inside the brackets is value which to be printed.
               //to initialize values we have take the variables
          
    	   }

      public abstract void camera();               //here i have defined the abstract methods  

      public abstract void music();

      public abstract void flashlight();

       }



  class AndroidMobile extends Mobile{   //here i have extended the parent to the child class

	   public void camera(){                                              //here i have implemented them in this class

		   System.out.println("android mobiles has a feature : camera");
		 //system : system is a class in java language.lang package
     		//out : out is the static member of system class.It's type PrintStream
     		//println: which is used to print the output.
           //Inside the brackets is value which to be printed.
           //to initialize values we have take the variables
      
	   }

	   public  void  music(){

		   System.out.println("android mobiles has a another feature : music");  

	   }

	   public  void flashlight(){
			//Public is a keyword that is used as an access modifier for methods and variables.
   		//void: it is void if the method does not return a value.
		
		   System.out.println("android mobiles has a one more feature : flashlight");
		 //system : system is a class in java language.lang package
     		//out : out is the static member of system class.It's type PrintStream
     		//println: which is used to print the output.
           //Inside the brackets is value which to be printed.
           //to initialize values we have take the variables
      
	}

}
