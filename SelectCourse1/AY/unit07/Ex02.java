public class Ex02 {
     static int[] Intersection(int[] A, int[] B){
int [] C={0};
int len=0;
int k=0;
if((A.length)>B.length){
    len=((A.length));
}
else len=((A.length));

for(int i=0; i<len; i++){
    for(int j=0; j<len; j++){
        if(A[i]==B[j]){
        C[k]=A[i];
        k++;
        }
    }
}
return C;
     }
}
