package March8_2020;

public class MethodMovie<result> {
    public static void main(String[] args) {
        // Movie desition
   /*     System.out.println(stringWords(10, 1500, 100));

    }
    public static String stringWords(int imbd, int totalVotes, int boxOffice){
        String result=" ";
      int a= (imbd*totalVotes/boxOffice);
        if (a>10){
            System.out.println("Watch Movie");
        }
        else{
            System.out.println("Do not watch Movie");
        }
        return result;
    }
}*/
        System.out.println(carRange(10, 1500));

    }
  // Car Range Calculator
    public static int carRange(int MPG, int gallon) {
        int result = 0;
       int range = MPG*gallon;
        System.out.println("Car Range :" +range);
        return result;
    }
}


