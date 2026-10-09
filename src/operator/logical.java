package operator;

public class logical {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int i=10;
//		i++; //11
//		
//		System.out.println(i--);   //p11 u10
//		System.out.println(++i);   //p11 u11
//		i--;//10
//		i++;//11
//		System.out.println(i--);  //p11 u10
//		i++;//11
//		System.out.println(i);
		
		
//		int i = 10;
//
//		i++;  //11
//		++i;  //12
//		i--;  //11
//		--i;  //10
//		++i;  //11
//		i++;  //12
//		i--;  //11
//		++i;  //12
//
//		System.out.println(i);
		
		
        int i = 5;

        System.out.println(i++);  //p5 u6
        System.out.println(++i);  //7
        System.out.println(i--);  //p7 u6
        System.out.println(--i);  //5 

        int a = i++;  //a=5 i=6
        int b = ++i;  //b=7 i=7

        System.out.println(a);  //5
        System.out.println(b);  //7

        int c = --i;  //c=6 i=6 
        int d = i--;  //d=6 i=5

        System.out.println(c);  //6
        System.out.println(d);  //6

        ++i;  //p=6 u=6
        i++;  //p=6 u=7
        --i;  //p=6 u=6

        System.out.println(i);  //6


		

	}

}
