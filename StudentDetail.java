// Here is an program to print the name of student.//

class StudentDetail{
public static void main(String args[]){
    int[] StudentDetail=new int[6];
StudentDetail[0]=1;
StudentDetail[1]=2;
for(int i=0;i<6;i++)
{
    if(StudentDetail[i]==1)
    {
        System.out.println("Ajay dhakal");
    }
    else if(StudentDetail[i]==2){
        System.out.println("milan dhakal");
    }
    else if(StudentDetail[i]==3){
        System.out.println("rohit dhakal");
    }
    else{
        System.out.println("not found");
    }
}
}
}