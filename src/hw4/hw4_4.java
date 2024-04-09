package hw4;
//班上有8位同學,他們進行了6次考試結果如下:
//		1號	2號	3號	4號	5號	6號	7號	8號
//	1考	10	35	40	100	90	85	75	70
//	2考	37	75	77	 89	64	75	70	95
//	3考 100	70	79	 90	75	70	79	90
//	4考	77	95	70	 89	60	75	85	89	
//	5考	98	70	89	 90	75	90	89	90
//	6考	90	80 100	 75 50	20	99	75


//請算出每位同學考最高分的次數
////(提示:二維陣列)
public class hw4_4 {
	public static void main(String[] args) {
		int[] run1 = {10,35,40,100,90,85,75,70};
		int[] run2 = {37,75,77,89,64,75,70,95};
		int[] run3 = {100,70,79,90,75,70,79,90};
		int[] run4 = {77,95,70,89,60,75,85,89};
		int[] run5 = {98,70,89,90,75,90,89,90};
		int[] run6 = {90,80,100,75,50,20,99,75};
		int max1 =0,max2=0,max3=0,max4=0,max5=0,max6=0;
		int j=0;
//		int cunt1=0,cunt2=0,cunt3=0,cunt4=0,cunt5=0,cunt6=0;
		for( int i =0;i<run1.length;i++) {
			if(run1[i]>max1) {
				max1 = run1[i];
				j=i;
			}
		}
		System.out.println("第一考"+(j+1));
		for( int i =0;i<run2.length;i++) {
			if(run2[i]>max2) {
				max2 = run2[i];
				j=i;
			}
		}
		System.out.println("第二考"+(j+1));
		for( int i =0;i<run3.length;i++) {
			if(run3[i]>max3) {
				max3 = run3[i];
				j=i;
			}
		}
		System.out.println("第三考"+(j+1));
		for( int i =0;i<run4.length;i++) {
			if(run4[i]>max4) {
				max4 = run4[i];
				j=i;
			}
		}
		System.out.println("第四考"+(j+1));
		for( int i =0;i<run5.length;i++) {
			if(run5[i]>max5) {
				max5 = run5[i];
				j=i;
			}
		}
		System.out.println("第五考"+(j+1));
		for( int i =0;i<run6.length;i++) {
			if(run6[i]>max6) {
				max6 = run6[i];
				j=i;
			}
		}
		System.out.println("第六考"+(j+1));
		switch(j+1) {
		
		}
		System.out.println("===========================================================");
		int[][] Arr={
				{10,35,40,100,90,85,75,70},
				{37,75,77,89,64,75,70,95},
				{100,70,79,90,75,70,79,90},
				{77,95,70,89,60,75,85,89},
				{98,70,89,90,75,90,89,90},
				{90,80,100,75,50,20,99,75},
				};
		
		
		
		
		int cunt,cunt2 ;
		int max ;
		for(int i= 0;i<6;i++) {
			cunt=0;
			cunt2=0;
			max=0;
			for(int g =0;g<8;g++) {
				
				if(Arr[i][g]>max) {
					max =Arr[i][g];
					cunt2=g;
					
				}
				
				if(cunt==7) {
					System.out.println(max+"a"+(cunt2+1));
					}
				else {cunt+=1;};
				
			}
			
		}
	}
}
