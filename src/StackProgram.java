public class StackProgram {
    public static void main(String args[]){

        Stack nums = new Stack();

        nums.push(2);
        nums.push(7);
        nums.push(8);
        System.out.println(nums.pop());// will pop out the last value in the stack out of it
        nums.push(3);
        nums.push(9);
        System.out.println(nums.peek());// will prints the last value in the stack
        nums.push(17);


        nums.printValues();
    }
}
