public class Main {
    public static void main(String[] args) {

        String[] [] city = new String[3][3];

        city[0] [0] = "İstanbul";
        city[0] [1] = "Bursa";
        city[0] [2] = "Bilecik";
        city[1] [0] = "Ankara";
        city[1] [1] = "Konya";
        city[1] [2] = "Kayseri";
        city[2] [0] = "Diyarbakır";
        city[2] [1] = "Şanlıurfa";
        city[2] [2] = "Gaziantep";

        for(int i = 0; i<=2; i++){ //for row
            System.out.println("-----------------------");
            for (int j=0; j<=2; j++){ //for column
                System.out.println(city[i][j]);
            }
        }


    }
}