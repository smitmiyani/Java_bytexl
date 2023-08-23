public class Add {
int my;
int by;
void setmyby (int xy, int hy) {
my=xy;
by=hy;
}
}
class b extends Add {
int total;
void sum () {
public static void main (String[] args ) {
b subOb= new b ( );
subOb. setmyby (10, 12);
subOb. sum ( ) ;
System.out.println("total =" + subOb. total);
}
} 