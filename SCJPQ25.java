public class SCJPQ25 {

public long doMethod(int a){ return a*2; } //1

public int doMethod(int a){ return a; } //2

public static void main(String[] args) {

long i = 0;

i = new SCJPQ25().doMethod(5);

System.out.println( i );

}

}