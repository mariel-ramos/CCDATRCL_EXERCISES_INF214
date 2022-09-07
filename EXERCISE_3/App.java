

//Array implementation of Stack
public class App {
      public static void main(String[] args) {
        
      //Create new Stack Object
      plate_stack plate_stack = new plate_stack(10);
      
      
    
     //Insert new elemets into the stack
     plate_stack.push("First Plate");
     plate_stack.push("Second Plate");
     plate_stack.push("Third Plate");
     plate_stack.push("Fourth Plate");
     plate_stack.push("Fifth Plate");
     plate_stack.push("Sixth Plate");
     plate_stack.push("Seventh Plate");
     plate_stack.push("Eighth PLate");
     plate_stack.push("Nineth Plate");
     plate_stack.push("Tenth Plate");
     
     //Show the size of the stack
     System.out.println("The size of the stock:" + plate_stack.size());

     //Show the top element in the Stack
     System.out.println("The top of the Stack is:" + plate_stack.peek());

     //Remove the element of the stack
     plate_stack.pop();

     System.out.println("After Pop");

     
     //Remove the element of the stack
     plate_stack.pop();

     System.out.println("After Pop");

     
     //Remove the element of the stack
     plate_stack.pop();

     System.out.println("After Pop");

     
     //Remove the element of the stack
     plate_stack.pop();

     System.out.println("After Pop");

     
     //Remove the element of the stack
     plate_stack.pop();

     System.out.println("After Pop");

     //Show top elements in stack
     plate_stack.printStack();

     //Show element in the satck
     System.out.println("The top of the Stack is:" + plate_stack.peek());
     
    
      }
}
