public class SearchStringMay1 {
    public static void main(String[] args) {
        String a = "google";
        //String b = "ogl";


        for (int i = 0; i < a.length(); i++) {
            String temp = "";
            for (int j = i; j < a.length(); j++) {
                temp = temp + a.charAt(j);

                //if (b.equals(temp)) {
                System.out.println(temp);
                //  break;

            }
        }
    }
}




