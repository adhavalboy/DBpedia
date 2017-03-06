public class Roman {
	private final int num;   
    
    private static int[]    numbers = { 1000,  900,  500,  400,  100,   90,  
                                          50,   40,   10,    9,    5,    4,    1 };
                                       
    private static String[] letters = { "M",  "CM",  "D",  "CD", "C",  "XC",
                                        "L",  "XL",  "X",  "IX", "V",  "IV", "I" };
    public Roman(int ar) {
       num = ar;
    }
    
    public String convert() {
       String roman = new String();  
       int temp = num;    
       for (int i = 0; i < numbers.length; i++) {
          while (temp >= numbers[i]) {
             roman += letters[i];
             temp -= numbers[i];
          }
       }
       return roman;
    }
}
