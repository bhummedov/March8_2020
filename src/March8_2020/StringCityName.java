package March8_2020;

public class StringCityName {
    public static void main(String[] args) {

        String[][] myCities = createRandomCities(4, 3);
        printCitiesA(myCities);
        printReverse(myCities);
        printLetterAH(myCities);
    }

    public static String[][] createRandomCities(int rows, int cols) {
        String[] cities = {"Ann Arbor", "Fort Worth", "Fairfax", "Orlando",
                "Denver", "Portland", "Phoneix", "Arlington", "Atlanta",
                "Amarillo", "Boulder", "Chicago", "Albany"};

        String[][] randCities = new String[rows][cols];
        int index;
        for (int i = 0; i < randCities.length; i++) {
            for (int j = 0; j < randCities[i].length; j++) {
                randCities[i][j] = cities[(int) (Math.random() * cities.length)];
            }
        }
        return randCities;
    }

    public static void printCitiesA(String[][] cities) {
        for (String[] row : cities) {
            for (String city : row) {
                if (city.charAt(0) == 65) {
                    System.out.println(city);
                }
            }
        }
    }
    public static void printReverse(String[][] word) {
        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < word[i].length; j++) {
                String reverse = " ";
                for (int k = word[i][j].length() - 1; k >= 0; k--) {
                    reverse += word[i][j].charAt(k);
                }

                System.out.print(reverse + " \t\t\t");

            }
            System.out.println();
        }
    }
        public static void printLetterAH(String[][] word){
            for (int i = 0 ; i < word.length ; i++){
                for (int j = 0 ; j < word[0].length ; j++) {
                    if (word[i][j].charAt(0)>64 && word[i][j].charAt(0) <73)
                        System.out.println( word[i][j] );
                }
            }
        }
    }




