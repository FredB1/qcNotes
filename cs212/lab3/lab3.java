/**
 * temperature
 */
public class lab3 {

    public static void main(String[] args) {
        float fahrenheit= (float)98.6;
        float centigrade =((float)5/9) *(fahrenheit-32);
        
        System.out.println(fahrenheit + " degrees fahrenheit is "+
        centigrade + " centigrade");
        for(int i = 0; i<=40;i+=5){
            fahrenheit = i;
            centigrade =((float)5/9) *(fahrenheit-32);
            System.out.println(fahrenheit + " degrees fahrenheit is "+
        centigrade + " centigrade");
        }
        System.out.println("While loop starts here.");
        float temp = 0;
        while(temp <= 40){
            centigrade =((float)5/9) *(temp-32);
            System.out.println(temp + " degrees fahrenheit is "+
        centigrade + " centigrade");
        temp += 5;
        }
    }
}