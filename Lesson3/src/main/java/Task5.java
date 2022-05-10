public class Task5 {
    public static void main(String[] args) {
        System.out.println("""
          byte    short	  char	   int 	   long	    float   double  boolean
byte       t       ny      y       ny       ny       ny      ny      x
short      y       t       y       ny       ny       ny      ny      x
char       y       y       t       ny       ny       ny      ny      x
int        y       y       y       t        ny       ny      ny      x
long       y       y       y       y        t        ny      ny      x
float      y       y       y       y        y        t       ny      x
double     y       y       y       y        y        y       t       x
boolean    x       x       x       x        x        x       x       t
                                  """);
//    ny (неявное) – если преобразование происходит автоматически,
//    n (явное) – если нужно использовать явное преобразование,
//    x – если преобразование невозможно,
//    t  - если преобразование тождественно.
    }
}
