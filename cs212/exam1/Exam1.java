public class Exam1 {
    public static void main(String[] args) {
        int left, right,sum,product;
        try {
            if(args.length<2){
                throw new IllegalArgumentException("Not enough params.");
            }
        } catch (IllegalArgumentException e) {
           System.out.println(e.getMessage());
           System.exit(0);
        }
        left = Integer.parseInt(args[0]);
        right = Integer.parseInt(args[1]);
        sum = left+ right;
        product = left*right;
        System.out.println(left + " + "+ right +" = "+ sum);
        System.out.println(left + " * "+ right +" = "+ product);
    }
}
