public class Loop {
    public static void while_loop(String string) {
        int c = 1; 
        while (c <= 5) {
            System.out.println(string + " " + c);
            c = c + 1;
        }

        // We finished our lesson so i'll be off, bye you/
        // dont wanna come see me one last time, 
        //which room?
        // old wbl room from first year
        // idk which one that is
        // ok i'll be there soon
        // the out side one e406 i think but not shure
        
    }

    public static void for_loop(String string) { 
        for (int i = 1; i <= 5; i++) {
            System.out.println("for loop "+ string + " " + i);
        }
    }

    public static void do_while_loop(String string) {
        int i = 1;
        do { 
            System.out.println("do_while " + string + " " + i);
        } 
        while (i <= 5);
    }
}