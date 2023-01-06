import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TheLottery {
    public static void main(String[] args) {

        /*

           Create  n random numbers with user to generated for the ticket.
           Create  n random numbers  for the result of the lottery.
           There should be no repeated numbers in the numerical lottery.
           Take the min and max from user to use in the lottery...

           Compare the result and ticket than print  how many matches is there

*/

        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want use for the lottery ");
        int numOfLotter=sc.nextInt();

        int[] ticKet=new int[numOfLotter];
        int [] theLotter=new int[numOfLotter];

        System.out.println("Please add the max value");         // Take the max and min value from user
        int maxValue= sc.nextInt();
        System.out.println("Please add the min value");
        int minValue= sc.nextInt();
        int randomTicket;
        int randomResult;

        boolean isRepeated;

        for (int i = 0; i <numOfLotter ; i++) {



            do {                                                                        //for creation of ticket
                isRepeated = true;

                randomTicket = (int) (Math.random() * (maxValue - minValue) + minValue);


                for (int k = 0; k <= i; k++) {

                    if (ticKet[k] == randomTicket) {

                        isRepeated = false;
                        break;
                    }
                }

                    ticKet[i] = randomTicket;

            } while (!isRepeated);



            do{
                isRepeated=true;
                randomResult=(int)(Math.random()*(maxValue-minValue)+minValue);

                for(int k=0;k<i;k++){
                    if(randomResult==theLotter[k]){
                        isRepeated=false;
                        break;
                    }
                }

                theLotter[i]=randomResult;



            }while(!isRepeated);



        }
        System.out.println("            =======   ========    ==============      ========   ==========   ");
        System.out.println("Your Ticket's Num = " + Arrays.toString(ticKet));
        System.out.println("The Lotter Result = " + Arrays.toString(theLotter));
        System.out.println("            =======   ========    ==============      ========   ==========   ");
        System.out.println();

        int count=0;

        for (int i =0;i<numOfLotter;i++){
            if(ticKet[i]==theLotter[i]){
                count++;
            }
        }
        if(count==numOfLotter){

            System.out.println("Congratulations!!!  You have won the lottery");
        } else if (count>0) {
            System.out.println("Unfortunately you haven't won the Lottery..."+" You have "+count+" matches ");
        }else {
            System.out.println("Unfortunately you haven't won the Lottery... You don't have any matches");
        }


    }

    }

