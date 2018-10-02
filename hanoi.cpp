 #include<iostream>
 
 using namespace std;
 
 
  void hanoi(int discos, int torre1,int torre2,int torre3)
  {
	  	if(discos==1)
	  	{
	  		cout<<"mueva el disco de la torre "<<torre1<<" a la torre "<<torre3<<endl;
		}
		  
		  else
		 {
		  	hanoi(discos-1,torre1,torre3,torre2);
		  	cout<<"mueva el disco de la torre "<<torre1<<" a la torre "<<torre3<<endl;
		  	hanoi(discos-1,torre2,torre1,torre3);
		}
  
  }
 
 int main()
 
 {  int discos=0;
    
 	cout<<"digite la cantidad de discos: ";cin>>discos;
 	hanoi(discos,1,2,3);
 	return 0;
 }
