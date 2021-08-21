import java.util.Scanner;
public class Duke {
    public static void main(String[] args) {
        /*
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Hello from\n" + logo);
         */
        System.out.println("Hello! I'm Duke");
        System.out.println("what can i do for you?\n");
        getMsg();
    }

    public static void getMsg(){
        String line;
        Scanner sc = new Scanner(System.in);
        String[] messageArr = new String[100];
        int counter = 1;
        while (true) {
            line = sc.nextLine();
            if (line.equals("list")) {
                printListFunction(messageArr, counter);
            }else if(line.equals("bye"))  {
                System.out.println("Bye.Hope to see you again soon!");
                sc.close();
                break;
            }else{
                storeFunction(messageArr, line, counter);
                counter ++;
            }
        }
    }

    public static String[] storeFunction(String[] messageArr, String line, int counter){
        messageArr[counter] = line;
        System.out.println("added: " + line);
        return messageArr;
    }

    public static void printListFunction(String[] messageArr, int counter){
        for(int i = 1; i < counter; i++){
            System.out.println(i + "." + messageArr[i]);
        }
    }
}
