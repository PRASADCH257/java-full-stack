class Operators{
    public static void main(String[] args) {
        int a = 10, b = 5;

        /*//Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("addition" + (a + b));
        System.out.println("subtraction" + (a - b));
        System.out.println("multiplication" + (a * b));
        System.out.println("divide" + (a / b));
        System.out.println("remainder" + (a % b));
        System.out.println();*/

        /*//Assignment Operators
        System.out.println("Assignment Operators:");
        int c = a;
        System.out.println("c = " + c);
        c += 5; 
        System.out.println("c += 5: " + c);
        c -= 3;
        System.out.println("c -= 3: " + c);
        c *= 2;
        System.out.println("c *= 2: " + c);
        c /= 4;
        System.out.println("c /= 4: " + c);
        System.out.println();*/

        /*
        System.out.println("Relational Operators:");
        System.out.println("equal" + (a == b));
        System.out.println("not equal " + (a != b));
        System.out.println("greater than" + (a > b));
        System.out.println("less than " + (a < b));
        System.out.println("greater equal to " + (a >= b));
        System.out.println("less equal to " + (a <= b));
        System.out.println();*/
/*
        // 4. Logical Operators
        System.out.println("Logical Operators:");
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
        System.out.println();
*/
       /* // 5. Unary Operators
        System.out.println("Unary Operators:");
        int d = +a;
        System.out.println("Unary plus: +a = " + d);
        System.out.println("Unary minus: -a = " + (-a));
        System.out.println("post increment" + (a++)); 
        System.out.println("After a++: " + a);
        System.out.println("pree increment" + (++a)); 
        System.out.println("post decrement" + (a--)); 
        System.out.println("pre decrement" + (--a)); 
        System.out.println();*/

        // 6. Bitwise Operators
        System.out.println("Bitwise Operators:");
        int e = 6;  
        int f = 3; 
        System.out.println("AND" + (e & f));
        System.out.println("OR " + (e | f));
        System.out.println("OR " + (e ^ f)); 
        System.out.println("NOT" + (~e));       
        System.out.println("LEFT SHIFT" + (e << 1)); 
        System.out.println("RIGHT SHIFFT" + (e >> 1)); 
        System.out.println();

        // 7. Ternary Operator
        System.out.println("Ternary Operator:");
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b is: " + max);
    }
}
