import java.util.*;

public class StringCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String value = sc.nextLine();
        String[] values = value.split(" ");
//        values = 2+3*4 일때 계산 결과가 나오도록
        List<String> symbol = new LinkedList<>();
        symbol.add("+");
        symbol.add("-");
        symbol.add("*");
        symbol.add("/");

        List<Integer> nums = new LinkedList<>();
        for (String str : values){
            if (symbol.contains(str)){
                continue;
            }
            nums.add(Integer.parseInt(str));
        }

        System.out.println(nums);





    }

}
