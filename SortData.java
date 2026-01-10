package Practical_01;

public class SortData{
	
    
    void asec(int a,int b, int c){
    int temp;
    if(a>b){temp=a;a=b;b=temp;}
    if(a>c){temp=a;a=c;c=temp;}
    if(b>c){temp=b;b=c;c=temp;}

    System.out.println("Ascending Order:" + a + " " + b + " " + c);
}

    void desc(int a, int b, int c){
    int temp;

    if(a<b){temp=a;a=b;b=temp;}
    if(a<c){temp=a;a=c;c=temp;}
    if(b<c){temp=b;b=c;c=temp;}

    System.out.println("Descending Order:" + a + " " + b + " " + c);
}

public static void main(String[] args){
    SortData obj = new SortData();
    obj.asec(12, 5, 8);
    obj.desc(12, 5, 8);
}
}

