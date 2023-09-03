//23.09.01 yookyung lee
//백준 1271번 엄청난 부자2

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt(); //공백 기준으로 숫자 입력받음
        
        System.out.println(n/m);
        System.out.println(n%m);
    }
}
