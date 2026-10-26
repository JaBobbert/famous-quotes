import java.util.Scanner;

public class famousQuotes {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] quotes = {"\"I'm not here to be perfect, I'm here to be real\" - Lady Gaga\n" ,
                "\"I'm not interested in money. I just want to be wonderful.\" - Marilyn Monroe\n" ,
                "\"The only thing that feels better than winning is winning when nobody thought you could.\" - Hank Aaron\n" ,
                "\"Success is not final, failure is not fatal: It is the courage to continue that counts.\" - Winston Churchill\n" ,
                "\"If you can dream it, you can do it.\" - Walt Disney\n" ,
                "\"If you want something done, ask a busy person to do it.\" - Laura Ingalls Wilder\n" ,
                "\"If your actions inspire others to dream more, learn more, do more and become more, you are a leader.\" - John Quincy Adams\n" ,
                "\"The best way to find out if you can trust somebody is to trust them.\" - Ernest Hemingway\n" ,
                "\"The only Limit to our realization of tomorrow will be our doubts of today.\" - Franklin D. Roosevelt\n" ,
                "\"We may encounter many defeats but we must not be defeated.\" - Maya Angelou "};

        try {
            System.out.println("Pick a number between 1-10");

            int pick = scan.nextInt();
            System.out.println(quotes[pick-1]);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Sorry what you printed doesn't work");
        }
    }
}
