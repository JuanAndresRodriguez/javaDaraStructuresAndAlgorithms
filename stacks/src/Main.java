import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        /*
        * stack = LIFO data structure. Last-In First.Out
        *         stores objects into a sort of "vertical tower"
        *         push() to add to the top
        *         pop() to remove from the top
        */

        Stack<String> stack = new Stack<String>();

        // see if stack is empty
        System.out.println(stack.empty());

        // add object to stack
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");

        System.out.println(stack.empty());
        System.out.println(stack);

        // Removes top element and save to variable
        String myFavGame = stack.pop();
        System.out.println(stack);
        System.out.println(myFavGame);

        // see element at top of stack without removing it
        System.out.println(stack.peek());

        // index of element in stack
        // top is 1
        System.out.println(stack.search("Borderlands"));
        System.out.println(stack.search("Minecraft"));
        // not in stack is -1
        System.out.println(stack.search("Fallout76"));

        /*
        * Uses of stacks
        * 1. Undo/redo features in text editors
        * 2. Moving back/forward in text editors
        * 3. Backtracking algorithms (maze, file directories)
        * 4. Calling functions (call stack)
        * */

    }
}