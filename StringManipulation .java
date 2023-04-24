class StringManipulation {
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        sb.insert(5, ", ");
        sb.delete(11, 16);
        String str1 = sb.toString();
        System.out.println(str1);

        // StringBuilder example
        StringBuilder sb2 = new StringBuilder("Hello");
        sb2.append(" World");
        sb2.insert(5, ", ");
        sb2.delete(11, 16);
        String str2 = sb2.toString();
        System.out.println(str2);
    }
}
/* 
In this program, we create a StringBuffer object called sb and append the string " World" to it. We then insert the string ", " at index 5 and delete the characters between index 11 and 15. We convert the StringBuffer object to a String object using the toString() method and print it to the console.

We then repeat the same process using a StringBuilder object called sb2. Finally, we convert the StringBuilder object to a String object and print it to the console.

Both StringBuffer and StringBuilder have similar methods for manipulating strings, but StringBuilder is faster than StringBuffer because it is not thread-safe. If you are working in a single-threaded environment, it is recommended to use StringBuilder. If you are working in a multi-threaded environment, it is recommended to use String.
*/