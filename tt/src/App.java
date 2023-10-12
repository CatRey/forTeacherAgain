public class App {
    public static void main(String[] args){
        char[] a={'a','b','y','z'};
        System.out.println(p(a,2));
    }
    public static char[] p(char[] a, int n){
        for(int i=0;i<a.length;i++){
            int now=(int)a[i];
            now+=n;
            int k=now-97;
            if(k<0){
                a[i]=(char)(122+k);
            }
            else if(k>25){
                a[i]=(char)(97+(k%26));
            }
            else{
                a[i]=(char)(97+k);
            }
        }
        return a;
    }
}
