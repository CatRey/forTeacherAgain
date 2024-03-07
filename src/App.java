    import java.util.ArrayList;
    import java.util.Scanner;

    public class App {
        public static int[] buble(int len, int[] a){
            for(int i=1;i<len;i++){
                for(int j = 0;j<len-i;j++){
                    if(a[j]>a[j+1]){
                        int t = a[j];
                        a[j]=a[j+1];
                        a[j+1]=t;
                    }
                }
            }
            return a;

        }
        public static int[] ins(int len,int[] a){
            for(int i=1;i<len;i++){
                int now = a[i];
                int key = i-1;
                while (key>=0 && a[key]>now){
                    a[key+1]=a[key];
                    --key;
                }
                a[key+1]=now;
            }
            return a;
        }
        public static void quick(int[] a,int l,int r){
            if(a.length==0 || l>=r){
                return;
            }
            int c = l + (r-l)/2;
            int o = a[c];
            int i=l,j=r;
            while(i<=j){
                while(a[i]<o){
                    i++;
                }
                while(a[j]>o){
                    j--;
                }
                if(i<=j){
                    int t = a[i];
                    a[i]=a[j];
                    a[j]=t;
                    i++;
                    j--;
                }

            }
            if(l<j){
                quick(a, l, j);
            }
            if(r>i){
                quick(a, i,r);
            }
        }
        public static void main(String[] args){
            int[] a = new int[10000];
            for(int i=0;i<a.length;i++){
                a[i]=80-i;
            }
           long q =  System.nanoTime();
            quick(a,0,a.length-1);

            for(int i=0;i<a.length;i++){
                System.out.print(a[i]+" ");
                
            }
            System.out.println(System.nanoTime()-q);
            
        }
    }
